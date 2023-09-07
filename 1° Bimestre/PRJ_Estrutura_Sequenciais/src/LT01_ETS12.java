import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS12
    Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  16/02/2023
*/
public class LT01_ETS12 
{
    public static void main (String args[])
    {
    int An, Aa, I, I17;
    An=Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento: "));
    Aa=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
    I=(Aa-An);
    I17=(I+17);
    JOptionPane.showMessageDialog(null,"A sua idade é "+I+" e a você terá daqui 17 anos "+I17);
    }
}
