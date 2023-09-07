/*
    Nome do programa: Exemplo_Matriz_Mostrar
    Objetivo: Receba números inteiros e mostre sua posição na matriz [2][2]
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 30/03/2023
*/
import javax.swing.*;
public class Exemplo_Matriz_Mostrar
{
    public static void main(String args [ ]) 
    {
	// declaração de variáveis e/ou constantes
        int Mat [ ][ ] = new int [2][2]; 
        int i, j;
	// processamento de dados
	for ( i = 0 ; i < 2 ; i++ )
	{ 
            for ( j = 0 ; j < 2 ; j++)
            {
                // mensagem ao usuário e entrada de dados​
                Mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                // saída de resultados​
                System.out.println("Mat[" +i+ "][" +j+ "] = " +Mat[i][j]);
            } // for usando a variável j​
        }// for usando a variável i​
    } // void main​
} // classe Mostrar