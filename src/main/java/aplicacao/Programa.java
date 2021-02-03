package aplicacao;

import model.entidade.AbstracaoForma;
import model.entidade.Circulo;
import model.entidade.Forma;
import model.entidade.Retangulo;
import model.enumerado.Cor;

public class Programa {

    public static void main(String[] args) {

        AbstracaoForma f1 = new Circulo(Cor.BLACK, 2.0);
        AbstracaoForma f2 = new Retangulo(Cor.WHITE, 3.0,4.0);

        System.out.println("Circulo Cor: " + f1.getCor());
        System.out.println("Circulo Area: "+ String.format("%.3f", f1.area()));
        System.out.println("Retangulo Cor: " + f2.getCor());
        System.out.println("Retangulo Area: "+ String.format("%.3f", f2.area()));

    }
}
