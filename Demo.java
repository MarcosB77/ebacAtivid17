package FabricarCarros;

import FabricarCarros.Carro.Carro;
import FabricarCarros.Lista.ListaDeCarros;
import FabricarCarros.marcasDeCarro.Toyota;
import FabricarCarros.marcasDeCarro.Honda;
import FabricarCarros.marcasDeCarro.Chevrolet;

public class Demo {

    public static void main(String[] args) {
        // Criar uma lista de carros
        ListaDeCarros listaDeCarros = new ListaDeCarros();

        // Criar alguns carros
        Toyota<String> toyota = new Toyota<>("Toyota", "Corolla", "2022");
        Honda<String> honda = new Honda<>("Honda", "Civic", "2021");
        Chevrolet<String> chevrolet = new Chevrolet<>("Chevrolet", "Cruze", "2020");

        // Adicionar os carros à lista
        listaDeCarros.adicionarCarro(toyota);
        listaDeCarros.adicionarCarro(honda);
        listaDeCarros.adicionarCarro(chevrolet);

        // Demonstrar a lista de carros
        System.out.println("Lista de Carros:");
        for (Carro<?> carro : listaDeCarros.getCarros()) {
            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno());
        }


    }
}