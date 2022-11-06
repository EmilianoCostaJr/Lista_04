/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   BinarioTest
 * @author      :   Emiliano Costa
 * @date        :   6 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.31 (Imprimindo o equivalente decimal de um número binário)
  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_31;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class BinarioTest{
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    public static void inicio(){
        console();
//        dialog();
    }
    /**Exercicio 4_31 (Imprimindo o equivalente decimal de um número binário)
    * Escreva um aplicativo que insere um número inteiro que contém somente Os e 1s (isto é, um número inteiro binário) 
  * e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divisão para pegar os dígitos do número 
  * binário um de cada vez da direita para a esquerda. No sistema de números decimais, o dígito mais à direita tem um 
  * valor posicionai de 1 e o próximo dígito à esquerda um valor posicionai de 10, depois 100, depois 1000 e assim por 
  * diante. O número decimal 234 pode ser interpretado como4* 1 +3* 10 + 2* 100. 
  * No sistema de número binários, o dígito mais à direita tem um valor posicionai de 1, o próximo dígito à esquerda 
  * um valor posicionai de 2, depois 4, depois 8 c assim por diante. O equivalente decimal do 
  * binário 1101 él*l+0*2 + l*4+l*8 ou 1+0 + 4 + 8 ou, 13]*/
    public static void console(){
    /*Declaração......................................................................................................*/    
        Scanner input = new Scanner(System.in); /*Cria objeto input da classe Scanner*/
        Binario objByte = new Binario();/*Cria objeto objByte da classe Binario*/
        int numero;
    /*Inicio..........................................................................................................*/        

        System.out.print("Digite um BYTE ");
        numero = input.nextInt();

        objByte.setGeral(numero);
        
        while (objByte.isEhByte() == false){
            System.out.print("Digite um BYTE \nCom até 8 digitos.\ndeve conter somente Os e 1s: ");
            numero = input.nextInt();
            objByte.setGeral(numero);
        }

        System.out.printf("O numero binario %d\n equivale ao decimal %d\n", numero,objByte.convertParaDecimal());
        
    }
    
    /**Exercicio 4_31 versão Caixa de dialogo*/   
    public static void dialog(){
        String mensagem;    /*String a ser exibiba na caixa de dialogo*/
        String sInput;      /*Recebe string digitados pelo usuário*/
        int numero;
        
        mensagem = "Digite um BYTE ";
        sInput = JOptionPane.showInputDialog(null, mensagem);
        numero = Integer.parseInt(sInput);
        
        /*Cria objeto objByte da classe Binario*/
        Binario objByte = new Binario();

        objByte.setGeral(numero);
        
        while (objByte.isEhByte() == false){
            mensagem = "Digite um BYTE \nCom até 8 digitos.\ndeve conter somente Os e 1s: ";
            sInput = JOptionPane.showInputDialog(null, mensagem);
            numero = Integer.parseInt(sInput);
            objByte.setGeral(numero);
        }

        mensagem = String.format("O numero binario %d\n equivale ao decimal %d\n", numero,objByte.convertParaDecimal());
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
