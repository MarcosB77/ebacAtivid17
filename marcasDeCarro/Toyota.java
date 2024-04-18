package FabricarCarros.marcasDeCarro;

import FabricarCarros.Carro.Carro;

public class Toyota<T> extends Carro<T> {
    public Toyota(T marca, T modelo, T ano) {
        super(marca, modelo, ano);
    }
}