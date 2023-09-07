import javax.swing.*;
import java.io.*;
public class ClasseMetodos {

    String arquivoCadastroDeContas = "ArquivoCadastroContas.txt";
    String arquivoContasAtualizadas = "Contas Atualizadas.txt";
    String arquivoRegistroDeMovimentos = "RegistroMovimentos.txt";
    String MenuMovimento = "Qual tipo de movimentação deseja realizar?"
            + "-------------------------------------------------------"
            + "1 - crédito"
            + "2 - débito"
            + "-------------------------------------------------------";

    public CadastroContas[] cadastrarContas(CadastroContas[] contas) throws IOException {
        BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivoCadastroDeContas));
        for (int contador = 0; contador < 5; contador++) {
            contas[contador].CodigoDaConta = Integer.parseInt(JOptionPane.showInputDialog("Insira O Código da Conta", "Cliente:" + (contador + 1)));
            escrever.write(Integer.toString(contas[contador].CodigoDaConta));
            escrever.newLine();
            contas[contador].NomeDoCliente = JOptionPane.showInputDialog("Insira o Nome do Cliente", "Cliente:" + (contador + 1));
            escrever.write(contas[contador].NomeDoCliente);
            escrever.newLine();
            contas[contador].SaldoDaConta = Double.parseDouble(JOptionPane.showInputDialog("Insira o Saldo do Cliente", "Cliente:" + (contador + 1)));
            escrever.write(Double.toString(contas[contador].SaldoDaConta));
            escrever.newLine();
            contas[contador].TipoDeConta = Integer.parseInt(JOptionPane.showInputDialog("Insira o Tipo de Conta", "Cliente:" + (contador + 1)));
            escrever.write(Integer.toString(contas[contador].TipoDeConta));
            escrever.newLine();
            if(contas[contador].TipoDeConta == 0){
                JOptionPane.showMessageDialog(null, "Você Não Possui Limite para Crédito Especial");
            }else if( (contas[contador].TipoDeConta == 1) || (contas[contador].TipoDeConta == 2) || (contas[contador].TipoDeConta == 3) ){
                contas[contador].LimiteDaConta = Double.parseDouble(JOptionPane.showInputDialog("Insira O Limite De Crédito do Cliente", "Cliente:" + (contador + 1)));
                escrever.write(Double.toString(contas[contador].LimiteDaConta));
                escrever.newLine();
            }else{
                JOptionPane.showMessageDialog(null, "Tipo de Conta Inválido!");
            
            }
        }
        escrever.close();
        return contas;
    }


    void MovimentoContas(MovimentoContas[] movimento, CadastroContas[] contas, CadastroContas[] contasatt) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoRegistroDeMovimentos));
        int j = 0;
        for (int i = 0; i < 5; i++) {
            contasatt[i] = contas[i];
        }

        for (int i = 0; i < 10; i++) {
            boolean a = false;
            movimento[i].CodigoContaM = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da conta:"));
            j = VerificarCodigoConta(movimento, contas, i, a, j);
            movimento[i].ValorMovimentoM = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor($) da movimentação:"));
            movimento[i].TipoMovimentoM = 0;
            while ((movimento[i].TipoMovimentoM != 1) && (movimento[i].TipoMovimentoM != 2)) {
                movimento[i].TipoMovimentoM = Integer.parseInt(JOptionPane.showInputDialog(MenuMovimento));
                switch (movimento[i].TipoMovimentoM) {
                    case 1:
                        if (movimento[i].StatusContaM == 1){

                            contasatt[i] = contasatt[i];

                        }

                        break;

                    case 2:
                        //verifica se o saldo da conta é maior ou igual ao valor da movimentação
                        if (contas[j].SaldoDaConta >= movimento[i].ValorMovimentoM) {
                            //Contas Atualizadas --> AMÓS, 1.2.2 caso saldoContaC >= ValorMovimentoM    
                            contasatt[i].SaldoDaConta = contasatt[i].SaldoDaConta - movimento[i].ValorMovimentoM;
                            if (contasatt[i].SaldoDaConta<0){
                                if (contasatt[i].TipoDeConta == 1) {
                                    JOptionPane.showMessageDialog(null, "Não é possível realizar o saque: saldo insuficiente");
                                } else if (contasatt[i].TipoDeConta == 2) {
                                    if (contasatt[i].LimiteDaConta >= movimento[i].ValorMovimentoM) {
                                        contasatt[i].SaldoDaConta = contasatt[i].SaldoDaConta - movimento[i].ValorMovimentoM;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Não é possível realizar o saque: limite de conta insuficiente");
                                    }
                                } else if (contasatt[i].TipoDeConta == 3) {
                                    if ( contasatt[i].LimiteDaConta + (contasatt[i].SaldoDaConta/2)>=movimento[i].ValorMovimentoM ) {
                                        contasatt[i].SaldoDaConta = contasatt[i].SaldoDaConta - movimento[i].ValorMovimentoM;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Não é possível realizar o saque: limite de conta insuficiente");
                                    }
                                } else if (contasatt[i].TipoDeConta == 4) {
                                    if (contasatt[i].LimiteDaConta + contasatt[i].SaldoDaConta >= movimento[i].ValorMovimentoM) {
                                        contasatt[i].SaldoDaConta = contasatt[i].SaldoDaConta - movimento[i].ValorMovimentoM;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Não é possível realizar o saque: limite de conta insuficiente");
                                    }
                                }
                            }

                            movimento[i].StatusContaM = 1;
                        } else {
                            movimento[i].StatusContaM = 2;
                            a = VerificarLimite(movimento, contasatt, j, i, a);
                            if (a == false) {
                                JOptionPane.showMessageDialog(null, "Limite Indisponível. Movimentação Cancelada.");
                                continue;
                            }
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida!");
                }
            }
            writeMovimento(writer, movimento, i);
        }
        writer.close();
        JOptionPane.showInputDialog(null, "Movimentos registrados. Retornando ao Menu Principal");
    }

    Integer VerificarCodigoConta(MovimentoContas[] movimento, CadastroContas[] contas, int i, boolean a, int j) {
        while (a == false) {
            for (j = 0; j < 5; j++) {
                //procura do código de conta fornecido na movimentação na base de dados do cadastro de contas
                if (movimento[i].CodigoContaM == contas[j].CodigoDaConta) {
                    a = true;
                    break;
                }
            }
            if (a == false) {
                JOptionPane.showMessageDialog(null, "Conta não encontrada.");
                movimento[i].CodigoContaM = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da conta:"));
            }
        }
        return j;
    }

    Boolean VerificarLimite(MovimentoContas[] movimento, CadastroContas[] contasatt, int i, int j, boolean a) {
        switch (contasatt[j].TipoDeConta) {
            //conta física
            case 1:
                a = false;
                break;
            //conta conjunta
            case 2:
                if (movimento[i].ValorMovimentoM <= (contasatt[j].SaldoDaConta + contasatt[j].LimiteDaConta)) {
                    a = true;
                    if (contasatt[j].LimiteDaConta >= movimento[i].ValorMovimentoM) {
                        contasatt[j].SaldoDaConta = contasatt[j].SaldoDaConta - movimento[i].ValorMovimentoM;
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possível realizar o saque: limite de conta insuficiente");
                    }
                } else {
                    a = false;
                }
                break;
            //conta jurídica
            case 3:
                if (movimento[i].ValorMovimentoM <= (contasatt[j].SaldoDaConta + contasatt[j].LimiteDaConta + (0.5 * contasatt[j].SaldoDaConta))) {
                    a = true;
                    if ( contasatt[j].LimiteDaConta + (contasatt[j].SaldoDaConta/2)>=movimento[i].ValorMovimentoM ) {
                        contasatt[j].SaldoDaConta = contasatt[j].SaldoDaConta - movimento[i].ValorMovimentoM;
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possível realizar o saque: limite de conta insuficiente");
                    }
                    //Contas Atualizadas --> AMÓS, caso seja possível realizar a movimentação com o valor disponível no limite
                } else {
                    a = false;
                }
                break;
            //conta especial
            case 4:
                if (movimento[i].ValorMovimentoM <= (contasatt[j].SaldoDaConta + contasatt[j].LimiteDaConta + (1 * contasatt[j].SaldoDaConta))) {
                    a = true;
                    //Contas Atualizadas --> AMÓS, caso seja possível realizar a movimentação com o valor disponível no limite
                    if (contasatt[j].LimiteDaConta + contasatt[j].SaldoDaConta >= movimento[j].ValorMovimentoM) {
                        contasatt[j].SaldoDaConta = contasatt[j].SaldoDaConta - movimento[i].ValorMovimentoM;
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possível realizar o saque: limite de conta insuficiente");
                    }
                } else {
                    a = false;
                }
                break;
        }
        return a;
    }

    void writeMovimento(BufferedWriter writer, MovimentoContas[] movimento, int i) throws IOException {
        writer.write("MOVIMENTAÇÃO " + (i + 1));
        writer.newLine();
        writer.write("Código da Conta: " + movimento[i].CodigoContaM);
        writer.newLine();
        writer.write("Valor de Movimento($): " + movimento[i].ValorMovimentoM);
        writer.newLine();
        if (movimento[i].TipoMovimentoM == 1) {
            writer.write("Tipo de Movimento: Crédito");
        }
        if (movimento[i].TipoMovimentoM == 2) {
            writer.write("Tipo de Movimento: Débito");
        }
        writer.newLine();
        if (movimento[i].StatusContaM == 1) {
            writer.write("Status da Conta: Saldo Disponível");
        }
        if (movimento[i].StatusContaM == 2) {
            writer.write("Status da conta: Cheque Especial");
        }
        writer.newLine();
        writer.write("");
    }

    public CadastroContas[] ContasATT(CadastroContas[] contasatt) throws IOException {
        BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivoContasAtualizadas));
        for (int contador = 0; contador < 5; contador++) {
            contasatt[contador].CodigoDaConta =contasatt[contador].CodigoDaConta ;
            escrever.newLine();
            contasatt[contador].NomeDoCliente = contasatt[contador].NomeDoCliente ;
            escrever.newLine();
            contasatt[contador].SaldoDaConta =  contasatt[contador].SaldoDaConta ;
            escrever.newLine();
            contasatt[contador].LimiteDaConta = contasatt[contador].LimiteDaConta ;
            escrever.newLine();
            contasatt[contador].TipoDeConta =   contasatt[contador].TipoDeConta;
            escrever.newLine();
        }
        escrever.close();
        return contasatt;
    }}