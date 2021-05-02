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
public class Prob03 {
    
    public static boolean isPalindrome(int A[], int k){
        int start = 0;
        int end = A.length - 1;
        int count = 0;
        while(start <= end){
            if(A[start] != A[end]){
                count = count + 1;
            }
            start = start + 1;
            end = end - 1;
        }
        if(count >= k){
            return false;
        }else{
            return true;
        }
    }
    
    public static void main(String[] args){
        int[] A = {2, 3, 3, 2};
        int k1 = 1;
        System.out.println(Arrays.toString(A) + " -> " + isPalindrome(A, k1));
        
        int[] B = {1, 2, 3, 3, 2, 5};
        int k2 = 2;
        System.out.println(Arrays.toString(B) + " -> " + isPalindrome(B, k2));
    }
}
