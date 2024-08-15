public class Main {

  public static void main(String[] args) {
    Conta cc = new ContaCorrente();
    Conta poupanca = new ContaPoupanca();

    cc.setSaldo(100);
    cc.depositar(100);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}
