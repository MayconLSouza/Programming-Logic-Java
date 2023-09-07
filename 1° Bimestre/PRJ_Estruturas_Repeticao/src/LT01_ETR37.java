import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETR37
    Objetivo:  Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  25/02/2023
*/
public class LT01_ETR37 
{
    public static void main (String args[])
    {
        int n, i, f, x = 0, y = 1 ;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        while ( n < 1)
        {
            JOptionPane.showMessageDialog(null,"Número Inválido");
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro (maior que 0): "));       
        }
        if ( n == 1 )
        {
            System.out.println("O 1o termo da serie de Fibonacci: 1");
        }
        else
        {
            System.out.println("O 1o termo da serie de Fibonacci: 1");
            for ( i = 2; i <=n; i++ )
            {
            f = ( x + y );
            x = y;
            y = f;
            System.out.println("O "+i+"o termo da serie de Fibonacci: "+f);
            }
        }
    }
}
