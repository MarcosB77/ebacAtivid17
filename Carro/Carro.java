package FabricarCarros.Carro;

import FabricarCarros.Generics.ICarro;

public abstract class Carro<T> implements ICarro<T> {
    private T marca;
    private T modelo;
    private T ano;

    public Carro(T marca, T modelo, T ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public T getMarca() {
        return marca;
    }

    @Override
    public T getModelo() {
        return modelo;
    }

    @Override
    public T getAno() {
        return ano;
    }
}