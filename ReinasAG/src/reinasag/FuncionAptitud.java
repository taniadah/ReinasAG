/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reinasag;

import java.awt.*;
import java.util.*;
/**
 *
 * @author tania
 */
public class FuncionAptitud {
    //public int aptitud=0;
    public ArrayList<Point> reinas;

    public FuncionAptitud(){
        //int aptitud;
        //this.reinas = reinas;
    }

    public int evaluar(ArrayList<Point> reinas){
        this.reinas = reinas;        
        int aptitud;
        aptitud = verificarLados();
        return aptitud;
    }
        public int verificarLados(){

        int cont = 0;
        int x1, y1, x2, y2, x, y, m;
        double angulo;
        Point p1, p2;
        ArrayList<Point> aux = this.reinas;

        for(int i = 0; i < aux.size(); i++){
            p1 = aux.get(i);
            x1 = (int)p1.getX();
            y1 = (int)p1.getY();
            //System.out.println("Primer for: "+i);
            for(int j = 0; j<aux.size(); j++){
                if(j!=i){
                   p2 = aux.get(j);
                   x2 = (int)p2.getX();
                   y2 = (int)p2.getY();
                   x = x1 - x2;
                   y = y1 - y2;
                   if(x == 0 || y == 0){
                       cont+=1;
                   }else{
                       //System.out.println("x1: "+x1+" y1: "+y1);
                       //System.out.println("x2: "+x2+" y2: "+y2);
                       cont+=calculaAngulo(x, y);
                   }
                }
            }
        }
        return cont;
    }

    public int calculaAngulo(int x, int y){
      int cont=0;
      double aRad = Math.atan2(y, x);
      double a = Math.toDegrees(aRad);
      if(a==45.0 || a==-45 || a==135.0 || a==-135.0){
          //System.out.println("Si");
          cont+=1;
      }
      return cont;
    }
}
