package model.entidade;

import model.enumerado.Cor;

public class Circulo extends AbstracaoForma {

    private Double raio;

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double area() {
        return Math.PI * raio * raio;
    }
}
