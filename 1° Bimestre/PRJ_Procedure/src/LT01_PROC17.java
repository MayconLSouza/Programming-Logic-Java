/*
    Nome do programa: LT01_PROC17
    Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC17 
{
    static double vm, t, lg; // vm = velocidade média em km/h, t = tempo de percurso em horas e lg = quantidade de litros gastos 
        public static void main (String args[])
        {
            vm=Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média do veículo em km/h: "));
            t=Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso em horas: "));
            Calcularlg(); // chamada de procedure
            JOptionPane.showMessageDialog(null,"A quantidade de litros gastos foi "+lg);
        }
        
        
        static void Calcularlg()
        {
            lg = ( ( vm * t ) / 12 ); // fórmula final da sequência abaixo em que s =  distância percorrida
            // s = ( vm * t ); lg = ( s / 12 );
        }
}
