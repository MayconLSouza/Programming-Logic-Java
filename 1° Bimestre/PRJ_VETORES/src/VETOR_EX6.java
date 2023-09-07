/*
    Nome do programa: VETOR_EX6
    Objetivo: Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 25/03/2023
*/
import javax.swing.*;
public class VETOR_EX6 
{
    public static void main (String args[])
    {
        // declarando variáveis
        int i, aux, a, n = 20;
        int vetor[] = new int [20];
        // processamento de dados
        for ( i = 0; i < 20; i++ )
        {
            // mensagem ao usuário para entrada de dados
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor na posição "+i));
        }
        do
        {
            a = 0;
            for ( i = 0; i < ( n - 1 ); i++)
            {
                // caso o valor do vetor atual seja maior do que o da próxima posição, inverte as posições
                if ( vetor[i] > vetor [i+1])
                {
                    aux = vetor[i+1];
                    vetor[i+1] = vetor[i];
                    vetor[i] = aux;
                    a = 1;
                }
            }
            n = n - 1;
        }
        while ( a != 0 );
        for ( i = 0; i < 20; i++)
        {
            // exibe saída dos dados de forma crescente
            System.out.println("O valor do vetor no indice "+i+": "+vetor[i]);
        }
    }
}
