/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Triangulo
 * @author      :   Emiliano Costa
 * @date        :   6 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   4 Instruções de controle: parte 1; operadores de atribuição ++ e --
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.35 (Lados de um triângulo) 
 *                  Faz a representação de um triangulo.                                                                                                    
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 
    

/**Exercicio 4.36 (Lados de um triângulo reto) 
 * Escreva um aplicativo que Ic três inteiros diferentes de zero e determina e 
 * imprime se eles poderíam representar os lados de um triângulo direito.
 */

package _EX_35;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TrianguloTest{
    
    public static void inicio(){
        console();
//        dialog();
    }
    
    public static void console(){
        /*Cria objeto input da classe Scanner*/
        Scanner input = new Scanner(System.in); 
        Triangulo obj = new Triangulo();
        
        System.out.print("Digite o primeiro valor: ");
        obj.setLado_a(input.nextInt());
        System.out.print("Digite o segundo valor: ");
        obj.setLado_b(input.nextInt());
        System.out.print("Digite o terceiro valor: ");
        obj.setLado_c(input.nextInt());
     
        obj.OrdenaTriangulo();
        
        if (obj.ehTriagulo()){
            System.out.println("Numeros digitados formam um triangulo");
        }else{
            System.out.println("Numeros digitados não formam um triangulo");
        }
    }
    
    public static void dialog(){
        String mensagem;
        String sInput;
        
        Triangulo obj = new Triangulo();
        
        mensagem = "Digite o primeiro valor: ";
        sInput = JOptionPane.showInputDialog(null, mensagem);
        obj.setLado_a(Integer.parseInt(sInput));

        mensagem = "Digite o segundo valor: ";
        sInput = JOptionPane.showInputDialog(null, mensagem);
        obj.setLado_b(Integer.parseInt(sInput));

        mensagem = "Digite o terceiro valor: ";
        sInput = JOptionPane.showInputDialog(null, mensagem);
        obj.setLado_c(Integer.parseInt(sInput));

        obj.OrdenaTriangulo();
        
        if (obj.ehTriagulo()){
            mensagem = "Numeros digitados formam um triangulo";
        }else{
            mensagem = "Numeros digitados não formam um triangulo";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
   
}