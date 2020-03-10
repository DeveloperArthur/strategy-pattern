package br.com.strategypattern;

import br.com.strategypattern.animal.Animal;
import br.com.strategypattern.dominio.Cachorro;
import br.com.strategypattern.dominio.Gato;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println(gato.fala());
        System.out.println(cachorro.fala());
    }
}

/*Eu poderia muito bem, criar uma classe Animal e dizer que "se for gato, fale isso", "se for cachorro, fale isso"
Mas cada vez que eu criasse outro animal no meu sistema, a quantidade de "se for" na classe Animal ia aumentar cada vez mais,
isso não é bom, ao invés disso temos o Strategy, um padrão para: Ao invés de ter uma classe que tem forte tendencia em
só aumentar, criamos uma interface e fazemos as classes dependerem da interface para funcionar, assim, quando outro animal
entrar no meu sistema, eu apenas tenho que implementar a interface e dizer como ele 'fala'.*/
