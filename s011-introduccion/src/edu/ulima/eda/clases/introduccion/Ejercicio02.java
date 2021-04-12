/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.clases.introduccion;

import java.util.Arrays;

/**
 *
 * @author JC
 */
public class Ejercicio02 {
    public static int[] getOddEvenSum(int n){
        //Variables acumuladoras
        int sumOdd = 0;     //Suma impares
        int sumEven = 0;    //Suma pares
        
        //Recorrido en el intervalo [1, n]
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){ //es par
                sumEven = sumEven + i;
            }else{ //es impar
                sumOdd = sumOdd + i;
            }
        }
        //Respuesta
        int[] ans = {sumOdd, sumEven};
        return ans;
    }

    public static void main(String[] args){
        int n = 20;
        int[] ans = getOddEvenSum(n);
        System.out.println(Arrays.toString(ans));
    }
}
