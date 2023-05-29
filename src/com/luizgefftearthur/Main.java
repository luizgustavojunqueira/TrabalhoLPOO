package com.luizgefftearthur;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int op = -1;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("");
            //Decidir se vai sempre pedir pra criar todos os atributos
            // ou se vai armazenar cada Objeto num vetor de seu tipo
            // para pedir ao usuário para usar na criação de novos bilhetes

            op = ler.nextInt();
        }while(op != 0);




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

        Passageiro p1 = new Passageiro("Joao", "06004655198", "2345435", end2, "321", "89/10/2020", 333);
        Passagem pa1 = new Passagem("790", voo, p, "10");

    }
}
