/*
    Nome do programa: LT01_ETR42
    Objetivo:  Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  25/02/2023
*/
public class LT01_ETR42 
{
    public static void main (String args[])
    {
      double a = 0, b = 1, s = 0;
      do
      {
          a = ( a + 1 );
          s = ( ( a / b ) + s );
          b = ( b + 2 );
      }
      while ( ( a <= 50 ) && ( b <= 99 ) );
      System.out.println("Resultado da serie 1 + 2/3 + 3/5 + ... + 50/99: "+s);
    }   
}
