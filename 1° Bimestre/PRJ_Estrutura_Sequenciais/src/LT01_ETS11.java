import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS11
    Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  16/02/2023
*/
public class LT01_ETS11
{
    public static void main (String args[])
    {
    double R, C;
    R=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da circunferência: "));
    C=(2*Math.PI*R);
    JOptionPane.showMessageDialog(null,"O valor do comprimento da circunferência é: "+C);
    }
}
