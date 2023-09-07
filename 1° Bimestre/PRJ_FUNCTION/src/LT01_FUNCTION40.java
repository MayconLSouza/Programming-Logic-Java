/*
    Nome do programa: LT01_FUNCTION40
    Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
import javax.swing.*;
public class LT01_FUNCTION40 
{
    public static void main (String args [])
    {
        int n1, n2, maior, menor, np, div;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
        if ( n1 == n2 )
        {
            JOptionPane.showMessageDialog(null,"Números iguais. Nenhum número primo entre eles");
        }
        else
        {
            while ( ( n1 < 0 ) || ( n2 < 0 ) )
            {
                JOptionPane.showMessageDialog(null,"Número(s) Inválido");
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número (positivo): "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número (positivo): "));
            }
            if ( n1 > n2 )
            {
                maior = n1;
                menor = n2;
            }
            else
            {
                maior = n2;
                menor = n1;
            }
            for ( np = ( menor + 1 ); np < maior; np ++)
            {
                div = FunctionD(np);
                if ( div == 0)
                {
                    System.out.println("Numero primo: "+np);
                }
            }
        }
    }

    static int FunctionD( int nump)
    {
        int d, i;
        d = 2;
        for ( i =1; i <= nump; i++)
        {
            if ( (nump % i) == 0)
            {
                d = ( d - 1 );
            }
        }
        return d;
    }
}
