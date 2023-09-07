import javax.swing.JOptionPane;
/*
    Nome do programa: Exemplo_Procedure_com_parametro
    Objetivo: Calcula o Salário a Receber a partir do Salário Bruto e Desconto.
    Programador : Maycon Souza
    Data de desenvolvimento: 02/03/2023
*/
public class Exemplo_Procedure_com_parametro 
{
   static Double SalarioBruto ;
      public static void main ( String args[ ] ) 
      { 
        SalarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALÁRIO BRUTO"));  
        ProcedureSalario(SalarioBruto);
      } 
	  

      static void ProcedureSalario ( double SalarioBruto )
      {
        Double SalarioLiquido, Desconto; 
        if (SalarioBruto < 500)  
        {
           Desconto = 0.0 ;  
        }
        else if (SalarioBruto >= 500 && SalarioBruto < 800) 
        {
           Desconto = 0.05;  
        }
        else if (SalarioBruto >= 800 && SalarioBruto < 1200)  
        {
           Desconto = 0.10;  
        }
	else   
        {
	   Desconto = 0.15;  
        }
        SalarioLiquido = (SalarioBruto - (SalarioBruto * Desconto));
        JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + SalarioLiquido);
      } 
}
