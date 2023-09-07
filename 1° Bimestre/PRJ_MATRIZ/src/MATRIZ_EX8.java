/*
    Nome do programa: MATRIZ_EX8
    Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
    a. A quantidade de cada produto vendido no mês;
    b. A quantidade de produtos vendidos por semana;
    c. O total de produtos vendidos no mês.
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 31/03/2023
*/
import javax.swing.*;
public class MATRIZ_EX8 
{
    public static void main (String args[])
    {
        // declarando variáveis
        String nome_prod[] = new String [3];
        int i, j, qpm, qps, tpm = 0;
        int Mat [][] = new int [4][3];
        // processamento de dados
        // for para coleta de nome de produto
        for ( j = 0; j < 3; j++)
        {
            // mensagem ao usuário e entrada de dados
            nome_prod[j] = JOptionPane.showInputDialog("Digite o nome do produto "+(j+1));
        }
        // for para coleta de semana 
        for ( i = 0; i < 4; i++)
        {
            qps = 0;
            // for para coleta de produto
            for ( j = 0; j < 3; j++)
            {
                // mensagem ao usuário e entrada de dados
                Mat [i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida do produto "+nome_prod[j]+" na semana "+(i+1)));
                tpm = tpm + Mat[i][j];
                qps = qps + Mat[i][j];
            }
            // saída de resultado
            System.out.println("A quantidade de produtos vendidos na semana "+(i+1)+": "+qps);
        }
        // saída de resultado
        System.out.println("O total de produtos vendidos no mes foi: "+tpm);
        // for para coleta de produto
        for ( j = 0; j < 3; j++)
        {
            qpm = 0;
            // for para coleta de semana
            for ( i = 0; i < 4; i++)
            {
                qpm = qpm + Mat [i][j];
            }
            // saída de resultado
            System.out.println("A quantidade do produto "+nome_prod[j]+" vendido no mes foi: "+qpm);
        }
    }
}
