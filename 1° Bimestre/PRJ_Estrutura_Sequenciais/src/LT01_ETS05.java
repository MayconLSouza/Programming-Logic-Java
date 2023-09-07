import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS05
    Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais
    (considerar que a equação possuei raízes).
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  16/02/2023
*/
public class LT01_ETS05 
{
    public static void main (String args[])
    {
    int A, B, C; 
    double D, x1, x2;
    A=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente A: "));
    B=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente B: "));
    C=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente C: "));
    D=((B*B)-(4*A*C));
    x1=((-B+Math.sqrt(D))/(2*A));
    x2=((-B-Math.sqrt(D))/(2*A));
    JOptionPane.showMessageDialog(null,"O valor da 1° raiz é: "+x1);
    JOptionPane.showMessageDialog(null,"O valor da 2° raiz é: "+x2);
    }
}
