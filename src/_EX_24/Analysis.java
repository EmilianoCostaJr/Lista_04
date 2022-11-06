/**===================================================================================================================
 * Classe       : Analysis
 * @author      : Emiliano Costa
 * @date        : 16 de mar. de 2022
 * ....................................................................................................................
 * Bibliografia : Java como programar, Deitel, 8º edição 
 * Capitulo     : 4 Instruções de controle: Parte 1
 * Exercicio    : 4.24 (Validando entrada de usuário) 
 *                  Modifique o programa na Figura 4.12 para validar suas entradas. 
 *                  Para qualquer entrada, se o valor inserido for diferente de 1 ou 2, 
 *                  continue o loop até o usuário inserir um valor correto.
 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


package _EX_24;
import java.util.Scanner;

/*====================================================================================================================*/
public class Analysis {

    public static void inicio(){
        Scanner input = new Scanner(System.in);
        
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;
        
        while (studentCounter <= 10){
            result = 3;  /*Força a entrada no loop*/
            while (result < 1 || result > 2){/*Loop acrescentado para validar a entrada digitada pelo usuário*/
                System.out.print("Digite resultado(1 = aprovado, 2 = reprovado): ");
                result = input.nextInt();
                if (result < 1 || result > 2){
                    System.out.println("Valor digitado invalido, digite novamente: ");
                }//fim if
            }//fim while
            
            if (result == 1){
                passes++;
            }else{
                failures++;
            }
            studentCounter++;
        }
        System.out.printf("Aprovados: %d\nReprovados: %d\n",passes, failures);
        if (passes > 8){
            System.out.println("Bom professor!");
        }
    }

    
}/*Fim classe Analysis%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
