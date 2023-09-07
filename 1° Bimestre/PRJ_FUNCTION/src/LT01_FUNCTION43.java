/*
    Nome do programa: LT01_FUNCTION43
    Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
    e cresce 2 cm ao ano.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
public class LT01_FUNCTION43
{
    public static void main (String args[])
    {
        double ha = 1.1 , hm = 1.5;
        System.out.println("Serao necessarios "+Fs(ha,hm)+" anos para que Ana seja maior que Maria.");
    }
    
    static double Fs( double a, double m)
    {
        double s;
        for ( s = 0; a < m; s++)
        {
            a = ( a + 0.03 );
            m = ( m + 0.02 );
        }
        return s;
    }
}