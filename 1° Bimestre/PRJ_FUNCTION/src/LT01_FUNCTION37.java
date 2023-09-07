/*
    Nome do programa: LT01_FUNCTION37
    Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
import javax.swing.*;
public class LT01_FUNCTION37 
{
    public static void main (String args [])
    {
        int num, i, x = 0, y = 1, fib;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        while ( num < 1)
        {
            JOptionPane.showMessageDialog(null,"Número Inválido");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro (maior que 0): "));       
        }
        if ( num == 1 )
        {
            System.out.println("O 1o termo da serie de Fibonacci: 1");
        }
        else
        {
            System.out.println("O 1o termo da serie de Fibonacci: 1");
            for ( i = 2; i <= num; i++ )
            {
                fib = Fibonnacci(x,y);
                System.out.println("O "+i+"o termo da serie de Fibonacci: "+fib);
                x = y;
                y = fib;
            }
        }    
    }
    
    static int Fibonnacci( int a, int b)
    {
        int f;
        f = ( a + b );
        return f;
    }
}
