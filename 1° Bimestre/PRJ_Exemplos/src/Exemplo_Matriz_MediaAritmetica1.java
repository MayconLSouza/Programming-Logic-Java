/*
    Nome do programa: Exemplo_Matriz_MediaAritmetica1
    Objetivo: Receba números inteiros e mostre sua posição na matriz [2][2]
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 30/03/2023
*/
import java.text.*;
public class Exemplo_Matriz_MediaAritmetica1
{
    public static void main(String args [ ]) 
    {
	// declaração de variáveis e/ou constantes
	int i , j ; 
	double Notas[][] = {{9.0, 8.0, 8.5},{5.0, 6.0, 7.0}};
	double media , soma;
	// processamento de dados
	for ( i = 0 ; i < 2 ; i++ )
	{  
            media = 0.0;
            soma = 0.0;
            for ( j = 0 ; j < 3; j++ )
            {
                soma = soma + Notas[i][j];
            } // for usando variável j                           ​
            // saída de resultados                                                                          ​
            media = (soma/3);
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("A media do aluno " + (i+1) + ": " + df.format(media));
	} // for usando variável i​
    } // void main​
} // classe Media 