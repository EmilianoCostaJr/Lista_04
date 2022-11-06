/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   QuadradoAsteristicos
 * @author      :   Emiliano Costa
 * @date        :   31 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.29 (Quadrado de asteriscos) 
  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_29;
import java.util.Scanner;


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class QuadradoAsteristicos {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
    public static void inicio(){
        /*Cria objeto input da classe Scanner*/
        Scanner input = new Scanner(System.in); 
        int tamanho = 0;

        while (tamanho < 1 || tamanho > 20){
            System.out.println("Qual tamanho do quadrado a ser dezenhado?");
            tamanho = input.nextInt();
        }//fim while

        int linha = 1; 
        int coluna;
        
        while (linha <= tamanho){
            coluna = 1;
            while (coluna <= tamanho){
                if (coluna == 1 || coluna == tamanho || linha == 1 || linha == tamanho){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }//fim if
                coluna++;
            }//fim while coluna
            System.out.println("");
            linha++;
        }//fim while linha
        
    }
    
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

