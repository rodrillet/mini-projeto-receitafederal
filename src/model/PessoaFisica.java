package model;

public class PessoaFisica extends Contribuinte {

    public PessoaFisica(String nome, double renda) {
        super(nome, renda);
    }

    @Override
    public double imposto() {

        double imposto = 0;
        double renda = this.getRenda();
        if (this.getRenda() <= 1400) {
            imposto = 0;
        } else if (renda >= 1400.01 && renda <= 2100) {
            imposto = renda * 0.10;
        } else if (renda > 2100.01 && renda <= 2800) {
            imposto = renda * 0.15;
        } else if (renda > 2800.01 && renda <= 3600) {
            imposto = renda * 0.25;
        } else if (renda >= 3600.01) {
            imposto = renda * 0.3;
        }
        return imposto;
    }
}
