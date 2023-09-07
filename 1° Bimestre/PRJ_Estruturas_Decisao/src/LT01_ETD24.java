import javax.swing.*;
/*
    Nome do programa: LT01_ETD24
    Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD24 
{
    public static void main (String args[])
    {
        int A;
        A=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if  ( (A%2) == 0 )
        {
            if  ( (A%3) == 0 )
            {
                JOptionPane.showMessageDialog(null,"O número é divisível por 2 e 3");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"O número não é divisível por 2 e 3");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"O número não é divisível por 2 e 3");
        }
    }
}
