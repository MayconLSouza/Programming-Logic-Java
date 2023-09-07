/*
    Nome do programa: LT01_PROC20
    Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
    Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC20 
{
    static double a, b, c; // a = coeficiente a, b = coeficiente b, c = coeficiente c 
        public static void main (String args[]) 
        {
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficente a"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficente b"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficente c"));
            Calcular_eq2(); // chamada de procedure que calcula a equação do 2° grau
        }
        
        
        static void Calcular_eq2()
        {
            double d, x1, x2; // d = delta, x1 = raíz real 1 e x2 = raíz real 2
            d = ( ( b * b ) - ( 4 * a * c ) ); // cálculo de delta
            if ( d < 0 ) // se delta negativo
            {
                JOptionPane.showMessageDialog(null,"Equação sem raízes reais");
            }
            else if ( d == 0 ) // se delta nulo
            {
                x1 = ( ( -b + Math.sqrt(d) ) / ( 2 * a ) );
                JOptionPane.showMessageDialog(null,"A raiz real da equação é "+x1);
            }
            else if ( d > 0 ) // se delta positivo
            {
                x1 = ( ( -b + Math.sqrt(d) ) / ( 2 * a ) );
                x2 = ( ( -b - Math.sqrt(d) ) / ( 2 * a ) );
                JOptionPane.showMessageDialog(null,"As raízes reais da equação são "+x1+" e "+x2);
            }
        }
}
