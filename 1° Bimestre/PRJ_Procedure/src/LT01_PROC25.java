/*
    Nome do programa: LT01_PROC25
    Objetivo: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC25 
{
    static int HI, MI, HF, MF, HJ, MJ; // HI = hora de início, MI = minuto de início, HF = hora final, MF = minuto final, HJ = hora de jogo, MJ = minuto de jogo
        public static void main (String args[])
        {
            HI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo: "));
            MI = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto incial do jogo: "));
            HF = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo: "));
            MF = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do jogo: "));
            Calc_Jogo();
        }
        
        
        static void Calc_Jogo()
        {
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
