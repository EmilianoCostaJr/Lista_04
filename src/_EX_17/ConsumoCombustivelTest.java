/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   ConsumoCombustivelTest
 * @author      :   Emiliano Costa
 * @date        :   28 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * Seção        :
 * ___________________________________________________________________________________________________________________
 * Descrição    :   TestDrive para a classe ConsumoCombustivel
 * Exercicio    :   4.17 (Quilometragem de combustível) 
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_17;

import java.util.Scanner;

public class ConsumoCombustivelTest{
    
    public static void inicio(){
    /*Variáveis Locais e Objetos......................................................................................*/    
        int contagemTanques = 1;
        Scanner input = new Scanner(System.in);
        ConsumoCombustivel consumoParada = new ConsumoCombustivel();
        ConsumoCombustivel consumoTotal = new ConsumoCombustivel();  
    /*Inicio..........................................................................................................*/    
    /*Primeiro Abastecimento*/
        /*Prompt*/
        System.out.print("Para encerrar Digite 0 (Zero)\nDigite quantidade de litros abastecidos: ");
        consumoParada.setLitros(input.nextInt());
        
        if (consumoParada.getLitros() != 0)
        {//Se Abastecimento é zero, então não temos a kilometragem para ser informada.
            System.out.print("Digite quilometros rodados: ");
            consumoParada.setKm(input.nextInt());
        }//fim if
        
        /*Totaliza*/
        consumoTotal.setLitros(consumoParada.getLitros());
        consumoTotal.setKm(consumoParada.getKm());
        
    /*Abastecimentos Sequentes*/
        while (consumoParada.getLitros() != 0){
            /*Mostra os resultados do último tanque inserido*/
                System.out.println("Resumo do abastecimento numero: " + contagemTanques++);   
                System.out.println(consumoParada.displayConsumo());

            /*Insere novos Dados*/
                System.out.println("====================================================");
                System.out.println("Abastecimento numero: " + contagemTanques);  
                System.out.print("Digite quantidade de litros abastecidos: ");
                consumoParada.setLitros(input.nextInt());

                if (consumoParada.getLitros() != 0){
                    System.out.print("Digite quilometros rodados: ");
                    consumoParada.setKm(input.nextInt());
                }
            
            /*Totaliza*/ 
                consumoTotal.setKm(consumoParada.getKm() + consumoTotal.getKm()); /*Totaliza quilometros rodados*/
                consumoTotal.setLitros(consumoParada.getLitros() + consumoTotal.getLitros()); /*Totaliza quantidade de litros */
        }//Fim while 

        
        /*Mostra resultado final, Só executada se houver algum abastecimento*/
        if (consumoTotal.getLitros() !=0){
            System.out.println("====================================================");
            System.out.println("Quantidade de paradas: " + --contagemTanques);  
            System.out.println(consumoTotal.displayConsumo());
        }//fim if
    }
    
}//Fim classe ConsumoCombustivelTest
