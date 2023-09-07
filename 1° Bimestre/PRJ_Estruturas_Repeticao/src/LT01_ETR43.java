/*
    Nome do programa: LT01_ETR43    
    Objetivo:  Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
    e cresce 2 cm ao ano.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  25/02/2023
*/
public class LT01_ETR43 
{
    public static void main ( String args [])
    {
        int a;
        double ha = 1.10, hm = 1.5;
        for ( a = 0; ha < hm; a++)
        {
            ha = ( ha + 0.03 );
            hm = ( hm + 0.02 );    
        }
        System.out.println("Serao necessarios "+a+" anos para que Ana seja maior que Maria.");
    }
}

