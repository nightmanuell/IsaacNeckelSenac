/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste0408;

/**
 *
 * @author isaac.neckel
 */
public class Teste0408 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] A = {1, 2, 5, 6, 7, 9};
        int alvo = 11;
                
        if(A[0] + A[5] == alvo){
            System.out.println("Correto");
        }
        else {
            System.out.println("Incorreto");
        }
        
        if(A[0] +  A[4] == alvo){
            System.out.println("Correto");
        }
        else {
            System.out.println("Incorreto");
        }
        
        if(A[2] + A[4] == alvo){
            System.out.println("Correto");
        }
        else {
            System.out.println("Incorreto");   
        }
        
        if(A[3] + A[4] == alvo){
            System.out.println("Correto");
        }
        else {
            System.out.println("Incorreto");
        }
        
        // Código repete até encontrar os dois valores corretos:
        
        if(A[2] + A[3] == alvo){
            System.out.println("Correto");
        }
        else {
            System.out.println("Incorreto");
        }
    }
    
}
