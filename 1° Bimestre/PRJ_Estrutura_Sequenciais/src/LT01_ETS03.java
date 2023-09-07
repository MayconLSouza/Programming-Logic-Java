import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS03
    Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  12/02/2023
*/
public class LT01_ETS03
{
    public static void main (String args[])
    {
    int B, H, S;
    B=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
    H=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
    S=((B*H)/2);
    JOptionPane.showMessageDialog(null,"O valor da área do triângulo é "+S);
    }
}
