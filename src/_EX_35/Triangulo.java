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

package _EX_35;


public class Triangulo{
/*Atributos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/ 
    private int lado_a;
    private int lado_b;
    private int lado_c;
/*Métodos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/      
 
    /*GET e SET*/
    
    public int getLado_a(){
        return lado_a;
    }

    public void setLado_a(int lado_a){
        this.lado_a = lado_a;
    }

    public int getLado_b(){
        return lado_b;
    }

    public void setLado_b(int lado_b){
        this.lado_b = lado_b;
    }

    public int getLado_c(){
        return lado_c;
    }

    public void setLado_c(int lado_c){
        this.lado_c = lado_c;
    }
    
    /*Outros métodos*/
    
    public void OrdenaTriangulo(){
        int temp;
        if (this.lado_b > this.lado_a){
            temp = this.lado_a;
            this.lado_a = this.lado_b;
            this.lado_b = temp;
        }//fim if
        
        if (this.lado_c > this.lado_b){
            temp = this.lado_b;
            this.lado_b = this.lado_c;
            this.lado_c = temp;
            if (this.lado_b > this.lado_a){
                temp = this.lado_a;
                this.lado_a = this.lado_b;
                this.lado_b = temp;
            }//fim if interno
        }//fim if externo
    }
    
    public boolean ehTriagulo(){
        boolean resposta;
        if (this.lado_a < (this.lado_b + this.lado_c))
        {
            resposta = true;
        }
        else
        {
            resposta = false;
        }
        return resposta;
    }
    
    /*Acrecentado para solucionar o problema do exercicio 4.36*/
    public boolean EhTrianguloReto(){
        boolean resposta = false;
        if (Math.pow(lado_a, 2) == Math.pow(lado_b,2) + Math.pow(lado_c, 2))
        {
            resposta = true;
        }//fim if
        return resposta;
    }
    
}/*Fim classe Triangulo*/

/**
 * Exercicio 4.35 (Lados de um triângulo).
 * Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário e determina c imprime se eles 
 * poderíam representar os lados de um triângulo.
*/
