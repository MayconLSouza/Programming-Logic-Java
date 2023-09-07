import javax.swing.*;
/*
    Nome do programa: LT01_ETD23
    Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD23 
{
    public static void main (String args[])
    {
        int n1, n2, n3, n4;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n4=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if  (n4 < n1)
        {
            JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+n4+", "+n1+", "+n2+", "+n3);
        }
        else
        {
            if (n4 > n3)
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+n1+", "+n2+", "+n3+", "+n4);
            }
            else
            {
                if (n4 > n2)
                {
                    JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+n1+", "+n2+", "+n4+", "+n3);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+n1+", "+n4+", "+n2+", "+n3);
                }
            }
        }
    }
}
