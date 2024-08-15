public class ContaCorrente extends Conta {

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Corrente ===");
    super.imprimirExtrato();
  }

  @Override
  public void imprimirInformacoes() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'imprimirInformacoes'");
  }

}
