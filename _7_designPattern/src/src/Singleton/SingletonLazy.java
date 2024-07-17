package Singleton;

/**
 * Singleton "lazy"
 *
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
        //by creating a private constructor, only the class itself can call it, therefore we are creating a Singleton
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}