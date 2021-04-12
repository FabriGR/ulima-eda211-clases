/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.clases.introduccion;

/**
 *
 * @author JC
 */
public class Ejercicio01 {
    public static int getAverage(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        int avg = sum / 3;
        if(sum % 3 == 2){ 
            avg = avg + 1;
        }        
        return avg;
    }
    
    public static void main(String[] args){
        int n1 = 12, n2 = 16, n3 = 15;
        int ans = getAverage(n1, n2, n3);
        System.out.println("El promedio es: " + ans);
    }
}
