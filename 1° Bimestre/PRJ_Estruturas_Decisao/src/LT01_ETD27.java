import javax.swing.*;
/*
    Nome do programa: LT01_ETD27
    Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD27 
{
    public static void main (String args[])
    {
        double Nv, S, T, V;
        Nv = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas: "));
        S = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros): "));
        T = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração (minutos): "));
        V=( ( 3 * Nv * S ) / ( 50 * T ) );
        JOptionPane.showMessageDialog(null,"A velocidade média foi "+V+" km/h");
    }
}
