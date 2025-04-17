public class ContaPoupanca extends Conta{
    public void aplicarRendimento(double percentual){
        double saldo = retornarSaldoConta();
        double rendimento = saldo * (percentual / 100);
        depositar(rendimento);
    }
}
