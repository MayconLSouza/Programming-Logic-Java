/*
    Nome do programa: VETOR_EX5
    Objetivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
    10
    ∑   (A[1] – A[21–1])
    i = 1
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 25/03/2023
*/
import javax.swing.*;
public class VETOR_EX5 
{
    public static void main (String args[])
    {
        // declarando variáveis
        int i, soma = 0;
        int vetor[] = new int [20];
        // processamento de dados
        for ( i = 0; i <= 19; i++)
        {
            // mensagem ao usuário para entrada de dados
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor na posição "+i));
        }
        for ( i = 0; i <= 9; i++)
        {
            // cálculo de somatória
            soma = soma + ( vetor[i] - vetor[19-i] );
        }
        // exibe saída
        System.out.println("O valor da somatoria: "+soma);
    }
}
