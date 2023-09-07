/*
    Nome do programa: LT01_FUNCTION34
    Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  09/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_FUNCTION34 
{
    public static void main (String args[])
    {
        int num, i = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        while ( i <= 10)
        {
            System.out.println(num+" * "+i+" = "+FunctionT(num, i));
            i++;
        }    
    }
    
    static int FunctionT( int n, int j)
    {
        int t;
        t = ( j * n );
        return t;
    }
}
