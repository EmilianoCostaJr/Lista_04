/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Principal
 * @author      :   Emiliano Costa
 * @date        :   5 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   4 Instruções de controle: parte 1; operadores de atribuição ++ e --
 * ___________________________________________________________________________________________________________________
 * Descrição    :   TestDriver para os exercícios do capítulo.
 * ___________________________________________________________________________________________________________________
 * Comentário   :   7 de nov. de 2022 -- Testando sincronia com NetBeans                                                                                                      
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package Principal;
import java.util.Scanner;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Principal {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    /**Procedimento principal que inicia e termina a aplicação*/
    public static void main(String[] args){
        choice();
    } /*FIM Método main()*/

    /**Procedimento que conduz a execução do aplicativo escolhido*/
    public static void drive(int escolha){
        switch (escolha){
        case 6 -> _EX_06.Calcula.inicio();
        case 16 -> _EX_16.Mystery.inicio();
        case 17 -> _EX_17.ConsumoCombustivelTest.inicio();
        case 18 -> _EX_18.ContaCorrenteTest.inicio();
        case 19 -> _EX_19.ComissaoVendasTest.inicio();
        case 20 -> _EX_20.FolhaSalarialTest.inicio();
        case 21 -> _EX_21.Ache_o_Maior.inicio();
        case 22 -> _EX_22.ImprimeTabela.inicio();
        case 23 -> _EX_23.Maiores.inicio();
        case 24 -> _EX_24.Analysis.inicio();
        case 25 -> _EX_25.Mystery2.inicio();
        case 26 -> _EX_26.Mystery3.inicio();
        case 29 -> _EX_29.QuadradoAsteristicos.inicio();
        case 30 -> _EX_30.PalindromoTest.inicio();
        case 31 -> _EX_31.BinarioTest.inicio();
        case 32 -> _EX_32.Tabuleiro_Damas.inicio();
        case 33 -> _EX_33.LoopInfinito.inicio();
        case 35 -> _EX_35.TrianguloTest.inicio();
        case 36 -> _EX_36.TrianguloTest.inicioD();
        case 37 -> _EX_37.FatorialTest.inicio();
        case 38 -> _EX_38.CriptoTest.inicio();
        default -> System.out.println("Erro na escolha!");
        }
        choice();                
    }/*FIM Método drive()*/

    public static void choice(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menu de escolha do exercício a ser executado.\n");
        System.out.print("Digite o número do exercício ou zero para sair: ");

        int selecionado;
        
        try{
            selecionado = input.nextInt(); 
        }catch(Exception e){
            selecionado = 0; 
        }

        if(selecionado != 0)
            drive(selecionado);        
    }


}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim da classe Principal*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

