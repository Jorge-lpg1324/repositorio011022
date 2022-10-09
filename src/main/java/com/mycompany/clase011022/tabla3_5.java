/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.clase011022;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class tabla3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15;


Scanner cant = new Scanner(System.in);
        
        System.out.println("Por favor, a continuacion se solicita escriba 15 numeros distintos, ingrese el primero: ");
        
        n1 = cant.nextInt();
        
        System.out.println("Por favor ingrese el segundo numero: ");
        
        n2 = cant.nextInt();
        
        System.out.println("Por favor ingrese el tercer numero: ");
        
        n3 = cant.nextInt();
        
        System.out.println("Por favor ingrese el cuarto numero: ");
        
        n4 = cant.nextInt();
        
        System.out.println("Por favor ingrese el quinto numero: ");
        
        n5 = cant.nextInt();
        
        System.out.println("Por favor ingrese el sexto numero: ");
        
        n6 = cant.nextInt();
        
        System.out.println("Por favor ingrese el septimo numero: ");
        
        n7 = cant.nextInt();
        
        System.out.println("Por favor ingrese el octavo numero: ");
        
        n8 = cant.nextInt();
        
        System.out.println("Por favor ingrese el noveno numero: ");
        
        n9 = cant.nextInt();
        
        System.out.println("Por favor ingrese el decimo numero: ");
        
        n10 = cant.nextInt();
        
        System.out.println("Por favor ingrese el onceavo numero: ");
        
        n11 = cant.nextInt();
        
        System.out.println("Por favor ingrese el doceavo numero: ");
        
        n12 = cant.nextInt();
        
        System.out.println("Por favor ingrese el treavo numero: ");
        
        n13 = cant.nextInt();
        
        System.out.println("Por favor ingrese el catorceavo numero: ");
        
        n14 = cant.nextInt();
        
        System.out.println("Por favor ingrese el quinceavo numero: ");
        
        n15 = cant.nextInt();
               
        int tablero [][] = new int [3][5];
       
        tablero[0][0]=n1;
        tablero[0][1]= n2;
        tablero[0][2]= n3;
        tablero[0][3] = n4;
        tablero[0][4] = n5;
        tablero[1][0]= n6;
        tablero[1][1]= n7;
        tablero[1][2]= n8;
        tablero[1][3]= n9;
        tablero[1][4]= n10;
        tablero[2][0]=n11;
        tablero[2][1]=n12;
        tablero[2][2]=n13;
        tablero[2][3]=n14;
        tablero[2][4]=n15;
 
        
       
         for (int i = 0; i < tablero.length; i++) {
             System.out.println("-------------------------------");
             System.out.println("|-----|-----|-----|-----|-----|");
            for (int j = 0; j < tablero[i].length; j++) {
                
                if (tablero[i][j]>=5) {
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
