import javax.swing.*;
/*
    Nome do programa: LT01_ETD18
    Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD18 
{
    public static void main (String args[])
    {
        int A, B, D;
        A=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        B=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if (A > B)
        {
            D=(A-B);
            JOptionPane.showMessageDialog(null,"A diferença do maior pelo menor valor é: "+D);
        }
        else
        {
            D=(B-A);
            JOptionPane.showMessageDialog(null,"A diferença do maior pelo menor valor é: "+D);
        }
    }
}
