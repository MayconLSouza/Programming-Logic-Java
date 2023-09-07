/*
    Nome do programa: Exemplo_Estrutura_Repeticao_Do_While
    Objetivo: Quadrado dos números entre o intervalo {10;30}.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  23/02/2023
*/
public class Exemplo_Estrutura_Repeticao_Do_While 
{
    public static void main (String args[])
    {
        int num = 10, res;
        do 
        {
            res = (num * num);
            System.out.println(" O valor é "+num+ "quadrado é "+res);
            num = (num+1); 
        }
        while ((num>=10) && (num<=30));
    }
}
