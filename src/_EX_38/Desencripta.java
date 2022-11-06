

/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Desencripta
 * @author      :   Emiliano Costa
 * @date        :   6 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   
 * Seção        :
 * ___________________________________________________________________________________________________________________
 * Descrição    : 
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_38;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Desencripta {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::ATRIBUTOS:::::::::*/    
    private int deCriptografado;

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::MÉTODOS:::::::::*/

    public Desencripta(int deCriptografando) 
    {
      setDeCriptografado(deCriptografando);  
    }

    public Desencripta() {
    }

    public final void setDeCriptografado(int deCriptografando) 
    {
        if(deCriptografando < 0 || deCriptografando > 9999)
            this.deCriptografado = -1;
        else
        {
            int digito_x;
            int decriptografado = 0;
            digito_x = this.modulo_10(this.modulo_10(deCriptografando) + 3) ;
            decriptografado += (digito_x * 100);
            deCriptografando /= 10;
            
            digito_x = this.modulo_10(this.modulo_10(deCriptografando) + 3) ;
            decriptografado += (digito_x * 1000);
            deCriptografando /= 10;
            
            digito_x = this.modulo_10(this.modulo_10(deCriptografando) + 3) ;
            decriptografado += digito_x;
            deCriptografando /= 10;
            
            digito_x = this.modulo_10(this.modulo_10(deCriptografando) + 3) ;
            decriptografado += (digito_x * 10);
            
            this.deCriptografado = decriptografado;
        }
    }
    

    public int getNumeroCriptografado() 
    {
        return deCriptografado;
    }
    
    private int modulo_10(int valor)
    {
        return valor%10;
    }


}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

