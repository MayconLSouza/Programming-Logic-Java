import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETR32
    Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  23/02/2023
*/
public class LT01_ETR32 
{
    public static void main (String args[])
    {
        int i = 1, fat = 1, n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja obter o fatorial: "));
        while ( i <= n )
        {
            fat = ( fat * i );
            i = ( i + 1 );
        }
        JOptionPane.showMessageDialog(null,"O fatorial de "+n+" é "+fat);
    }
}
