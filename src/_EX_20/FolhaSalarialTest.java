/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   FolhaSalarialTest
 * @author      :   Emiliano Costa
 * @date        :   5 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * Seção        :
 * ___________________________________________________________________________________________________________________
 * Descrição    :   Exercicio: 4.20 (Calculador de salários)
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_20;
import java.util.Scanner;
import javax.swing.JOptionPane;


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class FolhaSalarialTest {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
    
    public static void inicio(){
        console();
//        dialog();
    }
    
    public static void console(){
        
        /*Cria objeto salario da classe FolhaSalarial*/
        FolhaSalarial salario = new FolhaSalarial();

        /*Cria objeto input da classe Scanner*/
        Scanner input = new Scanner(System.in);
        
        int continua = 1;
        
        while (continua != 0){
            System.out.println("Digite quanrtidade de horas trabalhadas:");
            salario.setHorasTrabalhadas(input.nextInt());
            System.out.println("Digite valor da hora:");
            salario.setSalarioHora(input.nextFloat());
            salario.calculaSalario();
            System.out.printf("Salario a ser pago: %.2f\n", salario.getSalarioBruto());
            System.out.println("=============================================");
            System.out.println("Digite 0 (zero) para sair");
            continua = input.nextInt();
        }
    }

    public static void dialog(){
        /*Cria objeto salario da classe FolhaSalarial*/
        FolhaSalarial salario = new FolhaSalarial();
        
        int continua = 1;
        String msg;
        
        while (continua != 0){
            msg = "Digite quanrtidade de horas trabalhadas:";
            salario.setHorasTrabalhadas(Integer.parseInt(JOptionPane.showInputDialog(null, msg)));
            msg = "Digite valor da hora:";
            salario.setSalarioHora(Float.parseFloat(JOptionPane.showInputDialog(null, msg)));
            salario.calculaSalario();
            msg = String.format("Salario a ser pago: %.2f", salario.getSalarioBruto());
            JOptionPane.showMessageDialog(null, msg);
            msg ="Digite 0 (zero) para sair\nDigite 1 (um para continuar)";
            continua = Integer.parseInt(JOptionPane.showInputDialog(msg));
        }
    }

}
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/