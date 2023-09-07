/*
    Nome do programa: LT01_FUNCTION31
    Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  09/03/2023
*/
public class LT01_FUNCTION31 
{
    public static void main (String args[])
    {
        int i;
        for ( i = 10; i <= 150; i++)
        {
            System.out.println("O quadrado do número "+i+" é "+FunctionQ(i));
        }
    }
    
    static int FunctionQ ( int j )
    {
        int q;
        q = ( j * j );
        return q;
    }
}
