package br.com.strategypattern.dominio;

import br.com.strategypattern.animal.Animal;

public class Gato implements Animal {

    @Override
    public String fala() {
        return "Miau";
    }
}
