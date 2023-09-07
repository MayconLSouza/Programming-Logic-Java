import javax.swing.*; 
/*
    Nome do programa: Exemplo3_Estrutura_Decisao_Encadeada
    Objetivo: Desenvolva um algoritmo que receba quatro notas bimestrais, calcula e mostra a média aritmética dessas quatro notas, bem como, 
    se o aluno foi aprovado (média >= 7), reprovado (média < 3) ou em exame (média >= 3 e média <7).
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class Exemplo_Estrutura_Decisao_Encadeada 
{
    public static void main (String args [ ]) 
    {
        double n1, n2, n3, n4, media; // declaração de variáveis
        // mensagem ao usuário e entrada de dados
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        media = (n1 + n2 + n3 + n4) / 4; // processamento de dados
        System.out.println ("A média é: " + media); // saída de resultados
        // Condicionais
        if (media >= 7) 
        {
            System.out.println ("Aluno aprovado");
        }
        else 
        {
            if (media < 3)     
            {
                System.out.println ("Aluno reprovado");
            }
            else    
            {
                System.out.println ("Aluno em exame");
            } // do media < 3
        } // do media >= 7
    } // fim do void main
} //fim da classe} //fim da classe

