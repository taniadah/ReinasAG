/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reinasag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author tania
 */
public class AlgoritmoEvolutivo {
  private Poblacion pob, siguientePob;
  private FuncionAptitud fa = new FuncionAptitud();
  private int tamPob, tamInd, numGen, itMost, itMostI, itActual, numR;
  //private String cadEncontrar, primPob, ultiPob, textoSel;
 // private ArrayList<Double> aptitudes, ruleta;
  private ArrayList<Integer> aptitudes;
  private ArrayList<Individuo> padre, madre, cruzas;
  private ArrayList<Double> probabilidades;
  private ArrayList<Integer> indices;
  public Seleccion seleccion = new Seleccion();
  public Individuo elMejor, elMejorAnt;
  public boolean bandera = false;
  //public Poblacion poblaciones;

  public void setTamPob(int tam){
    this.tamPob = tam;
  }
  public int getTamPob(){
    return this.tamPob;
  }
   public void setNumG(int ng){
    this.numGen = ng;
  }
  public int getNumG(){
    return this.numGen;
  }
  public void setTamInd(int tam){
    this.tamInd = tam;
  }
  public int getTamInd(){
    return this.tamInd;
  }
  public void setNumR(int nr){
    this.numR = nr;
  }
  public int getNumR(){
    return this.numR;
  }

    public AlgoritmoEvolutivo(int tam, int numR, int nGen){
        setTamPob(tam);
        setTamInd(numR);
        setNumG(nGen);
    }

    public void inicializa(){
        //defineLim();
        pob = new Poblacion(getTamPob(), getTamInd());
        //primPob = pob.toString(getTamPob());

        for(int i = 0; i<getNumG(); i++){
            itActual = i;
            evolucion();
            System.out.println("Generacion: "+i);
            if(i>0){
              this.bandera = true;
            }
            //Interfaz.lblGenActual.setText(""+i);
            //
            //pob.individuos = cruzas;
            try{
                Thread.sleep(500);
            // System.out.println("Esperando");
            }catch(InterruptedException e ) {
                System.out.println("Thread Interrupted");
            }
        }
        System.out.println("Termina");
        Interfaz.btnLimpia.setEnabled(true);
    }
    public void muestraMejor(Individuo ind){
      int ap  = fa.evaluar(ind.getPuntos());
      System.out.println("Aptitud mejor: "+ap);
      Cuadricula c = new Cuadricula(Interfaz.p2.getGraphics(), Interfaz.p2.getWidth(),getTamInd(),ind.getPuntos());
      String texto = ind.toString();
      Interfaz.jtaElMejor.setText(texto);
    }
    public void evolucion(){
      //1. Evaluar individuos
      Poblacion poblacion= this.pob;
      //calculamos aptitudes
      //fa= new FuncionAptitud();
      aptitudes = new ArrayList<Integer>();
      int ap;


      for(int i=0; i<poblacion.individuos.size(); i++){
        ap = fa.evaluar(poblacion.individuos.get(i).getPuntos());
      //  System.out.println(poblacion.individuos.get(i).toString());
      //  System.out.println("aptitud individuo "+i+" = "+ap);
        aptitudes.add(ap);
      }

      //2.Seleccionar padres para cruza
      int mit = getTamPob()/2;
      if(mit%2 ==1){
        mit+=1;
      }
      indices = seleccion.seleccion(aptitudes, mit);
      // System.out.println("indices elegidos");
      //
      // for(int i: indices){
      //   System.out.println(i);
      // }

      //3. Generar hijos (cruza)
      cruzas = new ArrayList<Individuo>();

      for(int i = 0; i<indices.size()-1; i+=2){
        int idxPapa = indices.get(i);
        int idxMama = indices.get(i+1);
        //System.out.println("indice "+i);
        //System.out.println("idxM "+idxPapa);
        //System.out.println("idxP "+idxMama);

        Individuo papa = pob.individuos.get(idxMama);
        Individuo mama = pob.individuos.get(idxPapa);

        cruzas.add(new Individuo(papa.getPuntos(), mama.getPuntos(), getTamInd()));
        cruzas.add(new Individuo(mama.getPuntos(), papa.getPuntos(), getTamInd()));
      }

      //4. Mutar a Algunos
      int totalMutar = (int)(Math.ceil(cruzas.size()*0.1));
      //System.out.println("Mutar:"+totalMutar);
      int idx;
      Random r = new Random();
      for(int i = 0; i<totalMutar; i++){
        idx = r.nextInt(cruzas.size());
        cruzas.get(idx).mutar();
      }

      //5.Evaluar hijos
      //poblacion = this.pob;

      for(int i = 0; i<cruzas.size(); i++){
        poblacion.individuos.add(cruzas.get(i));
      }
      // System.out.println("SIZE: "+ pob.individuos.size());
     // FuncionAptitud();

     aptitudes = new ArrayList<Integer>();
     //int ap;
    // System.out.print("EVALUCACION DESPUES DE CRUZAR Y MUTAR");
     for(int i=0; i<poblacion.individuos.size(); i++){
      // ap = fa.evaluar(poblacion.individuos.get(i).getPuntos());
       aptitudes.add(fa.evaluar(poblacion.individuos.get(i).getPuntos()));
      // System.out.println(poblacion.individuos.get(i).toString());
      // System.out.println("aptitud individuo "+i+" = "+ap);

     }

     //6. ELITISMO
      ArrayList<Individuo> siguientePob = new ArrayList<Individuo>();

      int maximaAp = Collections.min(aptitudes);

      int idxMejor = aptitudes.indexOf(maximaAp);
      siguientePob.add(poblacion.individuos.get(idxMejor));
      //elMejor = pob.individuos.get(idxMejor).toString();
    //  System.out.println("TAMAno pob orig: "+getTamPob());
      indices = new ArrayList<Integer>();
      indices = seleccion.seleccion(aptitudes, getTamPob()-1);
    //  System.out.println("SIZE INDICES: "+ indices.size());
      for(int ind: indices){
        //System.out.println("IND "+ind);
        //System.out.println("SIZE: "+ pob.individuos.size());
        //System.out.println("SIZE2: "+indices.size());
        siguientePob.add(poblacion.individuos.get(ind));
      }
    //  System.out.println("TAMAÑO siguiente POB: "+siguientePob.size());
      pob.individuos = siguientePob;
      //System.out.println("SIZE: "+ pob.individuos.size());
      if(bandera){
        this.elMejorAnt = elMejor;
      }
      this.elMejor = siguientePob.get(0);

      plasmarInterfaz(this.elMejor);


    }

  public void plasmarInterfaz(Individuo ind){
        if(bandera){
          if(!this.elMejorAnt.getPuntos().equals(ind.getPuntos()))
              muestraMejor(ind);
        }else{
          muestraMejor(ind);
        }
  }

  public String alToString(){
    String texto = "";
    for(int i = 0; i<itMostI; i++){
      texto +=""+i+") " + Double.toString(aptitudes.get(i))+"\n";
    }
    return texto;
  }
}
