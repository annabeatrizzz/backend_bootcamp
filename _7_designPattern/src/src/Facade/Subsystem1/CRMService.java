package Facade.Subsystem1;

public class CRMService {

    private CRMService(){
        super();
    }
    public static void recordClient(String name, String cep, String city, String region){
        System.out.println(
                "Client saved on CRM Service"
        );
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(region);
    }
}