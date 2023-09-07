import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS07
    Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  12/02/2023
*/
public class LT01_ETS07 
{
    public static void main (String args[])   
    {
    int C, L, H, V;
    C=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do comprimento do paralelepípedo: "));
    L=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da largura do paralelepípedo: "));
    H=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do paralelepípedo: "));
    V=(C*L*H);
    JOptionPane.showMessageDialog(null,"O valor do volume do paralelepípedo é "+V);
    }
}
