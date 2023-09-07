/*
    Nome do programa: LT01_PROC28
    Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
    Venda Mensal        Preço Atual         Preço Novo
    < 500                  < 30                +10%
    >= 500 e < 1000     >= 30 e < 80           +15%
    >= 1000                >= 80               -5%
    Obs.: para outras condições, preço novo será igual ao preço atual.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC28 
{
    static double Vm, Pa, Pn;
        public static void main (String args[])
        {
            Vm = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de vendas mensais: "));
            Pa = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
            Calc_Preco();
        }
        
        
        static void Calc_Preco()
        {
            if ( Vm < 500 && Pa < 30 ) 
            {
                Pn = ( Pa * 1.1 );
            }
            else if ( ( Vm >= 500 && Vm < 1000 ) && ( Pa >= 30 && Pa <80 ))
            {
                Pn = ( Pa * 1.15 );
            }
            else if ( (Vm >= 1000 ) && ( Pa >=80 ) )
            {
                Pn = ( Pa * 0.95 );
            }
            else
            {
                Pn = Pa;
            }
            JOptionPane.showMessageDialog(null," O preço será " + Pn + " reais.");
        }
}
