/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Fatorial
 * @author      :   Emiliano Costa
 * @date        :   7 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   4 Instruções de controle: parte 1; operadores de atribuição ++ e --
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.37 (Fatorial)
                    Métodos para calcular e usar fatorial
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_37;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Fatorial{
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    /**Exercicio 4_37: (Fatorial) Solução para o item (a)*/
    public int CalculaFatorial(int numero){
        int fatorial = 1;
        int cont = 1;
        while (cont <= numero)
        {
            fatorial *= cont++;
        }//fim while
        return fatorial;
    }
    
    /**Solução para o item (b) do exercicio */
    public double estimaE(int numero){
        double estimativa = 1.0;
        int counter = 1;
        while (counter <= numero){
            estimativa +=  (double)1/this.CalculaFatorial(counter++);
        }//fim while
        return estimativa;
    }
    
    /** Solução para o item (c) do exercicio. Resultado esta diferente do que é feito com a calculadora, 
     * e nem se aproxima, verifiquei a formula e não achei o ERRO*/
    public double CalculaE_Pow_x(double x){
        double Ex = 1.00;
        int counter = 1;
        while (counter <= x){
            Ex += (Math.pow(x, counter)/this.CalculaFatorial(counter++));
        }//fim while
        return Ex;
    }
    
}/*Fim classe Fatorial*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
