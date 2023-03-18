package ro.ase.acs.main;

import ro.ase.acs.exceptions.InvalidServerTypeException;
import ro.ase.acs.simplefactory.RestApi;
import ro.ase.acs.simplefactory.RestApiFactory;
import ro.ase.acs.simplefactory.RestApiFactoryV2;
import ro.ase.acs.simplefactory.ServerType;
import ro.ase.acs.singleton.Logger;
import ro.ase.acs.singleton.LoggerV2;
import ro.ase.acs.singleton.LoggerV3;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.log("Main started!");

        Logger.getLogger().log("Logger");

        LoggerV2.INSTANCE.log("LoggerV2");

        LoggerV3.logger.log("LoggerV3");

        RestApiFactory restApiFactory=new RestApiFactory();
        RestApi restApi=restApiFactory.getRestApi("Development");
        if(restApi != null) {
            restApi.connect();
        }

        RestApiFactoryV2 restApiFactoryV2=new RestApiFactoryV2();
        try {
            restApi=restApiFactoryV2.getRestApi(ServerType.PRODUCTION);
            restApi.connect();
        } catch (InvalidServerTypeException e) {
            throw new RuntimeException(e);
        }


    }
}