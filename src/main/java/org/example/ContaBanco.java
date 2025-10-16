package org.example;

import java.sql.SQLOutput;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private int taxa;
     //
    public void abrirConta(String t) {
    this.setTipo(t);
    this.setStatus(true);
        if (t.equals("cc")) {
            this.setSaldo(50);
        } else if (t.equals("cp")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta() {
        if (this.saldo == 0) {
            System.out.println("Finalizando conta...");
        } else {
            System.out.println("Existem pendências na sua conta");
        }
    }

    public void depositar(int valor) {
        this.saldo += valor;
        System.out.println("Seu saldo é de" + saldo);
    }

    public void sacar(int valor) {
        this.saldo -= valor;
        System.out.println("Seu saldo é de" + saldo);
    }

    public void pagarMensal(int Saldo) {
        if (tipo.equals("cc")) {
            taxa = (5);
            this.saldo -= (taxa);

        } else if (tipo.equals("cp")) {
            taxa = (10);
            this.saldo -= (taxa);
        }

    }
    //construtor
    public ContaBanco() {

    }
    //special métodos
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }
}
