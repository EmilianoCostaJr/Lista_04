/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Maiores
 * @author      :   Emiliano Costa
 * @date        :   31 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.23 (Encontre os dois números maiores)
  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_23;

import java.util.Scanner;
import javax.swing.JOptionPane;


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Maiores {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
   
    public static void inicio(){
        console();
//        dialog();
    }
    
    public static void console(){
        int counter = 1;
        int number; /*Inteiro inserido pelo usuário*/
        int largest = 0; /*O maior numero encontrado*/
        int largest2 = 0;
        /*Cria objeto input da classe Scanner*/
        Scanner input = new Scanner(System.in); 
        
        while (counter <= 10){
            System.out.print("Digite um inteiro: ");
            number = input.nextInt();
            if (number > largest2){
                largest2 = number;
                if (number > largest){
                    largest2 = largest;
                    largest = number;
                }//fim if
            }//fim if
            
            if (number > largest){
                largest = number;
            }//fim if
            counter++;
        }//fim while
        System.out.printf("O maior número digitado é: %d\nO segundo maior é: %d", largest, largest2);
    }

    public static void dialog(){
        int counter = 1;
        int number; /*Inteiro inserido pelo usuário*/
        int largest = 0; /*O maior numero encontrado*/
        int largest2 = 0;
        String msg;
        String entrada;
        while (counter <= 10){
            msg = String.format("Digite o %dº número Inteiro", counter);
            entrada = JOptionPane.showInputDialog(null, msg);
            number = Integer.parseInt(entrada);
            if (number > largest2){
                largest2 = number;
                if (number > largest){
                    largest2 = largest;
                    largest = number;
                }//fim if
            }//fim if
            
            if (number > largest){
                largest = number;
            }//fim if
            counter++;
        }//fim while
        msg = String.format("O maior número é %d\nO segundo maior é: %d\n", largest,largest2);
        JOptionPane.showMessageDialog(null, msg);
    }

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

