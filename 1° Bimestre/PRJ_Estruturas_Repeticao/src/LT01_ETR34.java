import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETR34
    Objetivo:  Receba um número. Calcule e mostre os resultados da tabuada desse número.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  23/02/2023
*/
public class LT01_ETR34 
{
    public static void main (String args[])
    {
        int n, i, t = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        for ( i = 0; i <= 10; i++ )
        {
             t = ( n * i );
             System.out.println("O valor de "+n+"*"+i+" é "+t);
        }
    }
}
