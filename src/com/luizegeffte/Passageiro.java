package com.luizegeffte;

public class Passageiro extends Pessoa{

    int numPassaporte;

    public Passageiro(String nome, String cpf, String rg, Endereco endereco, String celular, String dataNascimento, int numPassaporte) {
        super(nome, cpf, rg, endereco, celular, dataNascimento);
        this.numPassaporte = numPassaporte;
    }

    @Override
    public String toString(){
        return super.getNome() + " " + super.getRg();
    }

    public int getNumPassaporte() {
        return numPassaporte;
    }

    public void setNumPassaporte(int numPassaporte) {
        this.numPassaporte = numPassaporte;
    }
}
