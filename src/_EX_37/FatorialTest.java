/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   FatorialTest
 * @author      :   Emiliano Costa
 * @date        :   7 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   4 Instruções de controle: parte 1; operadores de atribuição ++ e --
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.37 (Fatorial)
                    Driver para a classe Fatorial
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_37;
import java.util.Scanner;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class FatorialTest{
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    /**Exercicio 4_37: (Fatorial)*/
    public static void inicio(){
        /*Cria objeto input da classe Scanner*/
        Scanner input = new Scanner(System.in); 
        
        /*Cria objeto obj da classe Fatorial*/
        Fatorial obj = new Fatorial();

        /*Entrada de dados*/
        System.out.println("Digite um valor inteiro dentro do intervalo [1, 31]\n e saiba seu fatorial: ");
        int numero = input.nextInt();
        
        /*Item a) Mostra o resultado do calculo do fatorial */
        System.out.printf("Fatorial = %d\n",obj.CalculaFatorial(numero));

        /*Estima valor da constante e*/
        System.out.printf("Constante e = %.5f\n", obj.estimaE(numero));

        /*Calcula (e) elevado a (x)*/
        System.out.printf("E elevado a %d = %.5f", numero, obj.CalculaE_Pow_x(numero));
        
    }/*Fim do método appConsole*/
    
}//Fim classe FatorialTest
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
