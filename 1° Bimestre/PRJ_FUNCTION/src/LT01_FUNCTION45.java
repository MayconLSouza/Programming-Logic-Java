/*
    Nome do programa: LT01_FUNCTION45
    Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
public class LT01_FUNCTION45 
{
    public static void main (String args[])
    {
        double l = 1;
        System.out.println("Resultado da serie: "+Fs(l));
    }
    
    static double Fs(double n)
    {
        double s = 0;
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
        return s;
    }
}
