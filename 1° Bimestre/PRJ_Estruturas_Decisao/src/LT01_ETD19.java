import javax.swing.*;
/*
    Nome do programa: LT01_ETD19
    Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD19 
{
    public static void main (String args[])
    {
        double A, B;
        A=Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        B=Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        if (A == B)
        {
            JOptionPane.showMessageDialog(null,"Números iguais.");
        }
        else
        {
            if(A > B)
            {
                JOptionPane.showMessageDialog(null,"O maior número é "+A);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"O maior número é "+B);
            }
        }
    }
}
