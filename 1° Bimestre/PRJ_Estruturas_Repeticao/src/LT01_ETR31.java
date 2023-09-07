/*
    Nome do programa: LT01_ETR31
    Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  23/02/2023
*/
public class LT01_ETR31 
{
    public static void main (String args[])
    {
        int i = 10 , q;
        while ( i <= 150 )
        {
            q = ( i * i );
            System.out.println(" O valor do quadrado de "+i+" é "+q);
            i= ( i + 1 );
        }
    }
}
