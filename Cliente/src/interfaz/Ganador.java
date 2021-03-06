/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Personal
 */
public class Ganador extends javax.swing.JFrame {

    /**
     * Creates new form Ganador
     */
    
    private static AudioClip sonido;
    
    public Ganador() {
        initComponents();
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/Crash-Song.wav"));
        sonido.play();
        setInit();
    }
    
    public void setInit(){
         setIconImage(new ImageIcon(getClass().getResource("/Imagenes/punto.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon imagen;
        // Creo la imagen de fondo rojo.
        imagen = new ImageIcon(this.getClass().getResource("/Imagenes/azulImagen.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(imagen);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, imagen.getIconWidth(), imagen.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
        this.setSize(fondo.getWidth(), fondo.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombreGanador = new javax.swing.JLabel();
        nombreJugadorActual = new javax.swing.JLabel();
        cantidadCartasRivalUno = new javax.swing.JLabel();
        nombreRivalDos = new javax.swing.JLabel();
        cantidadCartasJugadorActual1 = new javax.swing.JLabel();
        nombreRivalUno1 = new javax.swing.JLabel();
        cantidadCartasRivalUno2 = new javax.swing.JLabel();
        nombreRivalTres = new javax.swing.JLabel();
        cantidadCartasRivalUno3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonFinal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel1.setText("El ganador es: ");

        nombreJugadorActual.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        cantidadCartasRivalUno.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        nombreRivalDos.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        cantidadCartasJugadorActual1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        nombreRivalUno1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        cantidadCartasRivalUno2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        nombreRivalTres.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        cantidadCartasRivalUno3.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel2.setText("Gracias por Jugar");

        botonFinal.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        botonFinal.setText("CONGRATULATIONS");
        botonFinal.setFocusable(false);
        botonFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(nombreGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreRivalTres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreRivalDos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreRivalUno1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addComponent(nombreJugadorActual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantidadCartasRivalUno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadCartasJugadorActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadCartasRivalUno2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadCartasRivalUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreGanador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreJugadorActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadCartasJugadorActual1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantidadCartasRivalUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreRivalUno1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreRivalDos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadCartasRivalUno2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantidadCartasRivalUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreRivalTres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setGanador(String pGanador){
        nombreGanador.setText(pGanador);
    }
    
    public void setJugador(String pJugador, String cantCartas){
        nombreJugadorActual.setText(pJugador);
        cantidadCartasJugadorActual1.setText(cantCartas);
    }
    
    public void setJugadorUno(String jugadorUno, String cantCartas){
        nombreRivalUno1.setText(jugadorUno);
        cantidadCartasRivalUno.setText(cantCartas);
    }
    
    public void setJugadorDos(String jugadorDos, String cantCartas){
        nombreRivalDos.setText(jugadorDos);
        cantidadCartasRivalUno2.setText(cantCartas);
    }
    
    public void setJugadorTres(String jugadorTres, String cantCartas){
        nombreRivalTres.setText(jugadorTres);
        cantidadCartasRivalUno3.setText(cantCartas);
    }
    
    public void actualizarPantalla(){ 
        this.update(this.getGraphics());
    } 
    
    private void botonFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalActionPerformed
        sonido.stop();
        this.dispose();
    }//GEN-LAST:event_botonFinalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFinal;
    private javax.swing.JLabel cantidadCartasJugadorActual1;
    private javax.swing.JLabel cantidadCartasRivalUno;
    private javax.swing.JLabel cantidadCartasRivalUno2;
    private javax.swing.JLabel cantidadCartasRivalUno3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombreGanador;
    private javax.swing.JLabel nombreJugadorActual;
    private javax.swing.JLabel nombreRivalDos;
    private javax.swing.JLabel nombreRivalTres;
    private javax.swing.JLabel nombreRivalUno1;
    // End of variables declaration//GEN-END:variables
}
