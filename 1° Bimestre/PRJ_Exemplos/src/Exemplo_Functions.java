/*
    Nome do programa: Exemplo_Functions
    Objetivo: Calcular a área de um triângulo.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  09/03/2023
*/
import javax.swing.JOptionPane;
public class Exemplo_Functions 
{
    public static void main(String args [ ] )  
    {
        int Base , Altura;
        Base = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DA BASE DO TRINGULO"));
        Altura = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DA ALTURA DO TRINGULO"));
        JOptionPane.showMessageDialog(null,"A AREA É " + FunçãoArea(Base,Altura));
    }

    static int FunçãoArea (int B , int H) 
    {
        int AR = 0;
        AR = (B * H) / 2;
        return AR;
    }    
}
