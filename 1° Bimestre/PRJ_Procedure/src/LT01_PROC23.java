/*
    Nome do programa: LT01_PROC23
    Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC23 
{
    static int n1, n2, n3, n4; // n1 = número inteiro 1, n2 = ...
        public static void main (String args[])
        {
            n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número inteiro"));
            n3=Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro número inteiro"));
            n4=Integer.parseInt(JOptionPane.showInputDialog("Digite um quarto número inteiro"));
            Ordem_Crescente(); // chamada de procedure para colocar valores em ordem crescente
        }
        
        
        static void Ordem_Crescente ()
        {
            if  (n4 < n1)
            {
            JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+n4+", "+n1+", "+n2+", "+n3);
            }
            else if (n4 > n3)
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+n1+", "+n2+", "+n3+", "+n4);
            }
            else if (n4 > n2)
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+n1+", "+n2+", "+n4+", "+n3);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são "+n1+", "+n4+", "+n2+", "+n3);
            }
        }
}
