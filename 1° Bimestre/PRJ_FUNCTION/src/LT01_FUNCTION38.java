/*
    Nome do programa: LT01_FUNCTION38
    Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
import javax.swing.*;
public class LT01_FUNCTION38 
{
    public static void main (String args[])
    {
        int n, maior = 0, menor = 0, i;
        for ( i = 1; i <= 10; i++)
        {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo: "));
            while ( n < 0 )
            {
                JOptionPane.showMessageDialog(null,"Valor Inválido");
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo: "));  
            }
            if ( i == 1 )
            {
                maior = n;
                menor = n;
            }
            else if ( n > maior )
            {
                maior = FunctionMAIOR( n, maior );
            }
            else if ( n < menor)
            {
                menor = FunctionMENOR( n, menor );
            }
        }
        JOptionPane.showMessageDialog(null, " O maior e menor valor dos números inseridos são, respectivamente: "+maior+" e "+menor);   
    }
    
    static int FunctionMAIOR( int num, int mai )
    {
        mai = num;
        return mai;
    }
    
    static int FunctionMENOR( int num, int men )
    {
        men = num;
        return men;
    }
}