/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.implementation;

/**
 *
 * @author ghm8mog
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int digits = in.nextInt();
        //System.out.println("digits: "+digits);
        float p = 0;
        float n = 0;
        float z = 0;
        for(int i=0;i<digits;i++){
            float t = in.nextFloat();
            if(t > 0){
                p++;
            } else if(t < 0){
                n++;
            } else {
                z++;
            }
        }
        System.out.println(p/digits);
        System.out.println(n/digits);
        System.out.println(z/digits);
        
        
    }
    
    
    
}
