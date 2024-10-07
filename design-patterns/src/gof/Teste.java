package gof;

public class Teste {
    public static void main(String[] args){
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
    }
}
