/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   ContaCorrenteTest
 * @author      :   Emiliano Costa
 * @date        :   5 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * ___________________________________________________________________________________________________________________
 * Descrição    :   
 * Exercicio    :   4.18 (Calculador de limite de crédito)
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_18;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class ContaCorrente {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    private int numeroConta; //Item A
    private int saldoInicial; //Item B
    private int debitos; //Item C
    private int creditos; //Item D
    private int limite; //Item E

    public ContaCorrente()
    {
        this.creditos = 0;
        this.debitos = 0;
        this.limite = 0;
        this.numeroConta = 1; /*Se iniciar com 0, não entra no loop*/
        this.saldoInicial = 0;
    }

    public int getNumeroConta()
    {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta)
    {
        this.numeroConta = numeroConta;
    }

    public int getSaldoInicial()
    {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial)
    {
        this.saldoInicial = saldoInicial;
    }

    public int getDebitos()
    {
        return debitos;
    }

    public void setDebitos(int debitos)
    {
        this.debitos = debitos;
    }

    public int getCreditos()
    {
        return creditos;
    }

    public void setCreditos(int creditos)
    {
        this.creditos = creditos;
    }

    public int getLimite()
    {
        return limite;
    }

    public void setLimite(int limite)
    {
        this.limite = limite;
    }
    
    public int novoSaldo()
    {
        return  this.saldoInicial + this.debitos - this.creditos;
    }
    
}//Fim classe ContaCorrente
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


/** 
 * Exercicio 4.18 (Calculador de limite de crédito).
 * Desenvolva um aplicativoJava que determina se um cliente de uma loja de departamentos excedeu o limite de crédito em 
 * uma conta-corrente. Para cada cliente, os seguintes fatos estào disponíveis:
    a)	número de conta.
    b)	saldo no início do mês.
    c)	total de todos os itens cobrados desse cliente no mês.
    d)	total de créditos aplicados ao cliente no mês.
    e)	limite de crédito autorizado.
    O programa deve inserir todos esses fatos como inteiros, calcular o novo saldo 
    (= saldo inicial + despesas - créditos), exibir o novo saldo e determinar se o novo saldo excede ao limite de 
    crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve exibir a mensagem 
    "Limite de crédito excedido".
*/
