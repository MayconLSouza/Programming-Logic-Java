import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS04
    Objetivo: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  12/02/2023
*/
public class LT01_ETS04
{
    public static void main (String args[])
    {
    int C, F;
    C=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da temperatura em C°: "));
    F = (((9*C)+160)/5);
    JOptionPane.showMessageDialog(null,"O valor da temperatura em F° é "+F);
    }    
}
