package Snacks;

public class BikeSnack {
    public int gearLevel = 1;
    public boolean isBikeEngineOn = false;
    public int gearSpeed = 14;

    public String startBikeEngine() {
        if(isBikeEngineOn) {
            return "Bike Engine is already started";
        }
        isBikeEngineOn = true;
        return "Bike Engine is turned on";
    }

    public void updateGearLevel() {
        if(gearSpeed < 20){
            gearLevel = 1;
        } else if (gearSpeed > 20 && gearSpeed <= 30) {
            gearLevel = 2;
        } else if (gearSpeed > 30 && gearSpeed <= 40) {
            gearLevel = 3;
        }else {
            gearLevel = 4;
        }
    }

    public void accelerate() {
        if(!isBikeEngineOn){
            throw new IllegalStateException("Bike Engine is off");
        }
        updateGearLevel();
        gearSpeed = gearSpeed + gearLevel;
    }

    public void decelerate() {
        if(!isBikeEngineOn){
            throw new IllegalStateException("Bike Engine is off");
        }
        updateGearLevel();
        gearSpeed = gearSpeed - gearLevel;
    }

}
