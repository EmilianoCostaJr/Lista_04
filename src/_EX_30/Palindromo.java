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

public class Palindromo{
    private int numero; /*Numero Original*/
    private int num0;   /*Unidade, pois 10^0 = 1*/
    private int num1;   /*Dezena, pois  10^1 = 10*/
    private int num2;   /*Centena, pois  10^2 = 100*/
    private int num3;   /*Milhar, pois  10^3 = 1000*/
    private int num4;   /*Miriade, pois  10^4 = 10000*/


    public Palindromo(int numero){
        this.numero = numero;
        int temp = numero;
        this.num0 = temp%10;
        temp /= 10;
        this.num1 = temp%10;
        temp /= 10;
        this.num2 = temp%10;
        temp /= 10;
        this.num3 = temp%10;
        temp /= 10;
        this.num4 = temp%10;
    }

    public int getNum0(){
        return num0;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }

    public int getNum3(){
        return num3;
    }

    public int getNum4(){
        return num4;
    }

    
    public boolean ehPalindromo(){
        boolean ehPalindromo;
        if (this.getNum0() == this.getNum4()){
            if (this.getNum1() == this.getNum3()){
                ehPalindromo = true;
            }else{
                ehPalindromo = false;
            }    
        }else{
            ehPalindromo = false;
        }
        return ehPalindromo;
    }
    
}/*Fim classe Palindromo*/

/**
 * Descrição do Aplicativo:.
 * Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda. 
 * Por exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321,55555,45554 e 1 l6l 1. 
 * Escreva um aplicativo que lê em um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. 
 * Se o número não for de cinco dígitos, exiba uma mensagem de erro e permita que o usuário insira um novo valor.
 */
