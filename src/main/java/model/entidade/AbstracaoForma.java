package model.entidade;

import model.enumerado.Cor;

public abstract class AbstracaoForma implements Forma {

    private Cor cor;

    public AbstracaoForma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract Double area();

}
