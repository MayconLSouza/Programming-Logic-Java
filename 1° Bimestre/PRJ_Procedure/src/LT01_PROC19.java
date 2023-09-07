/*
    Nome do programa: LT01_PROC19
    Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC19 
{
    static double n1, n2, maior; // n1 = número inteiro 1, n2 = número inteiro 2 e maior = maior número
        public static void main (String args[])
        {
            n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
            n2=Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
            Verificaigual(); // chamada de procedure para verificação se são números iguais
            Calcularmaior();
            JOptionPane.showMessageDialog(null,"O maior número é "+maior);
        }
        
        
        static void Verificaigual()
        {
            while ( n1 == n2 )
            {
                JOptionPane.showMessageDialog(null,"Valores inválidos. Números iguais.");
                n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número real: "));
                n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um número real: "));
            }
        }
        
        
        static void Calcularmaior()
        {
            if ( n1 > n2 )
            {
                maior = n1;
            }
            else
            {
                maior = n2;
            }
        }
}
