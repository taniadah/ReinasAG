/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reinasag;
//import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.util.*;
//import java.awt.geom.*;
//import java.io.*;
/**
 *
 * @author tania
 */
public class Individuo {
    int tam;
    public ArrayList<Point> puntosR = new ArrayList<Point>();

    public ArrayList<Point> getPuntos(){
        return this.puntosR;
    }
    public void setPuntos(ArrayList<Point> puntosR){
        this.puntosR = puntosR;
    }

     public void setTam(int tam){
       this.tam = tam;
   }
   public int getTam(){
       return this.tam;
   }
    public Individuo(int numR){
        ArrayList<Point> aux = new ArrayList<Point>();
        //puntosR = new ArrayList<Point>();
        setTam(numR);
        Random r = new Random();
        Point auxP;
        boolean ver;
        for(int i = 0; i<numR; i++){
            ver = true;
            while(ver){
                int x = r.nextInt(numR);
                int y = r.nextInt(numR);
                auxP = new Point(x,y);
                ver = aux.contains(auxP);
                if(!ver){
                  aux.add(auxP);
                }
            }
        }
        setPuntos(aux);
    }

    public Individuo(ArrayList<Point> padre, ArrayList<Point> madre, int numR){
        setTam(numR);
        cruza(padre, madre);
        //init2(padre, madre);
    }

    public void init(){
        //System.out.println("Inicia");
        Random r = new Random();
        ArrayList<Point> aux = new ArrayList<Point>();
        Point auxP, auxC;
        int nr = getTam();
        boolean ver;
        for(int i = 0; i<nr; i++){
            ver = true;
            while(ver){
                int x = r.nextInt(nr);
                int y = r.nextInt(nr);
                auxP = new Point(x,y);
                ver = aux.contains(auxP);
                if(!ver){
                    aux.add(auxP);
                }
            }
        }
        setPuntos(aux);
    }

    public void init2(ArrayList<Point> padre, ArrayList<Point> madre){
       cruza(padre, madre);
    }

    public void cruza(ArrayList<Point> padre, ArrayList<Point> madre){
        int auxMit = getTam()/2;
        if(getTam()%2 == 1){
            auxMit+=1;
        }
        ArrayList<Point> aux = new ArrayList<Point>();
        for(int i = 0; i<auxMit; i++){
            aux.add(padre.get(i));
        }
        for(int i = auxMit; i<getTam(); i++){
            aux.add(madre.get(i));
        }
        this.puntosR = aux;
    }

    public void mutar(){
        Random r = new Random();
        boolean ver = true;
        // System.out.println("ANTES");
        //System.out.println(getCadena());
        int x, y;
        Point p;
        int indCam = r.nextInt(getTam());
        while(ver){
            x = r.nextInt(getTam());
            y = r.nextInt(getTam());
            p = new Point(x,y);
            ver = puntosR.contains(p);
            if(!ver){
                this.puntosR.set(indCam, p);
            }
        }

    }

    public String toString(){
        int nr = getTam();
        String texto="Individuo: "+"\n";
        //System.out.println(puntosR.size());
        for(Point p: this.puntosR){
           texto+="("+p.getX()+","+p.getY()+")\n";
        }
        return texto;
    }
}
