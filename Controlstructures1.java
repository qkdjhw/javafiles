/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.controlstructures1;

/**
 *
 * @author user
 */
public class Controlstructures1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int score=30;
        if (score==90)
        {
           System.out.println("student has scored above average");
        }
        else if(score==75)
        {
            System.out.println("student has scored 75%");
        }
        else if (score==50)
        {
            System.out.println("student passed their exam");
        }
        else
        {
            System.out.println ("student has failed their exam");
        }
        
    }
}
