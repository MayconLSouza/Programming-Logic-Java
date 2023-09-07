/*
    Nome do programa: Exemplo_Vetor_Loja
    Objetivo: Uma pequena loja de artesanato possui apenas  um vendedor e comercializa cinco tipos de objetos. O vendedor recebe, mensalmente, salário de R$ 400,00, 
    acrescido de 5% do valor total de suas vendas. O valor unitário dos objetos deve ser informado e armazenado em um vetor: a quantidade vendida de cada peça deve ficar em outro vetor, 
    mas na mesma posição. Crie um programa que receba os preços e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho cinco). 
    Depois, determine e mostre um relatório contendo quantidade vendida, valor unitário e valor total de cada objeto. Ao final deverá ser mostrado o valor geral das vendas 
    e o valor da comissão que será paga ao vendedor.​
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 23/03/2023
*/
import javax.swing.*;
public class Exemplo_Vetor_Loja 
{
    public static void main (String args[])
    {
        int i;
        double qtd [] = new double [5], preco [] = new double [5], tot_geral = 0, tot_vendas, comissao;
        String nome_prod [] = new String [5];
        // processamento de dados
        for ( i = 0; i <= 4;i++)
        {
            nome_prod[i]= JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"° produto");
            qtd[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida do(a) "+nome_prod[i]));
            preco[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do(a) "+nome_prod[i]));
        }
        for ( i = 0; i <= 4;i++)
        {
            tot_vendas = qtd[i] * preco[i];
            JOptionPane.showMessageDialog(null,"Quantidade vendida do(a) "+nome_prod[i]+": "+qtd[i]+"\nValor do(a) "+nome_prod[i]+": R$ "+preco[i]+"\nTotal geral da venda: R$ "+tot_vendas);
            tot_geral = tot_geral + tot_vendas;
        }
        comissao = tot_geral * 0.05;
        JOptionPane.showMessageDialog(null,"Valor total das vendas: R$ "+tot_geral+"\nValor da comissão: R$ "+comissao);
    }
}
