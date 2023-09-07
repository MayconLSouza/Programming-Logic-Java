import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETR44
    Objetivo:  Receba o número da base e do expoente. Calcule e mostre o valor da potência.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  25/02/2023
*/
public class LT01_ETR44 
{
    public static void main (String args[])
    {
        double b, e, p;
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
        e = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do expoente: "));
        p = Math.pow(b, e);
        JOptionPane.showMessageDialog(null,"O valor da potência é: "+p);
    }        
}

