/*
    Nome do programa: Exemplo_Matriz_MediaAritmetica2
    Objetivo: Receba números inteiros e mostre sua posição na matriz [2][2]
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 30/03/2023
*/
import javax.swing.*;
public class Exemplo_Matriz_MediaAritmetica2
{
    public static void main(String args [ ]) 
    {
        // declaração de variáveis e/ou constantes                                                                    ​
        int i , j ;
        double Notas[ ][ ]  = new double [3][2];
        double media , soma;
        // processamento de dados​
        for ( i = 0 ; i < 3 ; i++ )
        {
            media = 0.0;
            soma = 0.0;
            for ( j = 0 ; j < 2 ; j++ )
            {
                // mensagem ao usuário e entrada de dados​
                Notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " +(j+1)+ " do aluno " +(i+1)));
                soma = soma + Notas[i][j];
            } // for usando variável j​
            // saída de resultados​
            media = soma/2;
            System.out.println ("A media do aluno " +(i+1)+ ": " + media);
        } // for usando variável i​
    } // void main​
}
