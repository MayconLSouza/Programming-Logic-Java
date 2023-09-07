/*
    Nome do programa: LT01_FUNCTION39
    Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
    Casa: 1 2 3 4 ... 64
    Qte:  1 2 4 8 ... N
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
public class LT01_FUNCTION39 
{
    public static void main (String args[])
    {
        int i;
        double q, s = 0;
        for ( i = 0; i < 64; i++ )
        {
            q = FunctionQ(i);
            s = ( s + q );
        }
        System.out.println("Quantidade de graos contidos em um tabuleiro de xadrez: "+s);
    }

    static double FunctionQ( double j )
    {
        double p;
        p = (long) Math.pow(2, j);
        return p;
    }
}
