/*
    Nome do programa: VETOR_EX1
    Objetivo: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
    a. A média dos valores entre 10 e 200;
    b. A soma dos números ímpares.
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 24/03/2023
*/
import javax.swing.*;
public class VETOR_EX1 
{
    public static void main (String args[])
    {
        // declarando variáveis
        int i, j = 0, soma = 0;
        int vetor [] = new int [50]; 
        double media = 0;
        // processamento de dados
        for ( i = 0; i <= 9; i++)
        {
            // mensagem ao usuário para entrada de dados
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para a posição "+i+" do vetor"));
            // se ímpara soma
            if ( ( vetor[i] % 2 ) != 0)
            {
                soma = soma + vetor[i];
            }
            // se entre 10 e 200 soma e conta quantas vezes(j)
            if ( ( vetor[i] >= 10 ) && ( vetor[i] <= 200 ) )
            {
                j++;
                media = media + vetor[i];
            }
        }
        // cálculo de média
        media = media / j;
        // exibição de saída
        System.out.println("A soma dos valores impares: "+soma+"\nA media dos valores entre 10 e 200: "+media);
    }
}
