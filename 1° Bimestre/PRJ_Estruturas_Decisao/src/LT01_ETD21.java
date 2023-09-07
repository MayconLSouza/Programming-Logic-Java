import javax.swing.*;
/*
    Nome do programa: LT01_ETD21
    Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
    a. Se a média for >= 6,0 exibir “APROVADO”;
    b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
    c. Se a média for < 3,0 exibir “RETIDO”.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD21 
{
    public static void main (String args[])
    {
        double n1, n2, n3, n4, m;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota bimestral: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota bimestral: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota bimestral: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4° nota bimestral: "));
        m =((n1 + n2 + n3 + n4)/4); 
        JOptionPane.showMessageDialog(null,"A média aritmética é "+m);
        if (m >= 6)
        {
            JOptionPane.showMessageDialog(null,"APROVADO");
        }
        else
        {
            if(m < 3)
            {
                JOptionPane.showMessageDialog(null,"RETIDO"); 
            }
            else
                JOptionPane.showMessageDialog(null,"EXAME");
        }
    }
}
