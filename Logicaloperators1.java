/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.logicaloperators1;

/**
 *
 * @author user
 */
public class Logicaloperators1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println ((1<2) && (2<3));//true
        System.out.println ((1<2) && (2>3)); //false 
        System.out.println ((1>2) && (2>3)); //false 
        System.out.println ((1<2) && (2<3)); //false 
        System.out.println();
        System.out.println ((3<4) || (4<5)); //true
        System.out.println ((3<4) || (4>5)); //true 
        System.out.println ((3>4) || (4<5)); //true 
        System.out.println ((3>4) || (4>5)); //false 
        System.out.println();
        System.out.println (!(4<5)); //false 
        System.out.println (!(5>6)); //false
    }
}
