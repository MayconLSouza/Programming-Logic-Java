/*
    Nome do programa: Exemplo_Estrutura_Repeticao_For
    Objetivo: Quadrado dos números entre o intervalo {10;30}.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  23/02/2023
*/
public class Exemplo_Estrutura_Repeticao_For 
{
    public static void main (String args[])
    {
        int num= 10, res;
        for (num = 10; num <=30; num++) 
        {
            res = (num * num);
            System.out.println(" O valor é "+num+ "quadrado é "+res);
        }
    }
}
