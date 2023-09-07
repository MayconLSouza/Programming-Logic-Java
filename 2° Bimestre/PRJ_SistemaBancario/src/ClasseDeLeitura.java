
import javax.swing.JOptionPane;
import java.io.*;

public class ClasseDeLeitura {

    public void leituraCadastros(CadastroContas[] contas) throws IOException {
        String arquivoCadastroDeContas = "ArquivoCadastroContas.txt";
        BufferedReader leitura = new BufferedReader(new FileReader(arquivoCadastroDeContas));
        for (int contador = 0; contador < 5; contador++) {
            contas[contador].CodigoDaConta = Integer.parseInt(leitura.readLine());
            contas[contador].NomeDoCliente = leitura.readLine();
            contas[contador].SaldoDaConta = Double.parseDouble(leitura.readLine());
            contas[contador].LimiteDaConta = Double.parseDouble(leitura.readLine());
            contas[contador].TipoDeConta = Integer.parseInt(leitura.readLine());
        }
        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Código: " + contas[contador].CodigoDaConta + " Cliente: " + contas[contador].NomeDoCliente + " Saldo: " + contas[contador].SaldoDaConta + " Limite: " + contas[contador].LimiteDaConta + " Tipo: " + contas[contador].TipoDeConta);
        }
        leitura.close();
    }
    
    public void leituraMovimentos (MovimentoContas[] movimento) throws IOException{
        String FileName = "ArquivoMovimentosContas.txt";
        BufferedReader leitura = new BufferedReader(new FileReader(FileName));
        for(int contador = 0; contador < 10; contador++){
            movimento[contador].CodigoContaM = Integer.parseInt(leitura.readLine());
            movimento[contador].ValorMovimentoM = Double.parseDouble(leitura.readLine());
            movimento[contador].TipoMovimentoM = Integer.parseInt(leitura.readLine());
            movimento[contador].StatusContaM = Integer.parseInt(leitura.readLine());
            System.out.println("Codigo = " + movimento[contador].CodigoContaM + "\nValor = " + movimento[contador].ValorMovimentoM + "\nTipo de movimento = " + movimento[contador].TipoMovimentoM + "\nStatusContaM = " + movimento[contador].StatusContaM + "\n");
        }
        leitura.close();
    }
}
