/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Binario
 * @author      :   Emiliano Costa
 * @date        :   6 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   4 Instruções de controle: Parte 1
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.31 (Imprimindo o equivalente decimal de um número binário)
  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_31;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Binario {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*ATRIBUTOS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/    
    private int b0;
    private int b1;
    private int b2;
    private int b3;
    private int b4;
    private int b5;
    private int b6;
    private int b7;
    private boolean ehByte;
/*MÉTODOS::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/    
    public Binario(){
    }

    public void setGeral(int numero){
        int temp = numero;
        this.ehByte = true;
        this.b0 = temp%10;
        temp /= 10;
        this.b1 = temp%10;
        temp /= 10;
        this.b2 = temp%10;
        temp /= 10;
        this.b3 = temp%10;
        temp /= 10;
        this.b4 = temp%10;
        temp /= 10;
        this.b5 = temp%10;
        temp /= 10;
        this.b6 = temp%10;
        temp /= 10;
        this.b7 = temp%10;
        
        /*Confirma se todos os digitos são 0 ou 1*/
        if (this.b0 > 1){ this.ehByte = false;}
        if (this.b1 > 1){ this.ehByte = false;}
        if (this.b2 > 1){ this.ehByte = false;}
        if (this.b3 > 1){ this.ehByte = false;}
        if (this.b4 > 1){ this.ehByte = false;}
        if (this.b5 > 1){ this.ehByte = false;}
        if (this.b6 > 1){ this.ehByte = false;}
        if (this.b7 > 1){ this.ehByte = false;}
    }
      
    public boolean isEhByte(){
        return ehByte;
    }
    
    public int convertParaDecimal(){
        return this.b0 + this.b1 * 2 + this.b2 * 4 + this.b3 * 8 + 
                this.b4 * 16 + this.b5 * 32 + this.b6 * 64 + this.b7 * 128;
    }
     
}