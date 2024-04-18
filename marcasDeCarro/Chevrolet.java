package FabricarCarros.marcasDeCarro;

import FabricarCarros.Carro.Carro;

public class Chevrolet <T> extends Carro<T> {
    public Chevrolet(T marca, T modelo, T ano) {
        super(marca, modelo, ano);
    }
}
