/*
    Nome do programa: LT01_FUNCTION36
    Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
import javax.swing.*;
public class LT01_FUNCTION36 
{
    public static void main (String args[])
    {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        JOptionPane.showMessageDialog(null,"O resultado da série é "+FunctionS(num));
    }
    
    static double FunctionS( double n )
    {
        double i, fat = 1, s = 0;
        for ( i = 1; i <= n; i++ )
        {
           fat = ( fat * i );
           s = ( s + ( 1 / fat ));
        }
        return s;
    }
}
