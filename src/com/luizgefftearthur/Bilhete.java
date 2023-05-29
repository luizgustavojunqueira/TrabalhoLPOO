package com.luizgefftearthur;

import java.util.Collections;
import java.util.List;

public class Bilhete<T>{

    private T numBilhete;
    private List<Passagem> listPassagem;
    private double preco;
    private CompanhiaAerea compAerea;

    public Bilhete(T numBilhete, List<Passagem> listPassagem, double preco, CompanhiaAerea compAerea) {
        this.numBilhete = numBilhete;
        this.listPassagem = listPassagem;
        this.preco = preco;
        this.compAerea = compAerea;
    }

    public void imprimirBilhete(){
        // TODO
        System.out.println(numBilhete + " " + preco + " " + compAerea.toString());
        Collections.sort(listPassagem);
        for(Passagem p: listPassagem){
            System.out.println(p.getPassageiro().getNome());
        }
    }

    public T getNumBilhete() {
        return numBilhete;
    }

    public void setNumBilhete(T numBilhete) {
        this.numBilhete = numBilhete;
    }

    public List<Passagem> getListPassagem() {
        return listPassagem;
    }

    public void setListPassagem(List<Passagem> listPassagem) {
        this.listPassagem = listPassagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public CompanhiaAerea getCompAerea() {
        return compAerea;
    }

    public void setCompAerea(CompanhiaAerea compAerea) {
        this.compAerea = compAerea;
    }
}
