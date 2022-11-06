
package _EX_38;

import javax.swing.JOptionPane;


/**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   CriptoTest
 * @author      :   Emiliano Costa
 * @date        :   6 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   
 * Seção        :
 * ___________________________________________________________________________________________________________________
 * Descrição    : 
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class CriptoTest {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    public static void inicio(){
        int input;
        String msg;
        Encripta obj1;
        Desencripta obj2; 
        
        input = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 9999"));
        obj1 = new Encripta(input);
        obj2 = new Desencripta(obj1.getNumeroCriptografado());
        msg = String.format(
            "Valor original: %d\nValor criptogrado: %d \nValor desecripto: %d",
            input, obj1.getNumeroCriptografado(),obj2.getNumeroCriptografado());
        JOptionPane.showMessageDialog(null,msg);
    }

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

