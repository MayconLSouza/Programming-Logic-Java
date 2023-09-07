import javax.swing.*;
/*
    Nome do programa: LT01_ETD25
    Objetivo: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  19/02/2023
*/
public class LT01_ETD25 
{
    public static void main (String args[])
    {
        int HI, MI, HF, MF, HJ, MJ;
        HI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo: "));
        MI = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto incial do jogo: "));
        HF = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo: "));
        MF = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do jogo: "));
        if ( MI <= MF ) 
        {
            if  ( HI <= HF )
            {
                MJ=(MF-MI);
                HJ=(HF-HI);
            }
            else
            {
                MJ=(MF-MI);
                HJ=((HF+24)-HI);
            }
        }
        else
        {
            if ( HI < HF )
            {
                MJ=((MF+60)-MI);
                HJ=((HF-1)-HI);
            }
            else
            {
                MJ=((MF+60)-MI);
                HJ=((HF+23)-HI);
            }
        }
        JOptionPane.showMessageDialog(null,"O jogo durou "+HJ+" hora(s) e "+MJ+" minuto(s)");
    }
}
