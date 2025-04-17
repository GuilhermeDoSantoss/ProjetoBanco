/*
Um banco mantém o cadastro de dois tipos de contas:
- conta corrente
- conta poupança
Para todas as contas, o banco de conhecer:
1 - numero da conta, nome do cliente e saldo atual
2 - deve conhecer tambem se uma determinada conta corrente utiliza cheques ou não
3 - para  uma conta poupança um rendimento deve ser aplicado
4 - para todas as contas, deve ser possível sacar, depositar e verificar o saldo.
levando em conta esta descrição,
modele e implemente as classes necessárias para o funcionamento do banco.
crie uma classe utilitária (com medoto main) que cria algumas contas ( de ambos os tipos).
*/

public class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldoAtual;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public double retornarSaldoConta() {
        return saldoAtual;
    }

    public void depositar(double valorDeposito){
        this.saldoAtual += valorDeposito;
    }

    public void sacar(double valorSacar){
        if (this.saldoAtual - valorSacar < 0){
            System.out.println("Saldo insufuciente");
            return;
        }
        this.saldoAtual -= valorSacar;
    }
}
