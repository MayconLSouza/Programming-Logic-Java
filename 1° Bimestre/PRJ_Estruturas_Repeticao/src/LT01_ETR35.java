import javax.swing.JOptionPane;
/*
    Nome do programa: LT01_ETR35
    Objetivo:  Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e 
    mostre o resultado da somatória dos números ímpares entre esses valores.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  23/02/2023
*/
public class LT01_ETR35 
{
    public static void main (String args[])
    {
        int n1, n2, s = 0, i, maior, menor;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1° número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2° número: "));
        while ( n1 == n2 )
        {  
        JOptionPane.showMessageDialog(null,"Erro: valores iguais.");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1° número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2° número: "));
        }
        if ( n1 > n2 )
        {
            maior = n1;
            menor = n2;
        }
        else
        {
            maior = n2;
            menor = n1;
        }
        for ( i = ( menor + 1 ); i < maior; i++)
        {
            if ( ( i % 2 ) != 0)
            {
                s = ( s + i );
            }
        }
        JOptionPane.showMessageDialog(null, "O valor da somatória é: "+s);
    } 
}
