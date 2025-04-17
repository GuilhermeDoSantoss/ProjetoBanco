public class TestaBanco {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();
        cc.setNomeCliente("Matheus");
        cc.setNumeroConta(123);
        cc.informaUtilizaCheques(true);
        cc.depositar(500);
        System.out.println("Saldo da conta: " +cc.retornarSaldoConta());
        System.out.println("Fazendo saque na conta de 300");
        cc.sacar(300);
        System.out.println("Saldo da conta: "+cc.retornarSaldoConta());
    }
}
