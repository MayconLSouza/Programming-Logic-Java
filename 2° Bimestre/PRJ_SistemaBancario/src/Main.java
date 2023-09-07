/*TODO: CLASSE PRINCIPAL PARA EXECUÇÃO DO SISTEMA
    Desenvolvedores: Amós Silva, Maycon Souza e Peterson Chaia
*/


import javax.swing.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        CadastroContas[] contas = new CadastroContas[5];
        CadastroContas[] contasatt = new CadastroContas[5];
        MovimentoContas[] movimento = new MovimentoContas[10];
        ClasseMetodos metodos = new ClasseMetodos();
        ClasseDeLeitura ler = new ClasseDeLeitura();
        int menu = 0;
        for(int contador = 0; contador < 5; contador++){
            contas[contador] = new CadastroContas();
        }
        for(int i = 0; i < 10; i++){
            movimento[i] = new MovimentoContas();
        }
        while (menu != 9){
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "----------------------------------------------------------------\n" +
                    " 1 - Cadastra Contas Correntes\n" +
                    " 2 - Cadastra movimento\n" +
                    " 3 - Gera Contas Atualizadas\n" +
                    " 4 - Consulta cadastros\n" +
                    " 9 - FIM\n" +
                    "----------------------------------------------------------------\n", "|                    MENU PRINCIPAL                    |", JOptionPane.PLAIN_MESSAGE));
            switch(menu){
                case 1:
                    /*Caso 1 TODO: Cadastra Contas*/

                    metodos.cadastrarContas(contas);
                     /*
                     //Teste para confirmar Retorno
                     for(int contador = 0; contador < 5; contador++) {
                         System.out.println(contas[contador].CodigoDaConta+" "+
                         contas[contador].NomeDoCliente+" "+
                         contas[contador].SaldoDaConta+" "+
                         contas[contador].LimiteDaConta+" "+
                         contas[contador].TipoDeConta+" ");
                     }*/
                    break;
                case 2:
                    /*Caso 2 Todo: Cadastra  Movimentos*/
                    metodos.MovimentoContas(movimento, contas, contasatt);
                    break;
                case 3:
                    /*Caso 3 TODO: Gera Contas Atualizadas*/
                    metodos.ContasATT(contasatt);
                    break;
                case 4:
                    /*Caso 4 Todo: Consulta Cadastros*/
                    while (menu != 9){
                        menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "----------------------------------------------------------------\n"+
                                        "1 - Contas Correntes\n"+
                                        "2 - Movimento\n"+
                                        "3 - Atualizado\n"+
                                        "9 - Voltar\n"+
                                        "----------------------------------------------------------------","|               CONSULTA CADASTROS               |",
                                JOptionPane.PLAIN_MESSAGE));
                        switch (menu) {
                            case 1:
                                ler.leituraCadastros(contas);
                                break;
                            case 2:
                                ler.leituraMovimentos(movimento);
                                break;
                            case 3:
                                break;
                            case 9:
                                //Retorna Para O menu Principal
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Insira um Valor Válido!", "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    menu = 0;

                    break;
                case 9:
                    /*Caso 9 Todo: Finaliza*/
                    JOptionPane.showMessageDialog(null, "Programa Finalizado pelo Usuário!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Insira um Valor Válido!", "ERRO", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

}