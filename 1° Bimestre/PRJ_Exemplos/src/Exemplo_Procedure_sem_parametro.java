import javax.swing.JOptionPane;
/*
    Nome do programa: Exemplo_Procedure_sem_parametro
    Objetivo: Calcula o Salário a Receber a partir do Salário Bruto e Desconto.
    Programador : Maycon Souza
    Data de desenvolvimento: 02/03/2023
*/
public class Exemplo_Procedure_sem_parametro 
{
   static Double SalarioBruto , SalarioLiquido;
      public static void main ( String args[ ] ) 
      {
        SalarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALÁRIO BRUTO"));
        ProcedureSalario();
        JOptionPane.showMessageDialog(null, "Salario Liquido = " + SalarioLiquido);
      } 
	  

      static void ProcedureSalario ( )
      {
        Double Desconto; 
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
      } 
} 

