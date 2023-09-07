import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS02
    Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  12/02/2023

*/
public class LT01_ETS02
{ 
    public static void main (String args [ ])
    {
    double SL, SR;
    SL=Double.parseDouble(JOptionPane.showInputDialog("Digite o salário liquído: "));
    SR = (SL*1.15);
    JOptionPane.showMessageDialog(null,"O salário reajustado é "+SR);
    }
}

