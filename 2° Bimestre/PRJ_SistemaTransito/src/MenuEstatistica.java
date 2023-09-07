/*
    Programadores: Maycon L.M. De Souza e Peterson H.C. Dos Santos
    Data: 20/04/2023 
    Classe: Principal
*/

import javax.swing.JOptionPane;
import java.io.*;

public class MenuEstatistica {

    public static void main(String[] args) throws IOException{
        Estatistica[] estatistica = new Estatistica[10];
        ClasseMetodos metodos = new ClasseMetodos();
        int ctd;
        //execução do Construtor
        for (ctd = 0; ctd < 10; ctd++) {
            estatistica[ctd] = new Estatistica();
        }
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATÍSTICA\nEstatísticas de acidentes em 2022\n----------------------------------------------------------------\n1 - Cadastro Estatística\n2 - Consulta por quantidade de acidentes\n3 - Consulta por estatísticas de acidentes\n4 - Acidentes acima da média das 10 cidades\n9 - Finaliza\n----------------------------------------------------------------"));
            switch (menu) {
                case 1:
                    metodos.FCADRASTRAESTATISTICA(estatistica);
                    break;

                case 2:
                    metodos.PQTACIDENTES(estatistica);
                    break;

                case 3:
                    metodos.PMAIORMENOR(estatistica);
                    break;

                case 4:
                    metodos.PACIMA(estatistica);
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
