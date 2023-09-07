import javax.swing.*;
/*
    Nome do programa: LT01_ETD26
    Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD26 
{
    public static void main (String args[])
    {
        int A, B;
        A=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        B=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if (A == B)
        {
            JOptionPane.showMessageDialog(null,"Números iguais.");
        }
        else
        {
            if ( A > B )
            {
                if  ( ( A % B ) == 0 )
                {
                    JOptionPane.showMessageDialog(null,A+" é múltiplo de "+B);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,A+" não é múltiplo de "+B);
                }   
            }
            else
            {
                if  ( ( B % A ) == 0 )
                {
                    JOptionPane.showMessageDialog(null,B+" é múltiplo de "+A);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,B+" não é múltiplo de "+A);
                }
            }
        }
    }
}
