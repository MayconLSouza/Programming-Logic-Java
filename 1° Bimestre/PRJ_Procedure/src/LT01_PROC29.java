/*
    Nome do programa: LT01_PROC29
    Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
    Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC29 
{
    static double I, D, M;
        public static void main (String args[])
        {
            I = Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de investimento ( 1 = poupança / 2 = renda fixa): "));
            Calc_Investimento();
        }
        
        
        static void Calc_Investimento()
        {
            if ( I == 1 )
            {
                D = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
                M = ( D * 1.03 );
                JOptionPane.showMessageDialog(null,"O valor do investimento na poupança corrigido após 30 dias será $"+M);
            }
            else if ( I == 2 )
            {
                D = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
                M = ( D * 1.05 );
                JOptionPane.showMessageDialog(null,"O valor do investimento na renda fixa corrigido após 30 dias será $"+M);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Investimento inválido");
            }
        }
}
