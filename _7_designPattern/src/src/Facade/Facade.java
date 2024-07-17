package Facade;

import Facade.Subsystem1.CRMService;
import Facade.Subsytem2.CEP_API;

public class Facade {

    public void movingCliente(String name, String cep){
        String city = CEP_API.getInstance().recoverCity(cep);
        String region = CEP_API.getInstance().recoverRegion(cep);

        CRMService.recordClient(name, cep, city, region);
    }

}