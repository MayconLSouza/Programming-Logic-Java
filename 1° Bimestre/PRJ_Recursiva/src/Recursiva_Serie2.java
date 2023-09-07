/*
    Nome do programa: Recursiva_Serie2
    Objetivo: Serie2 = (N) + (N - 1) + (N - 2) ... + (1) 
    Programador : Maycon Souza
    Data de desenvolvimento: 18/03/2023
*/
import javax.swing.JOptionPane;
public class Recursiva_Serie2 
{
   public static void main (String args[])
   {
       int num;
       num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
       JOptionPane.showMessageDialog(null, "O resultado da serie: "+FSerie2(num));
   }

    static int FSerie2(int n)
    {
        int soma;
        if ( n != 1 )
        {
            soma = n + FSerie2( n - 1 );
            return soma;
        }
        else
        {
            return 1;
        }
    }
}
