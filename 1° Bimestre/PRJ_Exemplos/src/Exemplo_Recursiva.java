/*
    Nome do programa: Exemplo_Recursiva
    Objetivo: Calcule o fatorial de um número dado pelo usuário
    Programador : Maycon Souza
    Data de desenvolvimento: 16/03/2023
*/
import javax.swing.*;
public class Exemplo_Recursiva 
{
    public static void main (String args[])
    {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null,"O fatorial de "+num+" é "+FFAT(num));
    }
    
    static int FFAT ( int n )
    {
        int fat;
        if ( n != 1)
        {
            fat = n * FFAT( n - 1 );
            return fat;
        }
        else
        {
            return 1;
        }
    }
}
