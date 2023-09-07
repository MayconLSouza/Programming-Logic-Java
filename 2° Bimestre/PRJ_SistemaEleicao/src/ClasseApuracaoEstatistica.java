/*
    Programadores: Maycon L.M. De Souza e Amós S. Souza
    Data: 27/04/2023 
    Classe: Módulos de apuração e estatísticas da votação
*/

import javax.swing.JOptionPane;
import java.util.Arrays;

class ClasseApuracaoEstatistica {
    //*********************************    
    // módulo agrupa apuração, acessado através da opção 3 do menu principal
    //*********************************
    String TextoEstatistica = "MENU ESTATISTICA\n"
            + "----------------------------------------------------------------\n"
            + "Escolha uma das opcões a seguir\n"
            + "----------------------------------------------------------------\n"
            + "1 - Vencedor\n" 
            + "2 - Segundo colocado\n" 
            + "3 - Quantidade de votos em branco\n" 
            + "4 - Quantidade de votos nulos\n" 
            + "5 - Mostra eleitores\n" 
            + "6 - Mostra apuração\n" 
            + "9 - Fim do menu estatísticas";
    static int[] votos = new int[5];

    public static void AGRUPAAPURACAO(Votacao[] votacao, int size) {
        boolean swp;
        for(int i = 0; i < (size - 1); i++){
            swp = false;
            for(int j = 0; j < (size - i - 1); j++){
                if(votacao[j].CodCandidato>votacao[j+1].CodCandidato){
                    Votacao aux = votacao[j];
                    votacao[j] = votacao[j+1];
                    votacao[j+1] = aux;
                    swp = true;
                }
            }
            if(swp==false){
                    break;
            }
        }
        for ( int i = 0; i < size; i++){
            System.out.println(votacao[i].NomeEleitor);
            System.out.println(votacao[i].CodCandidato);
        }
        for(int i = 0; i < size; i++){
            switch(votacao[i].CodCandidato){
                case 1:
                    votos[1]++;
                    break;
                case 2:
                    votos[2]++;
                    break;
                case 3:
                    votos[3]++;
                    break;
                case 4:
                    votos[4]++;
                    break;
                default:
                    votos[0]++;
                    break;
            }
        }
        if( ( votos[1] > votos[2] ) && ( votos[1] > votos[4] ) ){
            votos[1] += votos[3];
        }
        if( ( votos[2] > votos[1] ) && ( votos[2] > votos[4] ) ){
            votos[2] += votos[3];
        }
    }
    
    //***********
    // menu de estatísticas da votação, acessado através da opção 4 do menu principal
    //***********
    void MENUESTATISTICA(Votacao[] votacao) {
        while (true) {
            int MenuEstatistica = Integer.parseInt(JOptionPane.showInputDialog(TextoEstatistica));
            switch (MenuEstatistica) {
                case 1:
                    JOptionPane.showMessageDialog(null,Vencedor(votacao));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,Segundo(votacao));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,QuantidadeVotosBranco());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,QuantidadeVotosNulo());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,eleitores(votacao));
                    break;
                case 6:
                    Apuracao(votacao);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Fim do menu estatística. Retornando ao menu principal.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
            }
        }
    }
    
    //***********
    // módulo para ver o vencedor, acessado através da opção 1 do menu estatí­stica
    //***********
    String Vencedor(Votacao[] votacao) {
        if (( votos[4] > votos[1]) && (votos[4] > votos[2])){
            return "Houve quantidade grandes de votos nulos. Não houve vencedor.";
        }
        else{
            if (votos[1] > votos[2]) {
                return "O vencedor é José.\nVotos: " + votos[1] ;
            } else if (votos[2] > votos[1]) {
                return "A vencedora é Maria.\nVotos: " + votos[2] ;
            } else if (votos[1] == votos[2]) {
                return "Não há um vencedor. A votação terminou empatada com "+votos[1]+" votos.";    
            } else {
            return "Não foi possí­vel determinar o vencedor. Error code 1001.";
            }
        }
    }
    
    //***********
    // módulo para ver o Segundo colocado
    //***********
    String Segundo (Votacao[] votacao){
        if ((votos[4]  > votos[1]) && (votos[4] > votos[2])){
            return "Houve quantidade grandes de votos nulos. Não houve vencedor.";
        }
        else{
            if (votos[1] > votos[2]) {
                return "A segunda colocada é Maria.\nVotos: " + votos[2] ;
            } else if (votos[2] > votos[1]) {
                return "O segundo colocado é José.\nVotos: " + votos[1] ;
            } else if (votos[1] == votos[2]) {
                return "Não há um segundo colocado. A votação terminou empatada com "+votos[1]+" votos.";    
            } else {
            return "Não foi possí­vel determinar o segundo colocado. Error code 1001.";
            }
        }
    }
    
    //***********
    // módulo para ver a quantidade de votos brancos
    //***********
    String QuantidadeVotosBranco (){
        return "A quantidade de votos em branco foi " + votos[3];
    }
    
    //***********
    // módulo para ver a quantidade de votos nulos
    //***********
    String QuantidadeVotosNulo (){
        return "A quantidade de votos nulos foi " + votos[4];
    }
    
    //***********
    // módulo para ver os eleitores
    //***********
    String eleitores(Votacao[] votacao){ 
        String nomesEleitores = "";
        for (int i = 0; i < votacao.length; i++) 
            nomesEleitores += votacao[i].NomeEleitor + ", ";
        return nomesEleitores;
    }
    
    //***********
    // módulo para mostrar todos os resultados
    //***********
    void Apuracao(Votacao[] votacao) {
        String vencedor = Vencedor(votacao);
        String segundo = Segundo(votacao);
        String votosBranco = QuantidadeVotosBranco();
        String votosNulo = QuantidadeVotosNulo();
        String nomesEleitores = eleitores(votacao);

        JOptionPane.showMessageDialog(null, vencedor);
        JOptionPane.showMessageDialog(null,  segundo);
        JOptionPane.showMessageDialog(null,votosBranco);
        JOptionPane.showMessageDialog(null,votosNulo);
        JOptionPane.showMessageDialog(null,nomesEleitores);
    }
}