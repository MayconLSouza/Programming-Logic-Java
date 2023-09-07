/*
    Nome do programa: LT01_ETR41
    Objetivo:  Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  25/02/2023
*/
public class LT01_ETR41 
{
    public static void main (String args[])
    {
       int i1, i2;
       for ( i1 = 1; i1 <= 6; i1++)
       {
           for ( i2 = 1; i2 <= 6; i2++)
           {
               if ( ( i1 + i2 ) == 7 )
                   System.out.println(i1+" + "+i2+" = 7");
           }
       }
    } 
}
