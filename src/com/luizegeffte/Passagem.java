package com.luizegeffte;

public class Passagem implements Comparable<Passagem>{

    private String numero;
    private Voo vooIda;
    private Voo vooVolta;
    private Passageiro passageiro;
    private String assento;

    public Passagem(String numero, Voo vooIda, Voo vooVolta, Passageiro passageiro, String assento) {
        this.numero = numero;
        this.passageiro = passageiro;

        if(verificarCapacidade(vooIda, vooVolta)){
            this.vooIda = vooIda;
            this.vooVolta = vooVolta;
        }else{
            System.out.println("Voo sem disponibilidade!");
        }

        if(verificarAssento(assento)){
            this.assento = assento;
            this.vooIda.getAssentos().add(assento);
            this.vooVolta.getAssentos().add(assento);
        }else{
            System.out.println("Assento indiponível!");
        }

    }

    public Passagem(String numero, Voo vooIda, Passageiro passageiro, String assento) {
        this.numero = numero;
        this.passageiro = passageiro;

        if(verificarCapacidade(vooIda, null)){
            this.vooIda = vooIda;
        }else{
            System.out.println("Voo sem disponibilidade!");
        }

        if(verificarAssento(assento)){
            this.assento = assento;
            this.vooIda.getAssentos().add(assento);
        }else{
            System.out.println("Assento indiponível!");
        }
    }

    public boolean verificarAssento(String assento){
        if(vooIda.getAssentos().contains(assento) && vooVolta != null && vooVolta.getAssentos().contains(assento)){
            return false;
        }
        return true;
    }

    public boolean verificarCapacidade(Voo vooIda, Voo vooVolta){
        if(vooIda.getNumAssentosOcupados()+1 < vooIda.getNumAssentos()){
            if(vooVolta != null && vooVolta.getNumAssentosOcupados() + 1 < vooVolta.getNumAssentos()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return numero + " " + vooIda.toString() + " " + vooVolta.toString() + " " + passageiro.toString() + " " + assento;
    }

    @Override
    public int compareTo(Passagem p){
        return this.passageiro.getNome().compareTo(p.passageiro.getNome());
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Voo getVooIda() {
        return vooIda;
    }

    public void setVooIda(Voo vooIda) {
        this.vooIda = vooIda;
    }

    public Voo getVooVolta() {
        return vooVolta;
    }

    public void setVooVolta(Voo vooVolta) {
        this.vooVolta = vooVolta;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }
}
