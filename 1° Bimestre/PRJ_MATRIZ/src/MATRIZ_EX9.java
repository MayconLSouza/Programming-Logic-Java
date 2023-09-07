/*
    Nome do programa: MATRIZ_EX9
    Objetivo: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:
    1 | - | -  | -
    - | 4 | -  | -
    - | - | 16 | -
    - | - | -  | 64
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 31/03/2023
*/
import java.util.Random;
public class MATRIZ_EX9 
{
    public static void main (String args[])
    {
        // declarando variáveis
        int Mat [][] = new int [4][4];
        int i, j;
        // criando uma instância da classe Random
        Random random = new Random();
        // processamento de dados;
        for ( i = 0; i < 4; i++)
        {
            for ( j = 0; j < 4; j++)
            {
                if ( i == j)
                {
                    Mat[i][j] = (int) Math.pow(4, i);   
                }
                else
                {
                    Mat[i][j] = random.nextInt(100);
                }
                System.out.println("Matriz["+i+"]["+j+"] = "+Mat[i][j]);
            }
        }
    }
}
