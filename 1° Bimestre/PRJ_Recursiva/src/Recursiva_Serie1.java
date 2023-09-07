/*
    Nome do programa: Recursiva_Serie1
    Objetivo: Serie1 = ( 1 + 2 + 3 + ... + 100 )
    Programador : Maycon Souza
    Data de desenvolvimento: 18/03/2023
*/
public class Recursiva_Serie1 
{
    public static void main (String args[])
    {
        int num = 1;
        System.out.println("O resultado da serie: "+FSerie1(num));
    }
    
    static int FSerie1(int n)
    {
        int soma;
        if ( n < 100 )
        {
            soma = n + FSerie1(n+1);
            return soma;
        }
        else
        {
            return 100;
        }
    }
}
