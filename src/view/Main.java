package view;

import model.Contribuinte;
import model.PessoaFisica;
import model.PessoaJuridica;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contribuinte> contribuintes = new ArrayList<Contribuinte>();


        contribuintes.add(new PessoaJuridica("j1", 80000));
        contribuintes.add(new PessoaJuridica("j2", 3232));
        contribuintes.add(new PessoaJuridica("j3", 4000));
        contribuintes.add(new PessoaFisica("p1", 80000));
        contribuintes.add(new PessoaFisica("p2", 2300));
        contribuintes.add(new PessoaFisica("p3", 1230));

        for(Contribuinte c : contribuintes){
            System.out.println(c + "imposto: " + c.imposto());
        }




    }
}