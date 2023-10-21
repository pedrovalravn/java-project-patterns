package subsystem1;

public class CrmService {
   private CrmService(){
    super();
   }
    
    public static void recordClient(String name, String zipcode, String city, String state){
        System.out.println("Client saved on CRM system: ");
        System.out.println(name);
        System.out.println(zipcode);
        System.out.println(city);
        System.out.println(state);
    }
}
