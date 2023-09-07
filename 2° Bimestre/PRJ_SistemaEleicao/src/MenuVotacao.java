/*
    Programadores: Maycon L.M. De Souza e Amós S. Souza
    Data: 27/04/2023 
    Classe: Principal
 */
import java.io.*;
import javax.swing.JOptionPane;

public class MenuVotacao {

    public static void main(String args[]) {
        Eleitor[] eleitor = new Eleitor[10];
        Votacao[] votacao = new Votacao[10];
        ClasseCadastro ModulosCadastro = new ClasseCadastro();
        ClasseApuracaoEstatistica ModulosApuracaoEstatistica = new ClasseApuracaoEstatistica();
        int size = votacao.length;

        // inicialização dos objetos
        for (int i = 0; i < size; i++){
            eleitor[i] = new Eleitor(0, 0, "");
            votacao[i] = new Votacao(0, 0, 0, "");        
        }
// looping infinito verdadeiro         
        while (true) {
            int MenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n Escolha uma das opções a seguir\n----------------------------------------------------------------\n1 - Cadastro de Eleitor\n2 - Cadastro de Votação 1 e 2 \n3 - Agrupa Apuração \n4 - Menu de Estatistica\n9 - Finaliza\n----------------------------------------------------------------"));
            switch (MenuPrincipal) {
                case 1:
                    try {
                        ModulosCadastro.CADASTRAELEITOR(eleitor, size);
                    } 
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    ModulosCadastro.CADASTRAVOTACAO(eleitor, votacao, size);
                    break;
                case 3:
                    ModulosApuracaoEstatistica.AGRUPAAPURACAO(votacao, size);
                    JOptionPane.showMessageDialog(null, "A votação  foi apurada ");
                    break;
                case 4:
                    ModulosApuracaoEstatistica.MENUESTATISTICA(votacao);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Fim");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Código Inválido");

            }
        }

    }
}
