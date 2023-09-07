/*
    Nome do programa: MATRIZ_EX12
    Objetivo: Carregar códigos das peças em um tabuleiro de xadrez, onde:
    CÓDIGO |   1    |   2   |   3   |   4    |   5    |   6   |   7
    PEÇA   |  PEÃO  | TORRE | BISPO | CAVALO | RAINHA |  REI  | VAZIO
    Calcular e mostrar a soma das peças do tabuleiro.
    Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peça.
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 31/03/2023
*/
public class MATRIZ_EX12 
{
    public static void main (String args[])
    {
        int Mat [][] = new int [8][8];
        int Vet [] = new int [7];
        String Vetnome [] =  {"Peao","Torre","Bispo","Cavalo","Rainha","Rei","Vazio"};
        int i, x, y;
        for ( x = 0; x < 8; x++)
        {
            for ( y = 0; y < 8; y++)
            {
                Mat [x][y] = (int)(Math.random()*7);
                Vet [Mat[x][y]] = Vet [Mat[x][y]] + 1;
            }    
        }
        for ( i = 0; i < 7; i++)
        {
            System.out.println("Quantidade de "+Vetnome[i]+": "+Vet[i]);
        }
    }
}
