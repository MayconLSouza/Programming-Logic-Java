import javax.swing.JOptionPane;
/*
   Nome do programa: LT01_ETS01
   Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
   Nome do Programador: Maycon Souza
   Data de desenvolvimento : 09/02/2023
*/

public class LT01_ETS01
{ 
    public static void main (String args [ ])
    {
    int L, A;
    L=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado"));
    A=(L*L);
    JOptionPane.showMessageDialog(null,"O valor da área é "+A);
    } 
}   
   

