package org.padroesjava.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author glayson brenno
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
