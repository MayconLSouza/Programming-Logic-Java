/*
    Nome do programa: LT01_PROC18
    Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC18 
{
    static int n1, n2, d; // n1 = número inteiro 1, n2 = número inteiro 2 e d = diferença
        public static void main (String args[])
        {
            n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            Verificaigual(); // chamada de procedure para verificação se são números iguais
            Calculard(); // chamada de procedure
            JOptionPane.showMessageDialog(null,"A diferença do maior pelo menor valor é "+d);
        }
        
        
        static void Verificaigual()
        {
            while ( n1 == n2 )
            {
                JOptionPane.showMessageDialog(null,"Valores inválidos. Números iguais.");
                n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
                n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            }
        }
        
        
        static void Calculard()
        {
            if ( n1 > n2 )
            {
                d = ( n1 - n2 );
            }
            else
            {
                d = ( n2 - n1 );
            }
        }
}
