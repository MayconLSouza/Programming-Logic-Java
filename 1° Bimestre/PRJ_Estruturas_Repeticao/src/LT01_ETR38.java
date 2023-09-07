import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETR38
    Objetivo:  Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  25/02/2023
*/
public class LT01_ETR38 
{
    public static void main (String args[])
    {
        int n, maior, menor, i;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo: "));
        while ( n < 0 )
        {
            JOptionPane.showMessageDialog(null,"Valor Inválido");
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo: "));  
        }
        maior = n;
        menor = n;
        for ( i = 1; i < 100; i++)
        {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo: "));
            while ( n < 0 )
            {
                JOptionPane.showMessageDialog(null,"Valor Inválido");
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo: "));  
            }
            if ( n > maior )
            {
                maior = n;
            }
            if ( n < menor )
            {
                menor = n;
            }
        }
        JOptionPane.showMessageDialog(null,"O maior valor é "+maior+" e o menor valor é "+menor);
    }
}
