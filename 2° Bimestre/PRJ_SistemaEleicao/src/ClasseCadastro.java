/*
    Programadores: Maycon L.M. De Souza e Amós S. Souza
    Data: 27/04/2023 
    Classe: Módulos de Cadastro(Eleitores e Votação
*/
import javax.swing.JOptionPane;
import java.io.*;
 
public class ClasseCadastro { 
    
    //declaração de variáveis
    String TextoCadastro = "MENU CADASTRO DE VOTAÇÃO\n"
            + "----------------------------------------------------------------\n"
            + "Escolha uma das opções a seguir\n"
            + "----------------------------------------------------------------\n"
            + "1 - Cadastro de Votação 1\n"
            + "2 - Cadastro de Votação 2\n"
            + "9 - Finaliza\n"
            + "----------------------------------------------------------------";
    String TextoVotacao = "Menu Votação\n"
            + "----------------------------------------------------------------\n"
            + "Escolha uma das opções a seguir\n" 
            + "----------------------------------------------------------------\n"
            + "1 - José\n"
            + "2 - Maria\n"
            + "3 - Branco\n"
            + "4 - Nulo\n";
    // vetor de seções de votação
   int[] Secao = {1, 3, 4, 5, 9, 10};
   // vetor do tamanho de grupos de votação
   int[] GruposVotacao = new int[2];
   
    //***********************************************************************************************
    // cadastro dos eleitores que irão votar, com seu nome, número de eleitor e secção. Opção 1 do menu principal.
   //***********************************************************************************************
    void CADASTRAELEITOR(Eleitor[] eleitor, int size) throws IOException {
        String fileName = "Eleitores.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < size; i++) {
            eleitor[i].NumEleitor = i + 1;
            eleitor[i].NomeEleitor = JOptionPane.showInputDialog("Digite o nome do eleitor: ");
            eleitor[i].Secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção de votação do eleitor:"));
            ValidacaoSecao(eleitor, i);
            writer.write("NOME ELEITOR: "+eleitor[i].NomeEleitor); // escrevendo o nome do eleitor
            writer.newLine(); // nova linha
            writer.write("NÚMERO DE ELEITOR: "+Integer.toString(eleitor[i].NumEleitor)); // convertendo o número do eleitor para string
            writer.newLine(); // nova linha
            writer.write("SEÇÃO DE VOTAÇÃO: "+Integer.toString(eleitor[i].Secao)); // convertendo o número da seção para string
            writer.newLine(); // nova linha
            writer.write("");
            writer.newLine(); // nova linha
            JOptionPane.showMessageDialog(null, "Nome eleitor: " + eleitor[i].NomeEleitor + "\nNúmero de eleitor: " + eleitor[i].NumEleitor + "\nSeção de votação: " + eleitor[i].Secao);
            ConfiguracaoSecao(eleitor, i, GruposVotacao);
        }
        writer.close();
        JOptionPane.showMessageDialog(null, "Todos os eleitores foram cadastrados.");
    }
        
    //***********************************************************************************************
    // validação de seção de votação, usuário deve entrar com um número de seção existente(1,3,4,5,9,10)
    //***********************************************************************************************
    void ValidacaoSecao(Eleitor[] eleitor, int i){
        boolean a = false;
        while(a == false){            
            for (int j = 0; j < 6; j++){
                if(eleitor[i].Secao == Secao[j]){
                    a = true;
                    break;
                }
            }
            if (a == false){
                JOptionPane.showMessageDialog(null, "Seção Inválida.");
                eleitor[i].Secao = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de secção existente[1, 3, 4, 5, 9, 10]:"));
            }
        }
    }
    
    //***********************************************************************************************
    // Definição da quantidade de eleitores que irão votar em cada grupo de acordo com sua seção, Grupo de Votação 1 = (1,3,4) e Grupo de Votação 2 = (5,9,10)
    //***********************************************************************************************
    void ConfiguracaoSecao(Eleitor[] eleitor, int i, int GruposVotacao[]){
        for (int j = 0; j < 3; j++){
            if (eleitor[i].Secao == Secao[j]){
                GruposVotacao[0]++;
                break;
            }
            if (eleitor[i].Secao == Secao[j+3]){
                GruposVotacao[1]++;
                break;
            }
        }
    }
    
    //***********************************************************************************************
    // menu de cadastro de votação, selecionado através da opção 2 do menu principal
    //***********************************************************************************************
    void CADASTRAVOTACAO(Eleitor[] eleitor, Votacao[] votacao, int size) {
        while (true) {
            int MenuCadastro = Integer.parseInt(JOptionPane.showInputDialog(TextoCadastro));
            switch (MenuCadastro) {
                case 1:
                    CadastraVotacao1(eleitor, votacao, size, Secao, GruposVotacao);
                    break;
                case 2:
                    CadastraVotacao2(eleitor, votacao, size, Secao, GruposVotacao);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Fim do cadastro de votações. Retornando ao menu principal.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção de cadastro inválida.");
            }
        }
    }
    
    //***********************************************************************************************
    // cadastro de votação do grupo 1, opção 1 do menu de cadastro da votação
    // Math.random() 
    //***********************************************************************************************
    void CadastraVotacao1(Eleitor[] eleitor, Votacao[] votacao, int size, int secao[], int GruposVotacao []) {
        for (int i = 0; i < GruposVotacao[0]; i++){
            boolean a = false;
            while (a == false) {
                votacao[i].Secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção:"));
                VerificacaoSecao(eleitor, votacao, size, i, a);
                VerificacaoSecao1(votacao, i, secao, a);
                votacao[i].NomeEleitor = JOptionPane.showInputDialog("Digite o nome do eleitor:");
                VerificacaoNome(eleitor, votacao, size, i, a);
                votacao[i].NumEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitor:"));
                VerificacaoNumero(eleitor, votacao, size, i, a);               
                a = VerificacaoVoto(votacao, i);
                if (a == false){
                    continue;
                } 
                votacao[i].CodCandidato = Integer.parseInt(JOptionPane.showInputDialog(TextoVotacao));
                JOptionPane.showMessageDialog(null, "Voto Registrado.");
            }
        }
        JOptionPane.showMessageDialog(null, "Cadastro de votação do grupo 1 finalizado.");
    }
    
    //***********************************************************************************************
    // cadastro de votação do grupo 2, opção 2 do menu de cadastro da votação
    //***********************************************************************************************
    void CadastraVotacao2(Eleitor[] eleitor, Votacao[] votacao, int size, int secao[], int GruposVotacao []) {
        for (int i = GruposVotacao[0]; i < size; i++){
            boolean a = false;
            while (a == false) {
                votacao[i].Secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção:"));
                VerificacaoSecao(eleitor, votacao, size, i, a);
                VerificacaoSecao2(votacao, i, secao, a);
                votacao[i].NomeEleitor = JOptionPane.showInputDialog("Digite o nome do eleitor:");
                VerificacaoNome(eleitor, votacao, size, i, a);
                votacao[i].NumEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitor:"));
                VerificacaoNumero(eleitor, votacao, size, i, a);
                a = VerificacaoVoto(votacao, i);
                if (a == false){
                    continue;
                }
                votacao[i].CodCandidato = Integer.parseInt(JOptionPane.showInputDialog(TextoVotacao));
                JOptionPane.showMessageDialog(null, "Voto Registrado.");
            }
        }
        JOptionPane.showMessageDialog(null, "Cadastro de votação do grupo 2 finalizado.");
    }
    
    //***********************************************************************************************
    // verificação se a seção inserida é existente, Seção(1,3,4,5,9,10)
    //***********************************************************************************************
    void VerificacaoSecao(Eleitor[] eleitor, Votacao[] votacao, int size, int i, boolean a) {
        while (a == false) {
            for (int j = 0; j < size; j++) {
                // casos seção seja encontrada nas seções cadastrados
                if (votacao[i].Secao == eleitor[j].Secao) {
                    a = true;
                    break;
                }
            }
            // caso seção não seja encontrada nas seções cadastardas
            if (a == false) {
                JOptionPane.showMessageDialog(null, "Seção Inválida.");
                votacao[i].Secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de uma seção válida:"));
            }
        }
    }
    
    //***********************************************************************************************
    //verificação se a seção inserida para votação é do grupo 1(1,3,4)
    //***********************************************************************************************
    void VerificacaoSecao1(Votacao[] votacao, int i, int secao[], boolean a){
        while (a == false){
            for(int j = 0; j < 3; j++){
                if (votacao[i].Secao == secao[j]){
                    a = true;
                    break;
                }
            }
            if (a == false){
                JOptionPane.showMessageDialog(null,"Seção Inválida.");
                votacao[i].Secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de uma seção de votação deste grupo 1[1,3,4]:"));
            }
        }
    }
    
    //***********************************************************************************************
    // verificação se a seção inserida para votação é do grupo 2(5,9,10)
    //***********************************************************************************************
    void VerificacaoSecao2(Votacao[] votacao, int i, int secao[], boolean a){
        while (a == false){
            for(int j = 3; j < 6; j++){
                if (votacao[i].Secao == secao[j]){
                    a = true;
                    break;
                }
            }
            if (a == false){
                JOptionPane.showMessageDialog(null,"Seção Inválida.");
                votacao[i].Secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de uma seção de votação deste grupo 2[5,9,10]:"));
            }
        }
    }
    
    //***********************************************************************************************
    // verificação se o nome de eleitor inserido para votação é válido 
    //***********************************************************************************************
    void VerificacaoNome(Eleitor[] eleitor, Votacao[] votacao, int size, int i, boolean a) {
        while (a == false) {
            for (int j = 0; j < size; j++) {
                // caso nome seja encontrado nos eleitores cadastrados
                if (votacao[i].NomeEleitor.equals(eleitor[j].NomeEleitor)) {
                    // verificação se a seção inserida anteriormente é compatível com o nome
                    if (votacao[i].Secao != eleitor[j].Secao) {
                        JOptionPane.showMessageDialog(null, "Nome de eleitor não correspondente a esta seção.");
                        votacao[i].NomeEleitor = JOptionPane.showInputDialog("Digite o nome de um eleitor da seção inserida["+votacao[i].Secao+"]:");
                        VerificacaoNome(eleitor, votacao, size, i, a);
                    }
                    a = true;
                    break;
                }
            }
            // caso nome não seja encontrado nos eleitores cadastrados
            if (a == false) {
                JOptionPane.showMessageDialog(null, "Nome de eleitor Inválido");
                votacao[i].NomeEleitor = JOptionPane.showInputDialog("Digite o nome de um eleitor válido:");
            }
        }
    }
    
    //***********************************************************************************************
    // verificação se é a primeira vez que o eleitor vota, não permitir mais de um voto por eleitor
    //***********************************************************************************************
    boolean VerificacaoVoto(Votacao[] votacao, int i) {
    for (int j = 0; j < i; j++) {
        if (votacao[i].NumEleitor == votacao[j].NumEleitor) {
            JOptionPane.showMessageDialog(null, "Eleitor(a) " + votacao[i].NomeEleitor + " já registrou seu voto!");
            return false;
        }
    }
    return true;
}


    
    //***********************************************************************************************
    // verificação se o número de eleitor inserido para votação é válido
    //***********************************************************************************************
    void VerificacaoNumero(Eleitor[] eleitor, Votacao[] votacao, int size, int i, boolean a){
        while(a == false){
            for (int j = 0; j < size; j++){
                // caso número de eleitor seja encontrado nos eleitores cadastrados
                if (votacao[i].NumEleitor == eleitor[j].NumEleitor){
                    // verificação se o número é correspondente ao nome inserido anteriormente
                    if (!votacao[i].NomeEleitor.equals(eleitor[j].NomeEleitor)) {
                        JOptionPane.showMessageDialog(null, "Número de eleitor não correspondente ao nome.");
                        votacao[i].NumEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitor correspondente ao nome inserido[" + votacao[i].NomeEleitor + "]:"));
                        VerificacaoNumero(eleitor, votacao, size, i, a);
                    }
                    // verificação se o número é correspondente a seção inserida anteriormente  
                    else if (votacao[i].Secao != eleitor[j].Secao) {
                        JOptionPane.showMessageDialog(null, "Número de eleitor não correspondente a esta seção.");
                        votacao[i].NumEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitor da seção inserida["+votacao[i].Secao+"]:"));
                        VerificacaoNumero(eleitor, votacao, size, i, a);
                    }                                         
                    a = true;
                    break;
                } 
            }
            // caso número de eleitor não seja encontrado
            if (a == false){
                JOptionPane.showMessageDialog(null, "Número de eleitor Inválido");
                votacao[i].NumEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de eleitor válido:"));
            }
        }
    }    
}