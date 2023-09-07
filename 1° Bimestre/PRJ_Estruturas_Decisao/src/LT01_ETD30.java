/*
    Nome do programa: LT01_ETD30
    Objetivo: Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
    Nome do Programador: Maycon Souza
    Data de desenvolvimento :  11/06/2023
*/
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;

public class LT01_ETD30 {

    public static void main(String[] args) {
        // Receber a data de nascimento
        String DataNascimentoStr = JOptionPane.showInputDialog("Digite a data de nascimento (no formato DD/MM/AAAA):");

        // Converter a data de nascimento para LocalDate
        LocalDate DataNascimento = LocalDate.parse(DataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Receber a data atual
        String DataAtualStr = JOptionPane.showInputDialog("Digite a data atual (no formato DD/MM/AAAA):");

        // Converter a data atual para LocalDate
        LocalDate DataAtual = LocalDate.parse(DataAtualStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Calcular a diferença entre as datas
        Period Periodo = Period.between(DataNascimento, DataAtual);

        // Obter os componentes da diferença
        int anos = Periodo.getYears();
        int meses = Periodo.getMonths();
        int dias = Periodo.getDays();

        // Exibir a idade em anos, meses e dias
        JOptionPane.showMessageDialog(null, "Idade: " + anos + " anos, " + meses + " meses e " + dias + " dias");
    }
}


