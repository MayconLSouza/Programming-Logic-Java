import javax.swing.*;
/*
    Nome do programa: LT01_ETD20
    Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
    Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD20 
{
    public static void main (String args[])
    {
        double A, B, C, D, R1, R2;
        A=Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        B=Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        C=Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C: "));
        D=((B*B)-(4*A*C));
        if (D > 0)
        {
            R1=((-B+Math.sqrt(D))/(2*A));
            R2=((-B-Math.sqrt(D))/(2*A));
            JOptionPane.showMessageDialog(null,"As raízes da equação são "+R1+" e "+R2);
        }
        else
        {
            if (D == 0)
            {
                R1=((-B+Math.sqrt(D))/(2*A));
                JOptionPane.showMessageDialog(null,"As raízes da equação são "+R1);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Não existe raiz real");
            }
        }
    }
}
