import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS09
    Objetivo: Receba 2 números inteiros. Calcule e mostre a soma dos quadrados.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  12/02/2023
*/
public class LT01_ETS09
{
    public static void main (String args[])
    {
    int N1, N2, SQ;
    N1=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1° número: "));
    N2=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2° número: "));
    SQ=((N1*N1)+(N2*N2));
    JOptionPane.showMessageDialog(null,"O valor da soma dos quadrados destes números é "+SQ);
    }
}
