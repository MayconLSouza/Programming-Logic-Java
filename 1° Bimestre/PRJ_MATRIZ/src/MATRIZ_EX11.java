/*
    Nome do programa: MATRIZ_EX11
    Objetivo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
    1 | 1 | 1 | 1 | 1 | 1 | 1 | 1
    1 | 2 | 2 | 2 | 2 | 2 | 2 | 1
    1 | 2 | 3 | 3 | 3 | 3 | 2 | 1
    1 | 2 | 3 | 4 | 4 | 3 | 2 | 1
    1 | 2 | 3 | 4 | 4 | 3 | 2 | 1
    1 | 2 | 3 | 3 | 3 | 3 | 2 | 1
    1 | 2 | 2 | 2 | 2 | 2 | 2 | 1
    1 | 1 | 1 | 1 | 1 | 1 | 1 | 1
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 31/03/2023
*/
import java.util.Arrays;
public class MATRIZ_EX11 
{
    public static void main (String args [])
    {
        // declarando variáveis
        int[][] Mat = new int[8][8];
        // processamento de dados
        for (int i = 1; i <= 4; i++) 
        {
            for (int j = (i - 1); j < (9 - i); j++) 
            {
                for (int k = (i - 1); k < (9 - i); k++) 
                {
                    Mat[j][k] = i;
                }
            }
        }
        for (int i = 0; i < 8; i++) 
        {
            System.out.println(Arrays.toString(Mat[i]));
        }
    }
}
