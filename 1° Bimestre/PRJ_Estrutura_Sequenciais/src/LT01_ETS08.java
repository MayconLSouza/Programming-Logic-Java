import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS08
    Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  12/02/2023
*/
public class LT01_ETS08 
{
    public static void main (String args[])
    {
    double D, M;
    D=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
    M=(D*1.013);
    JOptionPane.showMessageDialog(null,"O valor após 1 mês será de "+M);
    }
}
