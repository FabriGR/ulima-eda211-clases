/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia01;

/**
 *
 * @author JC
 */
public class Prob08 {
    //{1, 2, 3, 10} --> 
    
    public static void showPrimes(int[] numbers){
        int countPrimes = 0;
        int countNonPrimes = 0;
        //Recorremos el array
        for(int i = 0; i < numbers.length; i++){
            //Verificamos si el elemento "i" es primo
            if(isPrime(numbers[i]) == true){
                //Numero es primo
                countPrimes = countPrimes + 1;
            }else{
                //Numero no es primo
                countNonPrimes = countNonPrimes + 1;
            }
        }
        System.out.println("Cantidad de primos: " + countPrimes);
        System.out.println("Cantidad de compuestos: " + countNonPrimes);
    }
    
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count = count + 1;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        int[] numbers = {2, 5, 88, 13, 17, 200};
        showPrimes(numbers);
    }        
    
}
