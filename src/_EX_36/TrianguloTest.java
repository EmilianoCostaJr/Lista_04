/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Triangulo
 * @author      :   Emiliano Costa
 * @date        :   6 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   4 Instruções de controle: parte 1; operadores de atribuição ++ e --
 * ___________________________________________________________________________________________________________________
 * Descrição    :   4.36 (Lados de um triângulo) 
 *                  Faz a representação de um triangulo.                                                                                                    
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_36;
import javax.swing.JOptionPane;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class TrianguloTest{
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
     
    public static void inicioD(){
        Triangulo obj = new Triangulo();
        int cont = 1;
        
        obj.setLado_a(
                Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %d° valor: ", cont++))));
        obj.setLado_b(
                Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %d° valor: ", cont++))));
        obj.setLado_c(
                Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %d° valor: ", cont++))));
        obj.OrdenaTriangulo();
        
        if (obj.EhTrianguloReto()){
            JOptionPane.showMessageDialog(null, "Numeros digitados formam um triangulo reto");
        }else{
            JOptionPane.showMessageDialog(null, "Numeros digitados não formam um triangulo reto");
        }
    }
}
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
