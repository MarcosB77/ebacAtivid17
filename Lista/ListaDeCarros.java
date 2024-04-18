package FabricarCarros.Lista;

import FabricarCarros.Carro.Carro;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros {
    private List<Carro<?>> carros;

    public ListaDeCarros() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro<?> carro) {
        carros.add(carro);
    }

    public void removerCarro(Carro<?> carro) {
        carros.remove(carro);
    }

    public List<Carro<?>> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro<?>> carros) {
        this.carros = carros;
    }
}