/*
    Nome do programa: LT01_PROC26
    Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC26 
{
    static int n1, n2; // n1 = número inteiro 1 e n2 = número inteiro 2
        public static void main (String args[])
        {
            n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
            n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
            Calc_Multiplo();
        }
        
        
        static void Calc_Multiplo()
        {
            if (n1 == n2)
            {
                JOptionPane.showMessageDialog(null,"Números iguais.");
            }
            else
            {
                if ( n1 > n2 )
                {
                    if  ( ( n1 % n2 ) == 0 )
                    {
                        JOptionPane.showMessageDialog(null,n1+" é múltiplo de "+n2);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,n1+" não é múltiplo de "+n2);
                    }   
                }
                else
                {
                    if  ( ( n2 % n1 ) == 0 )
                    {
                        JOptionPane.showMessageDialog(null,n2+" é múltiplo de "+n1);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,n2+" não é múltiplo de "+n1);
                    }
                }
            }
        }
}
