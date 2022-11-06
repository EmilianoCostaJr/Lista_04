/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Tabuleiro_Damas
 * @author      :   Emiliano Costa
 * @date        :   31 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Exercicio    :   4_32 (Padrão de tabuleiro de damas de asteriscos) 
 *                  Escreva um aplicativo que utiliza apenas as instruções de saída 
 *                  System.out.print( "* " );
 *                  System.out.print( " " );
 *                  System.out.println();
 *                  Observe que uma chamada de método System.out.println sem argumentos faz programa gere saída 
                    de um único caractcre de nova linha. [Dica: instruções de repetição são necessárias].
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_32;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Tabuleiro_Damas {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    public static void inicio(){
        int linha = 1;
        int coluna;
        
        while (linha <= 16){
            coluna = 1;
            while (coluna <=16){
                if ((coluna+linha)%2 == 0 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                coluna++;
            }//fim while
            System.out.println();
            linha++;
        }//fim while       
    }

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

