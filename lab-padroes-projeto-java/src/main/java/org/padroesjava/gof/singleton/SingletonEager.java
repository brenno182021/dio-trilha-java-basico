package org.padroesjava.gof.singleton;

/**
 * Singleton "apressado"
 * @author glayson brenno
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
