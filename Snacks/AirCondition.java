package Snacks;

public class AirCondition {
    public boolean isACOn = false;
    public int temperature = 30;

    public void powerAc() {
        isACOn = !isACOn;
    }

    public void increaseTemperature() {
        if(temperature < 30){
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if(temperature > 16) {
            temperature--;
        }
    }
}
