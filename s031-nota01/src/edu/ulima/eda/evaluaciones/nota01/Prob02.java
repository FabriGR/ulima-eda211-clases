/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.evaluaciones.nota01;

import java.util.Arrays;

/**
 *
 * @author JC
 */
public class Prob02 {
    public static int[] merge(int[] A, int[] B){
        int[] ans = new int[A.length + B.length];
        int count = 0;
        for(int i = 0; i < A.length; i++){
            ans[count] = convert(A[i]);
            count = count + 1;
        }
        
        for(int i = 0; i < B.length; i++){
            ans[count] = convert(B[i]);
            count = count + 1;
        }
        //Para discutir: Implemente una version modificada que permita evitar
        //los bucles repetidos
        return ans;        
    }
    //Modifica el numero segun la condicion del ejercicio (para numeros primos)
    public static int convert(int N){
        if(isPrime(N)){
            return N * N;
        }else{
            return N;
        }
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
        int[] A = {10, 12, 7};
        int[] B = {3, 14, 26};
        int[] ans = merge(A, B);
        System.out.println(Arrays.toString(ans));
    }
}
