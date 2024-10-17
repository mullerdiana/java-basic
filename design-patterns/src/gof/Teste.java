package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.Comportamento;
import gof.strategy.ComportamentoAgressivo;
import gof.strategy.ComportamentoDefensivo;
import gof.strategy.ComportamentoNormal;
import gof.strategy.Robo;

public class Teste {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getIntancia();
        System.out.println(eager);
        eager = SingletonEager.getIntancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIntancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getIntancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Diana", "12345678");
    
    
    
    }

}
