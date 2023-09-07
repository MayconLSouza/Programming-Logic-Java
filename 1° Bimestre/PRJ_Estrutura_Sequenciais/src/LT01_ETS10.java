import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS10
    Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  12/02/2023
*/
public class LT01_ETS10 
{
    public static void main (String args[])
    {
    double N1, N2, D;
    N1=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1° número: "));
    N2=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2° número: "));
    D=(N1-N2);
    JOptionPane.showMessageDialog(null,"O valor da diferença desses valores é "+D);
    }
}
