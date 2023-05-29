package com.luizegeffte;

public class Aeroporto {

    private String codAeroporto;
    private Endereco endereco;

    public Aeroporto(String codAeroporto, Endereco endereco) {
        this.codAeroporto = codAeroporto;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return codAeroporto + " " + endereco.getCidade();
    }

    public String getCodAeroporto() {
        return codAeroporto;
    }

    public void setCodAeroporto(String codAeroporto) {
        this.codAeroporto = codAeroporto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
