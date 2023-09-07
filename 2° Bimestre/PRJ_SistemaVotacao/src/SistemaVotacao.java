/*
    Programadores: Maycon L.M. De Souza e Amós S. Souza
    Data: 07/05/2023 
    Classe: Principal
*/
import java.io.*;
import javax.swing.*;

public class SistemaVotacao {

    public static void main(String args[]) {
        Votacao[] votacao = new Votacao[200];
        Candidato[] candidato = new Candidato[301];
        int size = votacao.length;
        int opc = 0;
        ClasseMetodos Metodos = new ClasseMetodos();
        String MenuPrincipal = "Sistema de Votação\n"
                + "----------------------------------------------------------------\n"
                + "Escolha uma das opções a seguir\n"
                + "----------------------------------------------------------------\n"
                + "1 - Carregar Seção/Número de Eleitor\n"
                + "2 - Classificar por Seção\n"
                + "3 - Gravar Registros\n"
                + "4 - Mostrar Indicadores\n"
                + "9 - Finalizar\n"
                + "----------------------------------------------------------------";
        
        for(int i = 0; i < 301; i++){
            candidato[i] = new Candidato();
        }
        
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(MenuPrincipal));
            switch (opc) {
                case 1:
                    try {
                    Metodos.FCADASTRAVOTACAO(votacao,candidato);
                    JOptionPane.showMessageDialog(null, "Votação cadastrada.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
                case 2:
                    Metodos.FCLASSIFICASECAO(votacao, size);
                    JOptionPane.showMessageDialog(null, "Dados classificados.");
                    break;
                case 3:
               try {
                    JOptionPane.showMessageDialog(null,Metodos.FGRAVAVOTACAO());
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao gerar arquivo: ");
                }
                    break;
                case 4:
                    Metodos.MenuIndicadores(votacao, size, candidato);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Fim");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");

            }
        }
    }
}
