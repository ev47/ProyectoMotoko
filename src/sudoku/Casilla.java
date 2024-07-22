/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;

import javax.swing.*;
import java.awt.Color;

public class Casilla {
    private int fila;
    private int columna;
    
    private JButton button;
    private boolean puedecambiar=true;
    
    
    
    public Casilla() {
        this.fila = 0;
        this.columna = 0;
    }
    
    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.button = new JButton(); // Crear un nuevo JButton
        button.setBorder(BorderFactory.createLineBorder(Color.black));
        button.setOpaque(true);
    }
    
    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public JButton getButton() {
        return button;
    }
    
    public int getnumeroActual() {
        if (button.getText().equals("")) return -1;        
        return Integer.parseInt(button.getText());
    }
    
    public void setnumeroActual(int num) {
        if (num == 0) {
            button.setText("");
            return;
        }        
        button.setText("" + num);
    }  
    public boolean puedeCambiar() {
        return puedecambiar;
    }
    
    public void setPuedeCambiar(boolean puedecambiar) {
        this.puedecambiar = puedecambiar;
    }

    
}
