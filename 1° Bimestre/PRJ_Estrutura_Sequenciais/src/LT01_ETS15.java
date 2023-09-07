import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS15
    Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  16/02/2023
*/
public class LT01_ETS15 
{
    public static void main (String args[])
    {
        double CA, CO, H;
        CA=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto adjacente: "));
        CO=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto oposto: "));
        H=(Math.sqrt((CA*CA)+(CO*CO)));
        JOptionPane.showMessageDialog(null,"O valor da hipotenusa é "+H);
    }
}
