package com.luizegeffte;
import java.util.Scanner;

public abstract class Pessoa implements Verificavel{
    private String nome;
    private String cpf;
    private String rg;
    private Endereco endereco;
    private String celular;
    private String dataNascimento;

    public Pessoa(String nome, String cpf, String rg, Endereco endereco, String celular, String dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.celular = celular;
        this.dataNascimento = dataNascimento;

        if(validar(cpf)){
            this.cpf = cpf;
        }else{
            solicitarNovo();
        }
    }

    @Override
    public boolean validar(String CPF){
        // TODO Validar CPF
        int primeiroVerificador = 0;
        for(int i = 0; i<9; i++){
            primeiroVerificador += Integer.parseInt(String.valueOf(CPF.charAt(i))) * 10 - i + 1;
        }

        primeiroVerificador /= 11;

        if(primeiroVerificador < 2){
            primeiroVerificador = 0;
        }else{
            primeiroVerificador = 11 - primeiroVerificador % 11;
        }

        if(primeiroVerificador == Integer.parseInt(String.valueOf(CPF.charAt(9)))){
            int segundoVerificador = 0;
            for(int i = 0; i<10; i++){
                segundoVerificador += Integer.parseInt(String.valueOf(CPF.charAt(i))) * 10 - i + 1;
            }

            segundoVerificador /= 11;

            if(segundoVerificador < 2){
                segundoVerificador = 0;
            }else{
                segundoVerificador = 11 - segundoVerificador % 11;
            }

            if(segundoVerificador == Integer.parseInt(String.valueOf(CPF.charAt(10)))){
                return true;
            }
        }

        return true;
    }

    @Override
    public void solicitarNovo(){
        // TODO
        Scanner ler = new Scanner(System.in);
        System.out.println("CPF INVÁLIDO!");
        System.out.println("Digite um novo cpf: ");
        String cpf = ler.nextLine();
        if(validar(cpf)){
            this.cpf = cpf;
        }else{
            solicitarNovo();
        }
        ler.close();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

