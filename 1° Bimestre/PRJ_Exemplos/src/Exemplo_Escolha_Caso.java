import javax.swing.JOptionPane;
/*
    Nome do programa: Exemplo_Escolha_Caso
    Objetivo: Receba o código correspondente ao cargo de um funcionário e seu salário atual e mostre o cargo, 
    o valor do aumento e seu salário. Os cargos estão na tabela. 
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  23/02/2023
*/
public class Exemplo_Escolha_Caso 
{
   public static void main(String[] args) 
   {
    int codigo; 
    double salario, aumento = 0;
    String cargo;
    codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cago: "));
    salario = Double.parseDouble(JOptionPane.showInputDialog ("Informe o salário atual: "));
    switch(codigo) 
        {
        case 1: cargo = "Escriturário";
                aumento = (salario * 0.50); 
                salario = salario + aumento; 
                System.out.println("O cargo " +cargo+ " terá um aumento de " +aumento+ " reais e seu novo salário será: " +salario+ " reais");
        break;
        case 2: cargo = "Secretário"; 
                aumento = (salario * 0.35); 
                salario = salario + aumento; 
                System.out.println("O cargo " +cargo+ " terá um aumento de " +aumento+ " reais e seu novo salário será: " +salario+ " reais");
        break;
        case 3: cargo = "Caixa";
                aumento = (salario * 0.20); 
                salario = salario + aumento; 
                System.out.println("O cargo " +cargo+ " terá um aumento de " +aumento+ " reais e seu novo salário será: " +salario+ " reais"); 
        break;
        case 4: cargo = "Gerente";
                aumento = (salario * 0.10); 
                salario = salario + aumento; 
                System.out.println("O cargo " +cargo+ " terá um aumento de " +aumento+ " reais e seu novo salário será: " +salario+ " reais"); 
        break;
        default: cargo = "Não há cargo";System.out.println(cargo); 
        break;
        }
    }
}
