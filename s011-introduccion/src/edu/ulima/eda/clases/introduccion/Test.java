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
public class Test {
    public static void main(String[] args){
        int[] valores = {1, 2, 3, 4};
        System.out.println(valores[0]);
        valores[1] = valores[1] + 1;
        System.out.println(valores[1]);
        
        
        int[] notas = new int[10];
        notas[0] = 14;
        System.out.println(Arrays.toString(notas));                
    }
}
