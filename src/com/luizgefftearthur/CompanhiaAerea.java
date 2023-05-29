package com.luizgefftearthur;

public class CompanhiaAerea {
    private String codCompan;
    private String nomeCompanhia;

    public CompanhiaAerea(String codCompan, String nomeCompanhia) {
        this.codCompan = codCompan;
        this.nomeCompanhia = nomeCompanhia;
    }

    @Override
    public String toString(){
        return codCompan + " " + nomeCompanhia;
    }

    public String getCodCompan() {
        return codCompan;
    }

    public void setCodCompan(String codCompan) {
        this.codCompan = codCompan;
    }

    public String getNomeCompanhia() {
        return nomeCompanhia;
    }

    public void setNomeCompanhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
    }
}
