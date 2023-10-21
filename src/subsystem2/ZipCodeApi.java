package subsystem2;

public class ZipCodeApi {
    
    private static ZipCodeApi instance = new ZipCodeApi();

    private ZipCodeApi(){
        super();
    }

    public static ZipCodeApi getInstance(){
        return instance;
    }

    public String recoverCity(String zipcode){
        return "New York";
    }
    
    public String recoverState(String zipcode){
        return "New York";
    }
}

