import javax.swing.*;
/*
    Nome do programa: LT01_ETD22
    Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD22 
{
    public static void main (String args[])
    {
        int A, B;
        A=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        B=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if (A == B)
        {
            JOptionPane.showMessageDialog(null,"Números iguais");
        }
        else
        {
            if (A < B)
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+A+" e "+B);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+B+" e "+A);
            }
        }
    }
}
