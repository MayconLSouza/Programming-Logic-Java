/*
    Nome do programa: VETOR_EX6
    Objetivo: A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 25/03/2023
*/
import javax.swing.*;
public class VETOR_EX7 
{
    public static void main (String args[])
    {
        // declarando variáveis
        int i, aux, a, n = 20, nb, l = 0, h = 19, f = 0, m = 0;
        int vetor[] = new int [20];
        // bubble sort
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
        // pesquisa binária
        nb = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja achar"));       
        // loop da pesquisa binária
        while ( ( l < h ) && ( f == 0) )
        {
            m = ( ( l + h ) / 2 );
            if ( vetor[m] == nb )
            {
                f = 1;
            }
            else if ( vetor[m] > nb )
            {
                h = ( m - 1 );
            }
            else
            {
                l = ( m + 1 );
            }
        }
        // exibe saída
        if ( f == 1 )
        {
            System.out.println("O valor "+nb+" foi encontrado no indice "+m);
        }
        else
        {
            System.out.println("O valor "+nb+" nao foi encontrado");
        }
    }
}
