/*
    Nome do programa: VETOR_EX3
    Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
    Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
    VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 24/03/2023
*/
import javax.swing.*;
public class VETOR_EX3 
{
    public static void main (String args[])
    {
        // declarando variáveis
        int i;
        int vt1[] = new int [3], vt2[] = new int [3], vt3[] = new int [6];
        // processamento de dados
        for ( i = 0; i <= 2; i++)
        {
            // vetor 1
            vt1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor 1 na posição "+i));
            // vetor 2
            vt2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor 2 na posição "+i));
            // vetor 3
            vt3[i] = vt1[i];
            vt3[i+3] = vt2[i];
        }
        // exibe saídas
        for ( i = 0; i <= 5; i++)
        {
            System.out.println("O valor do vetor 3 no indice "+i+": "+vt3[i]);
        }
    }
}
