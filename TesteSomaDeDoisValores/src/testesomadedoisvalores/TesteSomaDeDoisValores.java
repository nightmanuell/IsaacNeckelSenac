/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesomadedoisvalores;

/**
 *
 * @author User
 */
public class TesteSomaDeDoisValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aula do dia 02/08/2021
        System.out.println("Olá mundo.");
       
        String str1 = "Hello World!";
        System.out.println(str1);
       
        int a = 6;
        int b = 7;
        int c = a + b;
        System.out.println("6+7 = " + c);
       
        //Questão sobre dois números
        System.out.println(" ");
        System.out.println("Questão sobre duas variáveis:");
        System.out.println("Variáveis apresentadas = 1, 2, 3, 4.");
        System.out.println("Valor alvo: 7");
        int i = 1;
        int j = 2;
        int k = 3;
        int L = 4;
       
        int m0 = i + i;
        int m1 = i + j;
        int m2 = i + k;
        int m3 = i + L;
        int n0 = j + j;
        int n1 = j + k;
        int n2 = j + L;
        int o0 = k + k;
        int o1 = k + L;
        int p0 = L + L;
        System.out.println("1+1 =" + m0);
        System.out.println("1+2 =" + m1);
        System.out.println("1+3 =" + m2);
        System.out.println("1+4 =" + m3);
        System.out.println("2+2 =" + n0);
        System.out.println("2+3 =" + n1);
        System.out.println("2+4 =" + n2);
        System.out.println("3+3 =" + o0);
        System.out.println("3+4 =" + o1);
        System.out.println("4+4 =" + p0);
       
        System.out.println("Conclui-se que os valores corretos são 3 e 4.");
        System.out.println(" ");
        
        // Aula do dia 03/08/2021
        
        //Criar int com lista de número e um com resposta
        int[] ListNum = {2, 4, 6, 8, 10};
        int resp = 12;
        // "2" é endereço 0; "4" endereço 1;... "10" endereço 4}
        
        // Criar regra if para a soma
        if(ListNum[0] + ListNum[4] == resp){
            System.out.println("Resposta correta " + (ListNum[4] + ListNum[0]));
        }
        else{
            System.out.println("Resposta incorreta.");
        }
        
        // TESTE 2 com resposta incorreta
          if(ListNum[0] + ListNum[2] == resp){
            System.out.println("Resposta correta " + (ListNum[2] + ListNum[0]));
        }
        else{
            System.out.println("Resposta incorreta.");
        }
        
        
    }
    
}
