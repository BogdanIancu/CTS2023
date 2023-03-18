package ro.ase.acs.simplefactory;

public class RestApiFactory {
    private static final String DEVELOPMENT = "Development";
    private static final String PRODUCTION = "Production";

    public RestApi getRestApi(String serverType){
        if(DEVELOPMENT.equals(serverType)){
            return new RestApiDevelopment();
        }
        else if(PRODUCTION.equals(serverType)){
            return new RestApiProduction();
        }
        return null;
    }
}
