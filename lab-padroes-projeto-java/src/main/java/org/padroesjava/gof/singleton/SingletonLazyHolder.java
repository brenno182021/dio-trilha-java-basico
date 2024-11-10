package org.padroesjava.gof.singleton;

/**
 * Singleton "Lazy holder".
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia </a>
 *
 * @author glayson brenno
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
