/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade6;

/**
 *
 * @author 12046386671
 */
public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    void roda(Conta c) {
        System.out.println("Saldo anterior: "+this.saldoTotal);
        c.atualiza(selic);
        this.saldoTotal += c.getSaldo();
        System.out.println("Saldo atual: "+this.saldoTotal);
    }
    
    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
}
