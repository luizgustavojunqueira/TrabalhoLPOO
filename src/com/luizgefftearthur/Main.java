package com.luizgefftearthur;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("Avenida alguma coisa", 725, "Pioneiros", "Campo Grande", "79070295");
        Endereco end2 = new Endereco("Avenida coisa alguma", 527, "Centro", "Campo Grande", "234563456");
        Aeroporto origem = new Aeroporto("123", end1);
        Aeroporto destino = new Aeroporto("456", end2);
        CompanhiaAerea companhiaAerea = new CompanhiaAerea("321", "AVUAOOO");
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.YEAR, 2022);
        c1.set(Calendar.MONTH, Calendar.MARCH);
        c1.set(Calendar.DAY_OF_MONTH, 20);
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.YEAR, 2023);
        c2.set(Calendar.MONTH, Calendar.JUNE);
        c2.set(Calendar.DAY_OF_MONTH, 21);
        Voo voo = new Voo("123456", origem, destino, c1, c2, 100);
        Passageiro p = new Passageiro("Luiz", "06004655198", "2404476", end1, "123", "08/06/2004", 123);
        Passagem pa = new Passagem("789", voo, p, "10");
        List<Passagem> lista = new ArrayList<Passagem>();
        lista.add(pa);
        Bilhete b = new Bilhete(1, lista, 10, companhiaAerea);

        b.imprimirBilhete();



    }
}
