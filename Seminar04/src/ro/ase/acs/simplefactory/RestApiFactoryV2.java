package ro.ase.acs.simplefactory;

import ro.ase.acs.exceptions.InvalidServerTypeException;

public class RestApiFactoryV2 {
    public RestApi getRestApi(ServerType serverType) throws InvalidServerTypeException {
        switch (serverType){
            case PRODUCTION:
                return new RestApiProduction();
            case DEVELOPMENT:
                return new RestApiDevelopment();
            default:
                throw new InvalidServerTypeException();
        }
    }
}
