/*
    Nome do programa: LT01_PROC21
    Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
    a. Se a média for >= 6,0 exibir “APROVADO”;
    b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
    c. Se a média for < 3,0 exibir “RETIDO”.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  05/03/2023
*/
import javax.swing.JOptionPane;
public class LT01_PROC21 
{
    static double n1, n2, n3, n4; // n1 = nota do 1° bimestre, n2 = ...
        public static void main (String args[])
        {
            n1=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 1° semestre"));
            n2=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 2° semestre"));
            n3=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 3° semestre"));
            n4=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 4° semestre"));
            Calc_nf(); // procedure para calcular nota final
        }
        
        
        static void Calc_nf()
        {
            double nf; // nf = nota final
            nf = ( ( n1 + n2 + n3 + n4 ) / 4 ); // cálculo da média final de notas
            if ( nf < 3 ) // condição de reprovado
            {
                JOptionPane.showMessageDialog(null,"A nota final é "+nf+". RETIDO.");
            }
            else if ( nf < 6 ) // condição de exame
            {
                JOptionPane.showMessageDialog(null,"A nota final é "+nf+". EXAME.");
            }
            else // condição de aprovado
            {
                JOptionPane.showMessageDialog(null,"A nota final é "+nf+". APROVADO.");
            }
        }
}
