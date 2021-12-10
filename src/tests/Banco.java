package tests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Banco {
    private static List<String> transacoes;

    public static void registrarSaque(int cpf, double valorSaque, String data) {
        transacoes.add(Conta.SAQUE + ": " + cpf + " " + valorSaque + " " + data);
    }

    public static String getData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}

class Conta {
    protected static final String SAQUE = "Saque";
}

class ContaCorrente extends Conta {
    private double saldo;
    private int cpf;
    private List<String> extrato;

    boolean saque(double valorSaque) {
        // ... faz a operação
        extrato.add(SAQUE + ": " + cpf + " " + valorSaque);
        Banco.registrarSaque(cpf, valorSaque, Banco.getData());
    }
}
