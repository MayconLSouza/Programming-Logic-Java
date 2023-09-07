/*
    Nome do programa: Exemplo_Vetor_Media_Aritmetica
    Objetivo: Calcule a média aritmética de 4 notas coletadas por um vetor.
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 23/03/2023
*/
import javax.swing.*;
public class Exemplo_Vetor_Media_Aritmetica 
{
    public static void main(String args [ ])  
    {
        // declaração de variáveis e/ou constantes
        int i;
        double media , soma = 0;
        double notas[ ] = new double [4];
        // processamento de dados 
        for ( i = 0 ; i <= 3 ; i++ )
        {
            // mensagem ao usuário e entrada de dados​
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "  +(i+1)));
            soma = soma + notas[i];
        } // for​
        media = soma/4;
        // saída de resultados​
        JOptionPane.showMessageDialog(null,"A média é: " +media);
    } // void main​
} // classe MediaAritmetica ​
       
