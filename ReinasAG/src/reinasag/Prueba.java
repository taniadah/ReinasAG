/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reinasag;
import java.util.*;
import java.awt.*;

/**
 *
 * @author tania
 */
public class Prueba {

    public static void main(String args[]) {
        ArrayList<Individuo> individuos;
        Individuo i1 = new Individuo(4);
        System.out.println(i1.toString());

        Individuo i2 = new Individuo(4);
        System.out.println(i2.toString());
        
        Individuo i3 = new Individuo(4);
        System.out.println(i3.toString());




        individuos = new ArrayList<Individuo>();
        individuos.add(i1);
        individuos.add(i2);
        individuos.add(i3);

        //double x = 1.0;
        //double y = 1.0;
        //FuncionAptitud fa = new FuncionAptitud();
         //Individuo ind;

       System.out.println("---------------------");
       for(Individuo ind2:individuos){
           System.out.println(ind2.toString());
       }


        //indAux.init();
        //System.out.println(indAux.toString());
        //int aptitud = fa.evaluar(indAux.puntosR);
        //System.out.println("Aptitud: "+ aptitud);
       // double r = Math.hypot(x, y);    }


        //double aRad = Math.atan2(y, x);
        //double a = Math.toDegrees(aRad);
        //System.out.println("a = " + a + "º");
        //prueba.add(new Point(12, 34));
        //prueba.add(new Point(32,12));
        //Point p = new Point(11, 34);
        //boolean pa = prueba.contains(p);
         //System.out.println(pa);


    }
}
