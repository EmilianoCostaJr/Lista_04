/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   PalindromoTest
 * @author      :   Emiliano Costa
 * @data        :   6 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.30 (Palíndromos)
  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_30;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class PalindromoTest {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
    
    public static void inicio(){
        console();
//        dialog();
    }
    
    public static void console(){
        /*Cria objeto input da classe Scanner*/
        Scanner input = new Scanner(System.in); 

        /*Prompt inicial*/
        System.out.print("Digite um inteiro de 5 algarimos: ");
        int numero = input.nextInt(); /*Numero inserido pelo usuário, inicia*/
        
        /*Loop de validação
        Se o número não for de cinco dígitos, exibe uma mensagem de erro e permite que o usuário insira um novo valor.*/
        while (numero < 10000 || numero > 99999){
            System.out.printf("Numero digitado: %d\nNão tem 5 digitos!\n", numero);
            System.out.print("Digite novamente: ");
            numero = input.nextInt();
        }

        /*Cria objeto da classe Palindromo*/
        Palindromo objNumero = new Palindromo(numero);
        
        /*Verifica se é palindromo*/
        if (objNumero.ehPalindromo()){
            System.out.printf("O numero %d é um palindromo\n", numero);
        }else{
            System.out.printf("O numero %d não é um palindromo\n", numero);
        }
    }
       
    public static void dialog(){
        String mensagem; /*String a ser exibiba na caixa de dialogo*/
        String sInput; /*String que recebe digitação do usuário*/
        int numero; /* recebe o valor da string convertido pelo método Integer.parseInt(sInput)*/

        /*Prompt inicial*/
        mensagem = "Digite um inteiro de 5 algarimos:";    
        sInput = JOptionPane.showInputDialog(null, mensagem);
        numero = Integer.parseInt(sInput); 
        
        /*Se o número não for de cinco dígitos, exibe uma mensagem de erro e permite que o usuário insira um novo valor.*/
        while (numero < 10000 || numero > 99999){
            mensagem = String.format("Numero digitado: %d\nNão tem 5 digitos!\nDigite novamente:", numero);
            sInput = JOptionPane.showInputDialog(null, mensagem);
            numero = Integer.parseInt(sInput);
        }/*FIM Loop de validação*/

        /*Cria objeto da classe Palindromo*/
        Palindromo objNumero = new Palindromo(numero);

        /*Verifica se é palindromo*/
        if (objNumero.ehPalindromo()){
            mensagem = String.format("O numero %d é um palindromo\n", numero);
            JOptionPane.showMessageDialog(null, mensagem);
        }else{
            mensagem = String.format("O numero %d não é um palindromo\n", numero);
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}//Fim classe PalindromoTest
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
