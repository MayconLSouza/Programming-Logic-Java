import javax.swing.JOptionPane;
/*
Programa: coleta valores  e calcula o resultado em C
Programador: Maycon Souza
Data de criação: 09/02/2023
Versão 01

 */
public class Pgm_exemplo01 {
    public static void main(String arqs[]){
        int A,B,C;
        A=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        B=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        C = (A + B);
        JOptionPane.showMessageDialog(null,"Valor de C é "+C);
    } 
            
    
}
