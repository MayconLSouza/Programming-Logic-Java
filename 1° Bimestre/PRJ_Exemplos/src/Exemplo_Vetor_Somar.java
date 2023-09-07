/*
    Nome do programa: Exemplo_Vetor_Somar
    Objetivo: Receba 5 números através de um vetor e some-os.
    Programador : Maycon L.M. Souza 
    Data de desenvolvimento: 23/03/2023
*/
import javax.swing.*;
public class Exemplo_Vetor_Somar 
{
    public static void main(String args [ ])
    {
        int VetSoma [ ] , i , soma = 0;
        VetSoma = new int [5];
        for ( i = 0 ; i <= 4 ; i++ )
        {
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma = soma + VetSoma[i];
        }
        System.out.println ("Valor da soma:  " + soma);
    }
}
