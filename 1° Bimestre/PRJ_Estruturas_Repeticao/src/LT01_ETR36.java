import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETR36
    Objetivo:  Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  25/02/2023
*/
public class LT01_ETR36 
{
    public static void main (String args[])
    {
       double n, s = 0, i, fat =1 ;
       n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
       for ( i = 1; i <= n; i++ )
       {
           fat = ( fat * i );
           s = ( s + ( 1 / fat ));
       }
       JOptionPane.showMessageDialog(null,"O resultado da série é "+s);
    }    
}
