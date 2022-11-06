/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   ContaCorrenteTest
 * @author      :   Emiliano Costa
 * @date        :   5 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * ___________________________________________________________________________________________________________________
 * Descrição    :   TestDrive para classe ContaCorrente
 * Exercicio    :   4.18 (Calculador de limite de crédito)
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_18;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class ContaCorrenteTest{
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    
    public static void inicio(){
        console();
//        dialog();
    }
    
    /**Versão Console*/
    protected static void console(){
        Scanner input = new Scanner(System.in);
        ContaCorrente cliente = new ContaCorrente();
        
        /*Parametro numeroConta na Classe ContaConta é inicializado com 1*/
        while (cliente.getNumeroConta() != 0){
            System.out.print("Digite zero no numero da conta do cliente para encerrar\nNumero da conta: ");
            cliente.setNumeroConta(input.nextInt());
            if (cliente.getNumeroConta() != 0){
                System.out.print("Digite o Saldo do cliente: ");
                cliente.setSaldoInicial(input.nextInt());
                System.out.print("Digite o valor da compra: ");
                cliente.setDebitos(input.nextInt());
                System.out.print("Digite o valor do pagamento: ");
                cliente.setCreditos(input.nextInt());
                System.out.print("Digite o limite de crédito do cliente: ");
                cliente.setLimite(input.nextInt());
                if (cliente.getLimite() < cliente.novoSaldo()){
                    System.out.println("Limite de credito excedido");
                }
            }
            System.out.printf("Saldo do cliente: %d",cliente.getSaldoInicial());
        }
    }
    
    /**Versão GUI*/
    protected static void dialog(){
      
        ContaCorrente cliente = new ContaCorrente();
        
        String msg = "Calcula limite de crédito";
        JOptionPane.showMessageDialog(null, msg);

        /*Parametro numeroConta na Classe ContaConta é inicializado com 1*/
        while (cliente.getNumeroConta() != 0){
            msg = "Digite zero no numero da conta do cliente para encerrar\nNumero da conta: ";
            cliente.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog(msg)));
            if (cliente.getNumeroConta() != 0){
                msg = "Digite o Saldo do cliente: ";
                cliente.setSaldoInicial(Integer.parseInt(JOptionPane.showInputDialog(msg)));
                msg = "Digite o valor da compra: ";
                cliente.setDebitos(Integer.parseInt(JOptionPane.showInputDialog(msg)));
                msg = "Digite o valor do pagamento: ";
                cliente.setCreditos(Integer.parseInt(JOptionPane.showInputDialog(msg)));
                msg = "Digite o limite de crédito do cliente: ";
                cliente.setLimite(Integer.parseInt(JOptionPane.showInputDialog(msg)));
                if (cliente.getLimite() < cliente.novoSaldo()){
                    msg = "Limite de credito excedido";
                    JOptionPane.showMessageDialog(null, msg);
                }
            }
        }
    }
    
}//Fim classe ContaCorrenteTest
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
