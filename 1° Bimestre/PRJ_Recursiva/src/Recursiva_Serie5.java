/*
    Nome do programa: Recursiva_Serie5
    Objetivo: Serie5 = N! + (N-1)! + (N-2)! ... + 1!
    Programador : Maycon Souza
    Data de desenvolvimento: 18/03/2023
*/

import javax.swing.*;
public class Recursiva_Serie5 
{
    public static void main(String args[])
    {
       int num;
       num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
       JOptionPane.showMessageDialog(null, "O resultado da serie: "+FSoma(num));
    }
    
    // Calcula a soma da série para o número n
    static int FSoma(int n)
    {
        int soma;
        if ( n != 1 )
        {
            soma = FFAT(n) + FSoma(n-1);
            return soma;
        }
        else
        {
            return 1;
        }
    }
    
    // Calcula o fatorial de um número
    static int FFAT ( int a )
    {
        int fat;
        if ( a != 1)
        {
            fat = a * FFAT( a - 1 );
            return fat;
        }
        else
        {
            return 1;
        }
    }
}
