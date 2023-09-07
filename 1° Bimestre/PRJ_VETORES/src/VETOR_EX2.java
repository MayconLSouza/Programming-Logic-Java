/*
    Nome do programa: VETOR_EX2
    Objetivo: Criar e coletar um vetor [100] inteiro e exibir:
    a. O maior e o menor valor;
    b. A média dos valores.
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 24/03/2023
*/
import javax.swing.*;
public class VETOR_EX2 
{
    public static void main (String args[])
    {
        // declarando variáveis
        int i, maior, menor, j = 0;
        int vetor[] = new int [100];
        double media = 0;
        // processamento de dados
        // coletando primeiro valor e igualando-o a maior, menor e media
        vetor[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para a posição 0 do vetor"));
        maior = vetor[0];
        menor = vetor[0];
        media = vetor[0];
        for ( i = 1; i <= 99; i++)
        {
            // mensagem ao usuário para entrada de dados
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para a posição "+i+" do vetor"));
            // caso valor do vetor seja maior que maior
            if ( vetor[i] > maior )
            {
                maior = vetor[i];
            }
            // caso valor do vetor seja menor que menor 
            if ( vetor[i] < menor )
            {
                menor = vetor[i];
            }
            // soma média
            media = media + vetor[i];
        }
        // cálculo média
        media = media / 100;
        // exibe saídas
        System.out.println("O maior valor: "+maior+"\nO menor valor: "+menor+"\nA media dos valores: "+media);
    }
}
