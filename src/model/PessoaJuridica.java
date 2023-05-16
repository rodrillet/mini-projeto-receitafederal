package model;

public class PessoaJuridica extends Contribuinte {
    public PessoaJuridica(String nome, double renda) {
        super(nome, renda);
    }

    @Override
    public double imposto() {
        return this.getRenda() * 0.1;
    }
}
