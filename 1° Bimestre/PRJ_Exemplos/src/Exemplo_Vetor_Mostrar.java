/*
    Nome do programa: Exemplo_Vetor_Mostrar
    Objetivo: Receba 5 números através de um vetor e mostre seus índices(posições).
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 23/03/2023
*/
import javax.swing.*;
public class Exemplo_Vetor_Mostrar 
{
    public static void main(String args [ ])
    {
        int i;
        int Vet[ ] = new int [5];
        for ( i = 0 ; i < 5 ; i++ )
        {
            Vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            System.out.println ("Vet[" + i + "] = " +Vet[i]);
        }
    }
}
