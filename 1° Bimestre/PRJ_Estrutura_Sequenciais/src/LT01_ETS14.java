import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS14
    Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  16/02/2023
*/
public class LT01_ETS14 
{
    public static void main (String args[])
    {
        double A1, A2, A3;
        A1=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1° ângulo: "));
        A2=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2° ângulo: "));
        A3=(180-(A1+A2));
        JOptionPane.showMessageDialog(null,"O valor do 3° ângulo é "+A3);
    }
}
