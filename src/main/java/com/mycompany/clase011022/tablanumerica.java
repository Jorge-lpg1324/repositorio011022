/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.clase011022;

/**
 *
 * @author jorge
 */

import java.util.Scanner;

public class tablanumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
int numeros = 64;
        int tablero [][] = new int [8][8];
        boolean ruta = true;
        
        for (int i = 0; i < tablero.length; i++) {
       
            
            if (ruta) {
            for(int j = tablero[i].length-1; j>= 0; j--) {
               
                tablero[i][j] = numeros;
                numeros--;
                
            }
            ruta = false;
            } else {
                for (int j = 0; j < tablero[i].length; j++) {
               
                tablero[i][j] = numeros;
                numeros--;
                
                
            }
                ruta = true;
            }
          
        }
        
        
        
    //imprimir
        for (int i = 0; i < tablero.length; i++) {
             System.out.println("-------------------------------------------------");
             System.out.println("|-----|-----|-----|-----|-----|-----|-----|-----|");
            for (int j = 0; j < tablero[i].length; j++) {
                
                if (tablero[i][j]>=10) {
                    System.out.print("|   "+tablero[i][j]);
                   
                }else{
                System.out.print("|    "+tablero[i][j]);
                
                }
                
                
                
            }
            System.out.print("|");
            System.out.println("");
            
        }
    }
    
}
