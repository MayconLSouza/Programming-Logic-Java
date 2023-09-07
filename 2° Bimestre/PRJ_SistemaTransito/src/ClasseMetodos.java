/*
    Programadores: Maycon L.M. De Souza e Peterson H.C. Dos Santos
    Data: 20/04/2023
    Classe: Métodos
*/
import javax.swing.JOptionPane;
import java.io.*;

public class ClasseMetodos {

    int contador;//contador para todas/os Funções/Procedimentos
    String FileName = "ArquivoEstatistica.txt"; //Nome de arquivo para gravação e leitura de estatísticas

    //caso 1
    public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] estatistica) throws IOException {        
        BufferedWriter writer = new BufferedWriter (new FileWriter(FileName));
        for (int contador = 0; contador < 10; contador++) {
            estatistica[contador].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da Cidade!"));
            estatistica[contador].NomeCidade = JOptionPane.showInputDialog("Insira o nome da Cidade!");
            estatistica[contador].QuantidadeAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a Quantidade de Acidentes!"));
            writer.write(Integer.toString(estatistica[contador].CodigoCidade));
            writer.newLine();
            writer.write(estatistica[contador].NomeCidade);
            writer.newLine();
            writer.write(Integer.toString(estatistica[contador].QuantidadeAcidentes));
            writer.newLine();
        }
        JOptionPane.showMessageDialog(null,"Estatísticas cadastradas.");
        writer.close();
        return estatistica;
    }

    //caso 2
    public void PQTACIDENTES(Estatistica[] estatistica)throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FileName));
        for (contador = 0; contador < 10; contador++) {
            estatistica[contador].CodigoCidade = Integer.parseInt(reader.readLine());
            estatistica[contador].NomeCidade = reader.readLine();
            estatistica[contador].QuantidadeAcidentes = Integer.parseInt(reader.readLine());
            if ((estatistica[contador].QuantidadeAcidentes > 100) && (estatistica[contador].QuantidadeAcidentes < 500)) {
                JOptionPane.showMessageDialog(null, "A cidade " + estatistica[contador].NomeCidade + " [" + estatistica[contador].CodigoCidade + "] teve " + estatistica[contador].QuantidadeAcidentes + " acidentes em 2022.", "Cidades com número de acidentes > 100 e < 500.", JOptionPane.WARNING_MESSAGE);
            } // fim if
        } // fim for
        reader.close();
    } // fim procedure case 2

    //caso 3
    public void PMAIORMENOR(Estatistica[] estatistica)throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FileName));
        for(contador = 0; contador < 10; contador++){
            estatistica[contador].CodigoCidade = Integer.parseInt(reader.readLine());
            estatistica[contador].NomeCidade = reader.readLine();
            estatistica[contador].QuantidadeAcidentes = Integer.parseInt(reader.readLine());
        }
        String cidadeMax = estatistica[0].NomeCidade;
        String cidadeMin = estatistica[0].NomeCidade;
        int max = estatistica[0].QuantidadeAcidentes;
        int min = estatistica[0].QuantidadeAcidentes;

        for (contador = 1; contador < 10; contador++) {
            if (estatistica[contador].QuantidadeAcidentes > max) {
                cidadeMax = estatistica[contador].NomeCidade;
                max = estatistica[contador].QuantidadeAcidentes;
            }
            if (estatistica[contador].QuantidadeAcidentes < min) {
                cidadeMin = estatistica[contador].NomeCidade;
                min = estatistica[contador].QuantidadeAcidentes;
            }
        }
        reader.close();
        JOptionPane.showMessageDialog(null, cidadeMax + " com " + max + " Acidentes", "Cidade com Maior Taxa de Acidentes", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, cidadeMin + " com " + min + " Acidentes", "Cidade com Menor Taxa de Acidentes", JOptionPane.WARNING_MESSAGE);
    }

    //caso 4
    public void PACIMA(Estatistica[] estatistica)throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FileName));
        double media = 0; // media de núemro de acidentes
        for(contador = 0; contador < 10; contador++){
            estatistica[contador].CodigoCidade = Integer.parseInt(reader.readLine());
            estatistica[contador].NomeCidade = reader.readLine();
            estatistica[contador].QuantidadeAcidentes = Integer.parseInt(reader.readLine());
        }
        for(contador = 0; contador < 10; contador++){
            media += estatistica[contador].QuantidadeAcidentes;
        }
        media /= 10;
        for (contador = 0; contador < 10; contador++) {
            if (estatistica[contador].QuantidadeAcidentes > media) {
                JOptionPane.showMessageDialog(null, "A cidade " + estatistica[contador].NomeCidade + " [" + estatistica[contador].CodigoCidade + "] está com número de acidentes acima da média.", "A media de acidentes entre as 10 cidades é " + media, JOptionPane.WARNING_MESSAGE);
            } // fim if
        } // fim for
        reader.close();
    } // fim procedure case 4
}
