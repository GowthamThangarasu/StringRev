/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringrevs;

import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class StringRevs {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);System.out.println("Enter the String");
   String g=sc.nextLine();
        String re = new StringBuffer(g).reverse().toString();
        System.out.println("After procss    "+re);
    }
    
}
