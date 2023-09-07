/*
    Nome do programa: LT01_ETR45
    Objetivo:  Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  25/02/2023
*/
public class LT01_ETR45 
{
    public static void main (String args[])
    {
        double n = 1, s = 0;
        while ( n <= 15 )
        {
            if ( ( n % 2 ) == 0 ) 
            {
                s = ( s + ( ( -1 * n ) / ( Math.pow(n, 2) ) ) );
            }
            else
            {
                s = ( s + ( n / ( Math.pow(n, 2) ) ) );
            }           
            n = ( n + 1 );
        }
        System.out.println("Resultado da serie 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225: "+s);
    }
}

