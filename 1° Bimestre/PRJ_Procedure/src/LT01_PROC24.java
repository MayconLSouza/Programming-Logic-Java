/*
    Nome do programa: LT01_PROC24
    Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC24 
{
    static int n; // n = valor inteiro
        public static void main (String args[]) 
        {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            Divisivel(); // chamada de procedure que verifica se o número é divisível por 2 e 3
        }
        
        
        static void Divisivel()
        {
            if  ( ( n % 2 ) == 0 )
            {
                if  ( ( n % 3 ) == 0 )
                {
                    JOptionPane.showMessageDialog(null,"O número é divisível por 2 e 3");
                }
            }
            else
            {
            JOptionPane.showMessageDialog(null,"O número não é divisível por 2 e 3");
            }
        }
}
