import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETS17
    Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
    Receber o tempo de percurso e a velocidade média.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  17/02/2023
*/
public class LT01_ETS17
{
 public static void main (String args[])
    {
        double Vm, T, Lg;   
        Vm=Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média do veículo em km/h: "));
        T=Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso em horas: "));
        Lg=((Vm*T)/12);
        JOptionPane.showMessageDialog(null,"A quantidade de litros gastos foi "+Lg);
    }
}
