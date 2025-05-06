public class ContaInvestimento {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;
    private double rendimentoAnual; // em percentual, ex: 5.0 para 5%

    public ContaInvestimento(String numeroConta, String nomeTitular, double saldoInicial, double rendimentoAnual) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
        this.rendimentoAnual = rendimentoAnual;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void aplicarRendimento() {
        double rendimento = saldo * (rendimentoAnual / 100);
        saldo += rendimento;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getRendimentoAnual() {
        return rendimentoAnual;
    }
}
