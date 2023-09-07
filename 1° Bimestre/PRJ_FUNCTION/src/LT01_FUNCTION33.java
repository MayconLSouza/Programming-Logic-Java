/*
    Nome do programa: LT01_FUNCTION33
    Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  09/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_FUNCTION33 
{
    public static void main (String args[])
    {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null,"O resultado da série é "+FunctionS(num));
    }
    
    static double FunctionS( int n )
    {
        double i, s = 0;
        for ( i = 1; i <= n; i++ )
        {
            s = ( s + 1 / i );
        }
        return s;
    }
}
