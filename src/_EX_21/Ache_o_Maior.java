/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Ache_o_Maior
 * @author      :   Emiliano Costa
 * @date        :   31 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * Seção        :
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.21 (Localize o maior número) 
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_21;

import java.util.Scanner;
import javax.swing.JOptionPane;


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Ache_o_Maior {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
    public static void inicio(){
        console();
//        dialog();
    }

    /**Exercicio 4_21 Acha o maior número digitado versão console*/
    protected static void console(){
    /*Declarações.....................................................................................................*/    
        int counter = 1;
        int number; /*Inteiro inserido pelo usuário*/
        int largest = 0; /*O maior numero encontrado*/
    /*Inicio do código................................................................................................*/        
        /*Cria objeto input da classe Scanner*/
        Scanner input = new Scanner(System.in); 
        
        while (counter <= 10){
            System.out.print("Digite um inteiro: ");
            number = input.nextInt();
            if (number > largest){
                largest = number;
            }//fim if
            counter++;
        }//fim while
        System.out.printf("O maior número digitado é: %d\n", largest);
    /*...................................................................................................... FIM......*/    
    }

    /**Exercicio 4_21 Acha o maior número digitado versão caixa de dialogo*/
    protected static void dialog(){
        int counter = 1;
        int number; /*Inteiro inserido pelo usuário*/
        int largest = 0; /*O maior numero encontrado*/
        String msg;
        String entrada;
        while (counter <= 10){
            msg = String.format("Digite o %dº número Inteiro", counter);
            entrada = JOptionPane.showInputDialog(null, msg);
            number = Integer.parseInt(entrada);
            if (number > largest){
                largest = number;
            }
            counter++;
        }
        msg = String.format("O maior número é %d", largest);
        JOptionPane.showMessageDialog(null, msg);
    }
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

