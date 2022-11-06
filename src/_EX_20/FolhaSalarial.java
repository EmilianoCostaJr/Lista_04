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

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class FolhaSalarial{
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    private double salarioBruto;
    private double salarioHora;
    private int horasTrabalhadas;

    public FolhaSalarial()
    {
        this.salarioHora = 0;
        this.horasTrabalhadas = 0;
        this.salarioBruto = 0;
    }

    public void calculaSalario()
    {
        int horasExtras = 0;
        if (this.horasTrabalhadas > 40)
        {
            horasExtras = this.horasTrabalhadas - 40;
        }/*fim if*/
        this.salarioBruto = (this.horasTrabalhadas * this.salarioHora) + (horasExtras * this.salarioHora * 0.5); 
    }

    public double getSalarioBruto()
    {
        return salarioBruto;
    }

    public double getSalarioHora()
    {
        return salarioHora;
    }

    public int getHorasTrabalhadas()
    {
        return horasTrabalhadas;
    }

    public void setSalarioHora(double salarioHora)
    {
        this.salarioHora = salarioHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas)
    {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
}/*Fim classe FolhaSalarial*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


/**
 * Exercicio: 4.20 (Calculador de salários).
 * Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga as horas 
 * normais pelas primeiras 40 horas trabalhadas de cada funcionário e 50% a mais pelas horas trabalhadas além das 40 
 * horas. Você recebe uma lista de empregados, o número de horas trabalhadas que eles trabalharam na semana passada e 
 * o salário-hora de cada empregado. Seu programa deve aceitar a entrada dessas informações para cada empregado e, 
 * então, determinar e exibir o salário bruto do empregado. Utilize a classe Scanner para inserir os dados.
 */
