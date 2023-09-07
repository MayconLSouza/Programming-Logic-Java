//Classe Abstrata para cadastrar movimento nas contas 

public class MovimentoContas {

    int CodigoContaM, TipoMovimentoM, StatusContaM;
    double ValorMovimentoM;

    MovimentoContas() {
        this(0, 0.0, 0, 0);
    }

    MovimentoContas(int codConta, double valorMovimento, int tipoMovimento, int statusConta) {
        CodigoContaM = codConta;
        ValorMovimentoM = valorMovimento;
        TipoMovimentoM = tipoMovimento;
        StatusContaM = statusConta;
    }

}
