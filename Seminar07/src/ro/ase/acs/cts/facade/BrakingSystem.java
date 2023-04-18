package ro.ase.acs.cts.facade;

public class BrakingSystem {

    private int load;

    public void applyFrontBrakes(){
        System.out.println("Applying front brakes");
        load+=75;

        if(load>100){
            load=100;
        }

    }

    public void applyRearBrakes(){
        System.out.println("Applying rear brakes");
        load+=25;

        if(load>100){
            load=100;
        }
    }

    public void resetBrakes(){
        System.out.println("Reset brakes");
        load=0;
    }
}
