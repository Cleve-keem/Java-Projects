package Snacks;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    AirCondition airCondition = new AirCondition();

    @Test
    public void testThatAirConditionIsOffAtDefault() {
        assertFalse(airCondition.isACOn);
    }

    @Test
    public void testThatAirConditionCanBeTurnOnWhenOff() {
        airCondition.powerAc();
        assertTrue(airCondition.isACOn);
    }

    @Test
    public void testThatAirConditionCanTurnOffWhenOn(){
        airCondition.powerAc();
        boolean firstValueWhenPowerAc= airCondition.isACOn;
        airCondition.powerAc();
        boolean finalValueWhenPowerAgain = airCondition.isACOn;
        assertTrue(finalValueWhenPowerAgain != firstValueWhenPowerAc);
    }

    @Test
    public void testThatAirConditionTemperatureCanBeInCrease(){
        airCondition.powerAc();
        int initialTemperature = airCondition.temperature;
        airCondition.increaseTemperature();
        int finalTemperature = airCondition.temperature;
        assertEquals(finalTemperature, initialTemperature + 1);
    }

    @Test
    public void testThatAirConditionTemperatureCanBeDecrease(){
        airCondition.powerAc();
        int initialTemperature = airCondition.temperature;
        airCondition.decreaseTemperature();
        int finalTemperature = airCondition.temperature;
        assertEquals(finalTemperature, initialTemperature - 1);
    }

    @Test
    public void testThatAirConditionTemperatureCanNotBeIncreasedAbove30(){
        airCondition.powerAc();
        airCondition.increaseTemperature();
        assertEquals(30, airCondition.temperature);
    }

    @Test
    public void testThatAirConditionTemperatureCanNotBeDecreasedBeyond16(){
        airCondition.powerAc();
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.temperature);
    }

}