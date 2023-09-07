/*
    Nome do programa: LT01_FUNCTION32
    Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  09/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_FUNCTION32 
{
    public static void main (String args[])
    {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        JOptionPane.showMessageDialog(null,"O fatorial de "+num+" é "+FunctionFAT(num));
    }
    
    static int FunctionFAT( int n )
    {
        int i, fat = 1;
        for ( i = 1; i <= n; i++)
        {
            fat = ( fat * i );
        }
        return fat;
    }
}
