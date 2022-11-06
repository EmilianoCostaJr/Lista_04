/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   ComissaoVendasTest
 * @author      :   Emiliano Costa
 * @date        :   5 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * ___________________________________________________________________________________________________________________
 * Descrição    : Driver para Classe ComisãoVendas.
 * Exercicio    : 
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 


package _EX_19;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ComissaoVendasTest{
    
    public static void inicio(){
        console();
//        dialog();
    }
    
    /**Exercicio 4_19:(iCalcula dor de comissão de vendas) 
 * Uma grande empresa paga seu pessoal de vendas por comissão. 0 pessoal de vendas recebe R$ 200 por semana mais 
 * 9% de suas vendas brutas durante essa semana. Por exemplo, um vendedor que realiza um total de vendas de mercadorias 
 * de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, ou um total de R$ 650. Foi-lhe fornecida uma lista dos 
 * itens vendidos por cada vendedor. Os valores desses itens sào como segue:
    Item	Value
    1           239.99
    2           129.75
    3           99.95
    4           350.89
 * Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e 
 * calcula e exibe os rendimentos do vendedor. Nào existe nenhum limite para o número de itens que pode ser vendido.*/
    public static void console(){
        /*Cria objeto input da classe Scanner*/
        Scanner input = new Scanner(System.in);
        int continua = 1;
        int item1,item2,item3,item4;
        double comissao;      
        
        while (continua !=0){
            System.out.println("Calcula comissão");
            System.out.println("Digite quantidade vendida do item 1 com valor de $239.99");
            item1 = input.nextInt();
            System.out.println("Digite quantidade vendida do item 2 com valor de $129.75");
            item2 = input.nextInt();
            System.out.println("Digite quantidade vendida do item 3 com valor de $99.95");
            item3 = input.nextInt();
            System.out.println("Digite quantidade vendida do item 4 com valor de $350.89");
            item4 = input.nextInt();
           comissao = comissaoVendas(item1, item2, item3, item4);
            System.out.printf("Comissão do vendedor é : $%.2f\n",comissao);
            
            System.out.println("==============================================");
            System.out.print("Digite 0 para sair, outro valor para continuar: ");
            continua = input.nextInt();
        }
        
        
    }
    
    /**Exercicio 4_19:(iCalcula dor de comissão de vendas) versão Caixa de dialogo*/
    public static void dialog(){
        int continua = 1;
        int item1,item2,item3,item4;
        double comissao;
        
        String msg = "Calcula comissão";
        JOptionPane.showMessageDialog(null,msg);
        
        while (continua!=0){
            msg = "Digite quantidade vendida do item 1 com valor de $239.99";
            item1 = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
            msg = "Digite quantidade vendida do item 2 com valor de $129.75";
            item2 = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
            msg = "Digite quantidade vendida do item 3 com valor de $99.95";
            item3 = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
            msg = "Digite quantidade vendida do item 4 com valor de $350.89";
            item4 = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
           comissao = comissaoVendas(item1, item2, item3, item4);
           msg = String.format("Comissão do vendedor é: $%.2f \nDigite 0 (Zero para encerrar)", comissao);
           continua = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
        }//fim while
    }/*Fim do método myGui*/

    private static double comissaoVendas(int valor_Item1,int valor_Item2,int valor_Item3,int valor_Item4){
        ComissaoVendas Item1 = new ComissaoVendas(1,valor_Item1,239.99);
        ComissaoVendas Item2 = new ComissaoVendas(2,valor_Item2,129.75);
        ComissaoVendas Item3 = new ComissaoVendas(3,valor_Item3,99.95);
        ComissaoVendas Item4 = new ComissaoVendas(4,valor_Item4,350.89);
        
        double comissao =200.0 +(Item1.ValorTotalVendasItem() + Item2.ValorTotalVendasItem() + 
                Item3.ValorTotalVendasItem()+ Item4.ValorTotalVendasItem())*0.09; 
        return comissao;
    }
    
}
