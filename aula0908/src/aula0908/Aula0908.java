/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0908;

/**
 *
 * @author isaac.neckel
 */

import java.util.Scanner;

public class Aula0908 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe dados: ");
        a = input.nextInt();
        System.out.println("Informação inserida é " + a);
        
        switch(a){
            
            case 1:
                System.out.println("Informação inserida é 1");
                break;
                
            case 2:
                System.out.println("Informação inserida é 2");
                break;
                
            case 3:
                System.out.println("Informação inserida é 3");
                break;
        
    }
                
    }
    
}
