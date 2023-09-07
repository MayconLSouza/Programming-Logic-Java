/*
    Programadores: Maycon L.M. De Souza e Amós S. Souza
    Data: 11/05/2023 
    Classe: Métodos
*/
import java.io.*;
import javax.swing.*;
import java.util.*;



public class ClasseMetodos {
    String TextoMenuIndicadores = "Mostar Indicadores\n"
            + "----------------------------------------------------\n"
            + "Estatísticas da Votação 2023\n"
            + "1 - Quantidade de eleitores por seção\n"
            + "2 - Seção com Maior e Menor número de Eleitores\n"
            + "3 – Quantidade de votos por candidato\n"
            + "4 – 10 primeiros colocadas (número de candidato e quantidade de votos)\n"
            + "9 – Finaliza consulta\n"
            + "----------------------------------------------------";
    int Secao[] = new int [10];
    int ContagemVotos[] = new int [301];
    
 public Votacao[] FCADASTRAVOTACAO(Votacao[] votacao, Candidato[] candidato) throws IOException {
    int i;
    String fileName = "Votacao2021.txt";
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    Random random = new Random();
    for (i = 0; i < 200; i++) {
        votacao[i] = new Votacao();
        votacao[i].Secao = random.nextInt(10) + 1;
        Secao[votacao[i].Secao-1]++;
        writer.write("Seção: " + Integer.toString(votacao[i].Secao) + ", ");
        votacao[i].Candidato = random.nextInt(300) + 1;
        candidato[(votacao[i].Candidato)].NumeroCandidato = votacao[i].Candidato;
        candidato[votacao[i].Candidato].Votos++;
        ContagemVotos[votacao[i].Candidato]++;
        writer.write("Candidato: " + Integer.toString(votacao[i].Candidato));
        writer.newLine();
    }
    System.out.println("GRAVAÇÃO FEITA COM SUCESSO");
    writer.close();
    return votacao;
}


public void FCLASSIFICASECAO( Votacao[] Votacao, int size ) {   
    
    for (int i = 0; i < size - 1; i++) {
        int trocas = 0;
        for (int j = 0; j < size - 1 - i; j++) {
            if (Votacao[j].Secao > Votacao[j + 1].Secao) {
                // troca os elementos
                Votacao temp = Votacao[j];
                Votacao[j] = Votacao[j + 1];
                Votacao[j + 1] = temp;
                trocas++;
            }
        }
        if (trocas == 0) {
            // nenhum elemento foi trocado nesta passagem, o array já está ordenado
            break;
        }
    }
}


public String FGRAVAVOTACAO() throws IOException {
        return "Os votos foram gravados arquivo Votacao2021.txt " ;
    }

    //Menu de indicadores
    public void MenuIndicadores(Votacao[] votacao, int size, Candidato[] candidato) {
        int Menu = 0;
        while (Menu != 9) {
            Menu = Integer.parseInt(JOptionPane.showInputDialog(TextoMenuIndicadores));
            switch (Menu) {
                case 1:
                    QtdEleitores(votacao);
                    break;
                case 2:
                    MaiorMenorSecao(votacao);
                    break;
                case 3:
                    QtdVotos(votacao);
                    break;
                case 4:
                    PrimeirosColocados(votacao, candidato);
                case 9:
                    JOptionPane.showMessageDialog(null, "Fim do menu indicadores. Retornando ao menu principal.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
            }
        }
    }

    // Módulo de Quantidade de eleitores por seção, opção 1 do menu indicadores
    public void QtdEleitores(Votacao[] votacao) {
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null,"Seção "+(i+1)+" = "+Secao[i]);
            System.out.println("Secao "+(i+1)+" = "+Secao[i]);
        }
    }
    
    // Módulo de Número da Seção com maior e menor números de eleitores 
    public void MaiorMenorSecao(Votacao[] votacao){
        int MaisEleitores = Secao[0], MenosEleitores = Secao[0], MaiorSecao = 0, MenorSecao = 0;
        for(int i = 1; i < Secao.length; i++){
            if(Secao[i] > MaisEleitores){
                MaisEleitores = Secao[i];
                MaiorSecao = i;
            }
            if(Secao[i] < MenosEleitores){
                MenosEleitores = Secao[i];
                MenorSecao = i;
            }
        }
        JOptionPane.showMessageDialog(null,"A Seção com o menor número de eleitores é "+(MenorSecao+1)+" com "+MenosEleitores+" eleitores.");
        JOptionPane.showMessageDialog(null,"A Seção com o maior número de eleitores é "+(MaiorSecao+1)+" com "+MaisEleitores+" eleitores.");
    }
    
    // Módulo com Quantidade de Votos por Candidato
    public void QtdVotos(Votacao[]votacao){
        for(int i = 0; i < 301; i++)
            System.out.println("Candidato "+(i+1)+" = "+ContagemVotos[i]+" votos"); 
    }
    
    //Módulo de exibição dos 10 candidatos mais votados e suas quantidades
    public void PrimeirosColocados(Votacao[] votacao, Candidato[] candidato){
        boolean swp;
        int size = 300;
        do{
            swp = false;
            for(int i = 0; i < (size - 1); i++){
                if (candidato[i].Votos < candidato[i+1].Votos){
                    swp = true;
                    Candidato aux = candidato[i];
                    candidato[i] = candidato[i+1];
                    candidato[i+1] = aux;
                }
            }
            size -= 1;}
        while(swp!= false);
        for(int i = 0; i < 10; i++){
            System.out.println((i+1)+" lugar = Candidato "+candidato[i].NumeroCandidato+" com "+candidato[i].Votos+" votos");
        }
    }
    
}
