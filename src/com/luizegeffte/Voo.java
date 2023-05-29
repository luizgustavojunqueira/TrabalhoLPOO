package com.luizegeffte;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Voo {
    private String numVoo;
    private Aeroporto origem;
    private Aeroporto destino;
    private Calendar dataHoraOrigem;
    private Calendar dataHoraDestino;
    private int numAssentos;
    private int numAssentosOcupados;
    private List<String> assentos;

    public Voo(String numVoo, Aeroporto origem, Aeroporto destino, Calendar dataHoraOrigem, Calendar dataHoraDestino, int numAssentos) {
        this.numVoo = numVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraOrigem = dataHoraOrigem;
        this.dataHoraDestino = dataHoraDestino;
        this.numAssentos = numAssentos;
        this.numAssentosOcupados = 0;
        this.assentos = new ArrayList<String>();
    }

    @Override
    public String toString(){
        return numVoo + " " + origem.toString() + " " + destino.toString() + " " + dataHoraOrigem.toString() + " " + dataHoraDestino.toString();
    }

    public List<String> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<String> assentos) {
        this.assentos = assentos;
    }

    public int getNumAssentosOcupados() {
        return numAssentosOcupados;
    }

    public void setNumAssentosOcupados(int numAssentosOcupados) {
        this.numAssentosOcupados = numAssentosOcupados;
    }

    public int getNumAssentos() {
        return numAssentos;
    }

    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    public String getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(String numVoo) {
        this.numVoo = numVoo;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public Calendar getDataHoraOrigem() {
        return dataHoraOrigem;
    }

    public void setDataHoraOrigem(Calendar dataHoraOrigem) {
        this.dataHoraOrigem = dataHoraOrigem;
    }

    public Calendar getDataHoraDestino() {
        return dataHoraDestino;
    }

    public void setDataHoraDestino(Calendar dataHoraDestino) {
        this.dataHoraDestino = dataHoraDestino;
    }
}

