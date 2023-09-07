/*
    Nome do programa: Recursiva_Serie3
    Objetivo: Serie3 = (1/1) + (1/2) + (1/3) + ... (1/N)
    Programador : Maycon Souza
    Data de desenvolvimento: 18/03/2023
*/
import javax.swing.JOptionPane;
public class Recursiva_Serie3 
{
    public static void main (String args[])
    {
       double num;
       num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
       JOptionPane.showMessageDialog(null, "O resultado da serie: "+FSerie3(num));
    }
    
    static double FSerie3 (double n)
    {
        double soma;
        if ( n != 1 )
        {
            soma = FSerie3(n-1) + 1/n;
            return soma;
        }
        else
        {
            return 1;
        }
    }
}
