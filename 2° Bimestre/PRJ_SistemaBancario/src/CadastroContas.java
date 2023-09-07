/*TODO: Classe Abstrata para criar cadastro de contas*/
public class CadastroContas {

    int CodigoDaConta;
    String NomeDoCliente;
    double SaldoDaConta;
    double LimiteDaConta;
    int TipoDeConta;

    CadastroContas() {
        this(0, "", 0.0, 0.0, 0);
    }

    CadastroContas(int codConta, String nomeCliente, double saldoConta, double limiteConta, int tipoConta) {
        CodigoDaConta = codConta;
        NomeDoCliente = nomeCliente;
        SaldoDaConta = saldoConta;
        LimiteDaConta = limiteConta;
        TipoDeConta = tipoConta;
    }
}
