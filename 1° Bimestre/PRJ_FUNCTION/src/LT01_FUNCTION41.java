/*
    Nome do programa: LT01_FUNCTION41
    Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
public class LT01_FUNCTION41 
{
    public static void main (String args[])
    {
        int s, i1, i2;
        for ( i1 = 1; i1 <= 6; i1++)
        {
            for ( i2 = 1; i2 <= 6; i2++)
            {
                s = Fr( i1, i2);
                if ( s == 7 )
                {
                    System.out.println(i1+" + "+i2+" = 7");
                }
            }
        }
    }
    
    static int Fr( int j1, int j2)
    {
        int r;
        r = ( j1 + j2 );
        return r;
    }
}
