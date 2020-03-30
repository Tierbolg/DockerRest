package RestService;

public class Greeting {
    //private String lowPower;
    private final String Id;
    private String Age ;
    private String Name;

    public Greeting(String id) {
        this.Id=id;
        this.Age=getAge(id);
        this.Name=getName(id);
    }

    private String getName(String id){
        String defaultId="DemoTest";
        int resultId=0;
        try{
            resultId = Integer.parseInt(id);
        }
        catch ( Exception e){
            System.out.println(e.getMessage());
        }

        switch (resultId){
            case 111:
                defaultId="Gilberto";
                break;
            case 222:
                defaultId="Diego";
                break;
            case 999:
                defaultId="Monica";
                break;
        }
        return defaultId;
    }

    private String getAge(String subscriber){
        String lowPower="0";
        int resultSubscriber =0;

        try {
            Integer.parseInt(subscriber);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        switch (resultSubscriber){
                case 111:
                    lowPower="34.6";
                    break;
                case 222:
                    lowPower="35.2";
                    break;
                case 999:
                    lowPower="80.2";
                    break;
            }
        return lowPower;
    }
    public String getAge() {
        return getAge(this.Id);
    }
    public String getName() {
        return getName(this.Id);
    }
    public String getId() {
        return Id;
    }
}
