package ro.ase.acs.cts.facade;

public class CarFacade {

    private Engine engine=new Engine();
    private BrakingSystem brakingSystem=new BrakingSystem();
    private LightingSystem lightingSystem=new LightingSystem();

    public void emergencyBrake(){
        engine.setLoad(0);
        brakingSystem.applyFrontBrakes();
        brakingSystem.applyRearBrakes();
        lightingSystem.turnOnHazardLights();
    }

    public void start(){
        lightingSystem.turnOnLowBeam();
        brakingSystem.resetBrakes();
        engine.setLoad(10);
    }
}
