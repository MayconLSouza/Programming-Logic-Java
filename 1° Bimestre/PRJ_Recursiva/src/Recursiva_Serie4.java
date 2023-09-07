/*
    Nome do programa: Recursiva_Serie4
    Objetivo: Serie4 = (N/1) +(N-1) / 2 + (N-2) / 3 + .... + (1/N) 
    Programador : Maycon Souza
    Data de desenvolvimento: 18/03/2023
*/
import javax.swing.JOptionPane;
public class Recursiva_Serie4 
{
    public static void main (String args[])
    {
       double num;
       num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
       JOptionPane.showMessageDialog(null, "O resultado da serie: "+FSerie4(num,num));
    }
    
    static double FSerie4( double n, double i)
    {
        double soma;
        if ( i != 1 )
        {
            soma = FSerie4(n,i-1) + ( n - ( i - 1 ) ) / i;
            return soma;
        }
        else
        {
            return n / i;
        }
    }
}
