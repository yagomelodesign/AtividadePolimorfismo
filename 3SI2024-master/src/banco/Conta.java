/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author tulio
 */
public class Conta {

    private int numero;  // atributos ou variáveis de instância
    private double saldo;
    private double limite;
    private static  int totalDeContas;
    Cliente objCliente = new Cliente();
    private int identificador;

     

    Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
        identificador = Conta.totalDeContas;
        System.out.println("Construindo uma conta!");
    }

    Conta(double saldo) {
        this(); // chama o contrutor padrão
        this.saldo = saldo;
    }

    Conta(double saldo, double limite, int numero) {
        this(saldo); // executa o construtor acima
        this.limite = limite;
        this.numero = numero;
    }
    
     public int getIdentificador() {
        return identificador;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return saldo + limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean saca(double quantidade) { //método
        if (this.getSaldo() >= quantidade) {
            this.saldo = this.saldo - quantidade;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente: " + this.getSaldo());
            return false;
        }
    }

    public void deposita(double quantidade) { //método
        this.saldo = this.saldo + quantidade;
    }

    public void transfere(Conta destino, double quantidade) {
        if (this.saca(quantidade)) {
            destino.deposita(quantidade);
        } else {
            System.out.println("Transferência não realizada!");
        }
    }

}
