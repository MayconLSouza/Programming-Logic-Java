import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS06
    Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  12/02/2023
*/
public class LT01_ETS06
{
    public static void main (String args[])
    {
    int X, Y, Aux;
    X=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
    Y=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
    Aux=X;
    X=Y;
    Y=Aux;
    JOptionPane.showMessageDialog(null,"O valor de X é "+X);
    JOptionPane.showMessageDialog(null,"O valor de Y é "+Y);
    }
}