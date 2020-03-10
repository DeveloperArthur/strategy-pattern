package br.com.strategypattern.dominio;

import br.com.strategypattern.animal.Animal;

public class Cachorro implements Animal {

    @Override
    public String fala() {
        return "Au Au";
    }
}
