/*
    Nome do programa: LT01_PROC27
    Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC27 
{
    static double nv, s, t;
        public static void main (String args[])
        {
            nv = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas: "));
            s = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros): "));
            t = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração (minutos): "));
            Calc_Vm();
        }
        
        
        static void Calc_Vm()
        {
            double vm;
            vm = ( ( 3 * s * nv ) / ( 50 * t ) );
            JOptionPane.showMessageDialog(null,"A velocidade média foi "+vm+" km/h");
        }
}
