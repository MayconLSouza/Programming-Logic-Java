import javax.swing.*;
/*
    Nome do programa: Exemplo1_Estrutura_Decisao_Simples
    Objetivo: Desenvolva um algoritmo que receba um valor numérico real, verifique e mostre se esse número é positivo.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class Exemplo_Estrutura_Decisao_Simples 
{
    public static void main (String args [ ]) 
    {
      double x; // declaração de variáveis 
      // mensagem ao usuário e entrada de dados
      x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
      // condicionais
      if (x > 0)
      {
        System.out.println (x + " é positivo"); // saída de resultados
      } // fim do if
    } // fim do void main
} // fim da classe Positivo

