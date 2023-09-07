/*
    Nome do programa: MATRIZ_EX10
    Objetivo: Criar uma matriz [8][8] onde o programa irá carregar segundo:
    casa  | 1 | 2 | 3 | 4 | ...
    valor | 1 | 2 | 4 | 8 | ...
    *Exibir a soma dos valores.
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 31/03/2023
*/
public class MATRIZ_EX10 
{
    public static void main (String args [])
    {
        // declarando variáveis
        double Mat [][] = new double [8][8];
        int i, j;
        double soma = 0, e = 0;
        // processamento de dados
        // for para linha
        for ( i = 0; i < 8; i++)
        {
            // for para coluna
            for ( j = 0; j < 8; j++)
            {
                Mat[i][j] = Math.pow(2,e);
                soma = soma + Mat[i][j];
                e++;
                // saída de resultado
                System.out.println("Matriz["+i+"]["+j+"] = "+Mat[i][j]);
            }
        }
        // saída de resultado
        System.out.println("Soma dos valores das casas: "+soma);
    }
}
