/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LeoUser
 */
public class ResolvendoExercicios {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1,num2, num3;
        int result;

        System.out.println("Este programa faz soma de numeros interiros");
        System.out.print("Digite um numero inteiro: ");

        num1 = teclado.nextInt();

        System.out.println();
        System.out.print("Escolha outro numero: ");

        num2 = teclado.nextInt();

        System.out.print("Escolha outro numero: ");

        num3 = teclado.nextInt();

        result = num1 + num2 + num3;

        System.out.println("O resultado é: " + result);

    }
}
    
    

