public class ContaTerminal {
  private String agencia;
  private int numero;
  private String nome;
  private double saldo;

  public ContaTerminal(String agencia, int numero, String nome, double saldo) {
    this.agencia = agencia;
    this.numero = numero;
    this.nome = nome;
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public String getAgencia() {
    return agencia;
  }
  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  @Override
  public String toString() {
    return "Olá " + this.nome + " obrigado por abrir uma conta no banco, sua agencia é: " + this.agencia + ", conta: " + this.numero + ", com saldo: " + saldo + " já esta disponivel para saque";
  }
  
}
