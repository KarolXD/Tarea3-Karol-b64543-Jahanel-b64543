/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3KarolYJaha;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author karol
 */
public class Lienzo extends javax.swing.JPanel implements Runnable {
//int x=getWidth()/4;
int x, c, d, y;

    Thread hilo;
    String sentido = "D";
    String sentido2 = "Al";

    String sentido3 = "I";
    String sentido4 = "A";
    Thread thread= new Thread();
    /**
     * Creates new form Lienzo
     */
    public Lienzo() {
        initComponents();
        try{
            x=0;
            c=450;
            d=0;
            y=0;
      
        hilo= new Thread(this);
       
        }catch(Exception e){ System.out.println("ERROR CONTRUCTOR");}
    }
    public void paint(Graphics g) {
        ///repinta la figura
        g.setColor(getBackground());//Asignamos un color para que se repinte nuestra imagen de fondo
        g.fillRect(0, 0, getWidth(), getHeight());//dibujamos un rectangulo relleno en las posicion 0 0 y un ancho del JPanel y altura
        g.setColor(Color.blue);//asignamos un color
        g.fillRect(x, y, 50, 50);// DIBUJAMOS LA FIGURA EN LA POSICION X Y Y Y LE PONEMOS un tamano a la figura y un ancho

        //CIRCULO
        g.setColor(Color.red);//asignamos un color
        g.fillOval(c, d, 50, 50);// DIBUJAMOS LA FIGURA EN LA POSICION X Y Y Y LE PONEMOS un tamano a la figura y un ancho

    }
    
    ///ANIMACION A LA FIGURA//
   public void run() {
        try {
            while (true) {//mientras sea verdad
                
         
//metodos para el desplazamiento de la figura cuadrada
//sendito de la derecha


                if (sentido == "D") {
                    thread.sleep(1);
                    x++;
                    repaint();
                }

                //sentido de la izquierda
                if (sentido == "I") {
                    thread.sleep(1);
                    x--;
                    repaint();
                }

                //cuando es igual al tamano cambie de valor sentido, y rebote a una distancia de 50
                if (x >= getWidth() - 50) {
                    sentido = "I";
                }
                if (x <= 0) {
                    sentido = "D";
                }

                //para que no se salga de lo bordes verticales
                if (sentido2 == "Al") {
                    thread.sleep(1);
                    y++;
                    repaint();
                }
                if (sentido2 == "A") {
                    thread.sleep(1);
                    y--;
                    repaint();
                }
                 //cuando es igual al tamano cambie de valor sentido, y rebote a una distancia de 50
                if (y >= getHeight() - 50) {
                    sentido2 = "A";
                }
                if (y <= 0) {
                    sentido2 = "Al";
                }
                
                /////////////////////////////
                //metodos para el desplazamiento de la figura redonda
                if (sentido3 == "I") {
                    thread.sleep(1);
                    c--;
                    repaint();
                }
                if (sentido3 == "D") {
                    thread.sleep(1);
                    c++;
                    repaint();
                }
                if (c >= getWidth() - 50) {
                    sentido3 = "I";
                }
                if (c <= 0) {
                    sentido3 = "D";
                }

                if (sentido4 == "A") {
                   thread.sleep(1);
                    d++;
                    repaint();
                }
                if (sentido4 == "Al") {
                    thread.sleep(1);
                    d--;
                    repaint();
                }
                if (d >= getHeight() - 50) {
                    sentido4 = "Al";
                }
                if (d <= 0) {
                    sentido4 = "A";
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    public void inicio(){
    hilo.start();//COMIENCE EL HILO
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
