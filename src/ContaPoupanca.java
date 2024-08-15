public class ContaPoupanca extends Conta {

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Poupanca ===");
    super.imprimirExtrato();
  }

  @Override
  public void imprimirInformacoes() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'imprimirInformacoes'");
  }

}
