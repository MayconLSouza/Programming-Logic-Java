import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS16
    Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
    Calcule o salário que serão as  horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). 
    A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  16/02/2023
*/
public class LT01_ETS16 
{
    public static void main (String args[])
    {
        double Ht, Vh, Pd, Nd, Sb, D, Sl, Sf;
        Ht=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        Vh=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora trabalhada: "));
        Pd=Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        Nd=Double.parseDouble(JOptionPane.showInputDialog("Digite o número de descendentes: "));
        Sb=(Ht*Vh);
        D=(Sb*(Pd/100));
        Sl=(Sb-D);
        Sf=(Sl+(100*Nd));
        JOptionPane.showMessageDialog(null,"O salário a receber será "+Sf+" reais.");
    }
}
