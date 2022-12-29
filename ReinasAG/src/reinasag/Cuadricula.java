/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reinasag;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.*;
/**
 *
 * @author tania
 */
public class Cuadricula extends JPanel{
    Rectangle rect = new Rectangle();
    public int numR;
               
    
    public Cuadricula(Graphics g, int xy, int numR, ArrayList<Point> puntos){       
        Graphics2D g2 = (Graphics2D) g;
        //g2.paint();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);       
        
        //g2.setBackground(new Color(153,153,153));
        
        g2.setColor(new Color(153,153,153));
        g2.fillRect(0, 0, xy, xy);
        
        g2.setColor(Color.GRAY);
        
        //crea tablero 
        int casillas = numR;
        int radio = (int)Math.floor(xy/casillas);
        //System.out.println(radio);
        
        for(int j = 0; j<casillas; j++){
            for(int i = 0; i < casillas; i++){
                if((j%2)!=0){
                    g2.fillRect(2*radio*i, radio*j, radio, radio);
                }
                if((i%2!=0)){
                    g2.fillRect(radio*i, 2*radio*j, radio, radio);
                }
            }
        }
         g2.setColor(new Color(153,153,153));

        for(int j = 0; j<casillas; j++){
            for(int i = 0; i < casillas; i++){
                if((j%2)==0){
                    g2.fillRect(2*radio*i, radio*j, radio, radio);
                }
                if((i%2==0)){
                    g2.fillRect(radio*i, 2*radio*j, radio, radio);
                }
            }
        }
                
        
        //remarcar contorno
        Stroke pincel = new BasicStroke(2f);
        g2.setColor(Color.BLACK);
        g2.setStroke(pincel);
        g2.drawRect(0, 0, xy-1, xy-1);
        
        //piezas
         ImageIcon iconoReina = new ImageIcon("C:\\Users\\JoseAntonio\\Documents\\Sistemas Expertos\\ReinasAG\\src\\reinasag\\imagenes\\reina.png");
         int x, y;
         for(Point p: puntos){
             x = (int)p.getX();
             y = (int)p.getY();
             g.drawImage(iconoReina.getImage(),radio*x,radio*y, radio, radio,null);
         }         
    }
}
