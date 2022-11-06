/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   ConsumoCombustivel
 * @author      :   Emiliano Costa
 * @date        :   28 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * Seção        :
 * ___________________________________________________________________________________________________________________
 * Descrição    : 
 * Exercicio    :   4.17 (Quilometragem de combustível) 
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 
package _EX_17;

public class ConsumoCombustivel {
/*Atributos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private int km;
    private int litros;
/*Métodos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/    

     public ConsumoCombustivel(){
        this.km = 0;
        this.litros = 0;
    }

    /*..............................................................................................Get e Set.........*/
    public int getKm(){
        return km;
    }

    public void setKm(int km){
        this.km = km;
    }

    public int getLitros(){
        return litros;
    }

    public void setLitros(int litros){
        this.litros = litros;
    }
  
    /*.........................................................................................Outros Métodos.........*/
    
    public double consumo(){
        return (double)this.getKm()/this.getLitros();
    }
    
    public String displayConsumo(){
        return String.format(
            "%s%d\n%s%d\n%s%.2f",
            "Km percorridos     : ",this.getKm(),
            "Litros Abastecidos : ",this.getLitros(),
            "Consumo médio      : ",this.consumo());
    }
    
}//Fim classe ConsumoCombustivel

/** Exercicio 4_17: (Quilometragem de combustível).
 * Os motoristas se preocupam com a quilometragem obtida por seus automóveis. 
 * Um motorista monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida e a quantidade de 
 * combustível em litros utilizados para cada tanque cheio. 
 * Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos 
 * (ambos como inteiros) para cada tanque cheio. 
 * 
 * 0 programa deve calcular e exibir o consumo em quilômetro/litro para cada tanque cheio e 
 * imprimir a quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto. 
 * Todos os cálculos de média devem produzir resultados de ponto flutuante. 
 * Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.*/
