package facade;

import subsystem1.CrmService;
import subsystem2.ZipCodeApi;

public class Facade {
    public void migrateClient(String name, String zipcode){
        String city = ZipCodeApi.getInstance().recoverCity(zipcode);
        String state = ZipCodeApi.getInstance().recoverState(zipcode);

        CrmService.recordClient(name, zipcode, city, state);
    }
}
