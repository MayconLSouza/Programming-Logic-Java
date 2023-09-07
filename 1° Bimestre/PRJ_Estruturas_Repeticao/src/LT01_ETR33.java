import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETR33
    Objetivo:  Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  23/02/2023
*/
public class LT01_ETR33 
{
    public static void main (String args[])
    {
        double s = 0, n, i = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        while ( i <= n )
        {
            s = ( s + ( 1 / i ) );
            i = ( i + 1 );
        }
        JOptionPane.showMessageDialog(null,"O resultado da série é: "+s);
    }
}
