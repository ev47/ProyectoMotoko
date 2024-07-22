
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import sudoku.Casilla;
import sudoku.MenuPrincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edgva
 */
public class juego extends JFrame{
    final int filas=9;
    final int columnas=9;
    Casilla Tablero[][];
    JPanel panelTablero;
    
    // inicializacion de cada casilla 
    ArrayList<Casillas>cuadrante1;
    ArrayList<Casillas>cuadrante2;
    ArrayList<Casillas>cuadrante3;
    ArrayList<Casillas>cuadrante4;
    ArrayList<Casillas>cuadrante5;
    ArrayList<Casillas>cuadrante6;
    ArrayList<Casillas>cuadrante7;
    ArrayList<Casillas>cuadrante8; 
    ArrayList<Casillas>cuadrante9; 
    
    public juego (){
        //instanciar el array 
        cuadrante1=new ArrayList<Casilla>();
        cuadrante2=new ArrayList<Casilla>();
        cuadrante3=new ArrayList<Casilla>();
        cuadrante4=new ArrayList<Casilla>();
        cuadrante5=new ArrayList<Casilla>();
        cuadrante6=new ArrayList<Casilla>();
        cuadrante7=new ArrayList<Casilla>();
        cuadrante8=new ArrayList<Casilla>();
        cuadrante9=new ArrayList<Casilla>();
        setMinimumSize(new Dimension(800, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // boton Regreso
         JPanel panelBotones = new JPanel(); // Crear un nuevo panel para los botones
         JToggleButton botonRegresar = new JToggleButton("Regresar");
          botonRegresar.addActionListener(e -> MenuPrincipal());
         panelBotones.add(botonRegresar); 
         add(panelBotones, BorderLayout.NORTH);
     
        panelTablero = new JPanel();
        add(panelTablero);
        panelTablero.setLayout(new GridLayout(filas, columnas));
           
    }
    private void MenuPrincipal(){
     int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres regresar al menú principal?\n"
                + "Tu progreso actual se perderá.",
                "Confirmar regreso",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            dispose(); // Cierra la ventana actual
           MenuPrincipal men=new MenuPrincipal();
           men.setVisible(true);
        }   
    }
    private void GuardarenCuadrante() {
      int fila= Casilla.getFil
      int columna=
     }
    
     }
