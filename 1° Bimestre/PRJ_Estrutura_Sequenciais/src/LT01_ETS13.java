import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS13
    Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  16/02/2023
*/
public class LT01_ETS13 
{
    public static void main (String args[])
    {
    double KG, D;
    KG=Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do alimento em kg: "));
    D=((KG*1000)/50);
    JOptionPane.showMessageDialog(null,"O alimento durará "+D+" dias se consumido 50 ao dia.");
    }
}
