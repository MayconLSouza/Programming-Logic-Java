/*
    Nome do programa: LT01_PROC16
    Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
    Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). 
    A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC16 
{
   static double vh, pd, sf; // ht = horas trabalhadas, vh = valor por hora, pd = percentual de desconto, nd = número de descendentes e sf = salário final.
   static int ht, nd;
    public static void main (String args [])
    {
        ht=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        vh=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora trabalhada: "));
        pd=Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto(%): "));
        nd=Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes: "));
        Calcularsf();  // chamada de procedure.
        JOptionPane.showMessageDialog(null,"O salário a receber será "+sf+" reais.");
    }
    
    
    static void Calcularsf ( ) // módulo de procedure para cálculo de salário final.
    {
        sf = ( ( ( ht * vh ) - ( ( ht * vh ) * ( pd / 100 ) ) ) + ( 100 * nd ) );  // fórmula final da sequência abaixo em que sb =  salário bruto e sl = salário liquído. 
        // sb=(ht*vh); d=(sb*(pd/100)); sl=(sb-d); sf=(sl+(100*nd));            
    }
}