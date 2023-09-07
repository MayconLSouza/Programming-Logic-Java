/*
    Nome do programa: LT01_PROC22
    Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC22 
{
    static int n1, n2; // n1 = número inteiro 1, n2 = número inteiro 2 
        public static void main (String args[])
        {
            n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            Verifica_Igual(); // chamada de procedure para verificação se são números iguais
            Ordem_Crescente(); // chamada de procedure que os colcoca em ordem crescente
        }
        
        
        static void Verifica_Igual()
        {
            while ( n1 == n2 )
            {
                JOptionPane.showMessageDialog(null,"Valores inválidos. Números iguais.");
                n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
                n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            }
        }
        
        
        static void Ordem_Crescente()
        {
            if ( n1 > n2 )
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente: "+n2+", "+n1);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente: "+n1+", "+n2);
            }
        }
}