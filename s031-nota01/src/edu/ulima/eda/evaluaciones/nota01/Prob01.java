/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.nota01;

/**
 *
 * @author JC
 */
public class Prob01 {
    public static void showNumbers(int A, int B){
        for(int i = A; i <= B; i++){
            //(3 cifras) y (multiplo de 3 o de 7) y (5 como ultima cifra)
            if((i >= 100 && i < 1000) && (i % 3 == 0 || i % 7 == 0) || (i % 10 == 5)){
                System.out.println(i);
            }
        }
        /**
         * Dado que la cantidad de veces que se ejecuta el bloque depende
         * linealmente de la cantidad de elementos del intervalo [A, B] 
         * que es B - A - 1. Podemos de cir que la complejidad sera O(B - A)        
        **/
    }
    
    public static void main(String[] args){
        showNumbers(12, 18);
    }
}
