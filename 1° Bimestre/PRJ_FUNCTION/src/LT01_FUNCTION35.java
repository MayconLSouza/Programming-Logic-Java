/*
    Nome do programa: LT01_FUNCTION35
    Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_FUNCTION35 
{
    public static void main (String args[])
    {
        int num1, num2, maior, menor;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1° número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2° número: "));
        if ( num1 > num2 )
        {
            maior = num1;
            menor = num2;
        }
        else
        {
            maior = num2;
            menor = num1;
        }
        JOptionPane.showMessageDialog(null, "O valor da somatória é: "+FunctionS(maior, menor));
    }
    
    static int FunctionS( int mai, int men)
    {
        int i, s = 0;
        for ( i = ( men + 1 ); i < mai; i++)
        {
            if ( ( i % 2 ) != 0)
            {
                s = ( s + i );
            }
        }
        return s;
    }
}
