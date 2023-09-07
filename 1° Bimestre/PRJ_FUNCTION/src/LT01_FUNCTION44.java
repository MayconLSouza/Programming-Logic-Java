/*
    Nome do programa: LT01_FUNCTION44
    Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/03/2023
*/
import javax.swing.*;
public class LT01_FUNCTION44 
{
    public static void main (String args[])
    {
        double b, e;
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        e = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente: "));
        JOptionPane.showMessageDialog(null,"O valor da potência é: "+Fp(b,e));
    }
    
    static double Fp(double x, double y)
    {
        double p;
        p = Math.pow(x,y);
        return p;
    }
}
