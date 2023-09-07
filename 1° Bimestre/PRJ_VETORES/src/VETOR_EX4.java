/*
    Nome do programa: VETOR_EX4
    Objetivo: Criar e coletar em um vetor [30] real e calcular e exibir:
    a. A média do grupo;
    b. A quantidade de notas acima da média do grupo;
    c. As posições dos valores das notas abaixo da média do grupo.
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 24/03/2023
*/
import javax.swing.*;
public class VETOR_EX4 
{
    public static void main (String args[])
    {
        // declarando variáveis
        int i, q = 0;
        double vetor[] = new double [30], media = 0, p;
        //processamento de dados
        for ( i = 0; i <= 9; i++)
        {
            // mensagem ao usuário para entrada de dados
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do vetor na posição "+i));
            // soma de média
            media = media + vetor[i];
        }
        // cálculo de média
        media = media / 10;
        // exibe média
        System.out.println("A media do grupo: "+media);
        for ( i = 0; i <= 9; i++)
        {
            // caso nota acima da média
            if ( vetor[i] > media )
            {
                q++;
            }
            // caso nota abaixo da média
            else if ( vetor[i] < media )
            {
                // exibe posição da nota
                System.out.println("\nA nota "+vetor[i]+" de indice "+i+" encontra-se abaixo da media.");
            }
        }
        // exibe quantidade de notas acima da média
        System.out.println("\nUm total de "+q+" alunos apresentaram notas acima da media.");
        // porcentagem de alunos com nota acima da média
        p = ( (double)q / 10 ) * 100;
        System.out.println("\nIsso represnta "+p+"% de alunos com nota acima da media.");
    }
}
