package Facade.Subsytem2;

import Singleton.SingletonEager;

public class CEP_API {
    private static CEP_API instance = new CEP_API();

    private CEP_API(){
        super();
    }
    public static CEP_API getInstance(){
        return instance;
    }

    public String recoverCity(String cep){
        return "Araraquara";
    }

    public String recoverRegion(String cep){
        return "North";
    }
}