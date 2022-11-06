/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Encripta
 * @author      :   Emiliano Costa
 * @date        :   5 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: parte 1; operadores de atribuição ++ e --
 * Seção        :   Exercício 4.38 (Impondo privacidade com criptografia)
 * ___________________________________________________________________________________________________________________
 * Descrição    : 
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_38;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Encripta {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::ATRIBUTOS:::::::::*/    
    private int numeroCriptografado;
    private boolean valido;
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::MÉTODOS:::::::::*/

    public Encripta(int digito){
        this.setNumeroCriptografado(digito);
    }

    public Encripta() {
    }

    /*..........................................................................................Get e Set.............*/

    public int getNumeroCriptografado() {
        return numeroCriptografado;
    }

    public final void setNumeroCriptografado(int encriptografando) {
        int digito_x;
        int encriptografado = 0;
        
        /*Validação: Se o número estiver dentro do range tal que {0 <= x <= 9999} então...*/
        if(encriptografando < 10000 || encriptografando >= 0){
                digito_x = this.modulo_10(this.modulo_10(encriptografando) + 7);
                encriptografado += (digito_x * 100);
                encriptografando /= 10;
                
                digito_x = this.modulo_10(this.modulo_10(encriptografando) + 7);
                encriptografado += (digito_x * 1000);
                encriptografando /= 10;
                
                digito_x = this.modulo_10(this.modulo_10(encriptografando) + 7);
                encriptografado += digito_x;
                encriptografando /= 10;
                
                digito_x = this.modulo_10(this.modulo_10(encriptografando) + 7);
                encriptografado += (digito_x * 10);
                this.numeroCriptografado = encriptografado;
                this.valido = true;
            }else{/*senão está fora do range, e cripto se faz número negativo = -1*/
                this.numeroCriptografado = -1;
                this.valido = false;
            }
    }

    public boolean isValido() {
        return valido;
    }
    
    private int modulo_10(int valor){
        return valor%10;
    }
    
    
    
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

/**4.38 (Impondo privacidade com criptografia). 
O crescimento explosivo de comunicação e armazenamento de dados na internet e em computadores conectados por ela 
aumentou muito a preocupação com a privacidade. O campo da criptografia envolve a codificação de dados para torná-los 
difíceis de acessar (e espera-se — com os esquemas mais avançados — impossíveis de acessar) para usuários sem 
autorização de leitura. 

Nesse exercício, você investigará um esquema simples para criptografar e descriptografar dados. 

Uma empresa que quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que 
eles possam ser transmitidos com maior segurança. 
Todos os dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos 
inserido pelo usuário e criptografá-lo da seguinte maneira: 
    substitua cada dígito pelo resultado da adição de 7 ao dígito, obtendo o restante depois da divisão do novo valor 
    por 10. 
    Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. 
    Então, imprima o inteiro criptografado. 

Escreva um aplicativo separado que receba a entrada de um inteiro de quatro dígitos criptografado e o descriptografe
(revertendo o esquema de criptografia) para formar o número original. 

[Projeto de leitura opcional: pesquise a “criptografia de chave pública” em geral e o esquema de chave pública 
específica PGP (Pretty Good Privacy). Você também pode querer investigar o esquema RSA, que é amplamente usado em 
aplicativos robustos industriais.]*/