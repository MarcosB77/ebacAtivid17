package FabricarCarros.marcasDeCarro;

import FabricarCarros.Carro.Carro;

public class Honda <T> extends Carro<T> {
    public Honda(T marca, T modelo, T ano) {
        super(marca, modelo, ano);
    }
}
