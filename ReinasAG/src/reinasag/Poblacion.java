/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reinasag;
import java.util.*;
/**
 *
 * @author tania
 */
public class Poblacion {
    public ArrayList<Individuo> individuos;
    public int tamPob, tamInd;
    
    public void setTamPob(int tam){
        this.tamPob = tam;
    }

    public int getTamPob(){
        return this.tamPob;
    }

    public void setTamInd(int tam){
        this.tamInd = tam;
    }

    public int getTamInd(){
        return this.tamInd;
    }
    
    public Poblacion(int tamPob, int tamInd){
        setTamPob(tamPob);
        setTamInd(tamInd);
        generaPoblacion();
    }
    
    public void generaPoblacion(){
        //System.out.println("POBLACION "+ getTamInd());
        individuos = new ArrayList<Individuo>();
        for(int i = 0; i< getTamPob(); i++){
            individuos.add(new Individuo(getTamInd()));          
        }
        
        //System.out.println("FIN POBLACION");
    }    
    
    public void prueba(){
        System.out.println("Prueba");
        for(Individuo ind: individuos){
            System.out.println(ind.toString());
        }
    }
}
