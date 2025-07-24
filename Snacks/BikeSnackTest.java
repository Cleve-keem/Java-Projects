package Snacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class BikeSnackTest {
    BikeSnack bike = new BikeSnack();

    @Test
    public void testThatBikeEngineCanBeStarted() {
        assertEquals("Bike Engine is turned on", bike.startBikeEngine());
    }

    @Test
    public void testThatBikeEngineIsAlreadyStarted() {
        bike.startBikeEngine();
        assertEquals("Bike Engine is already started", bike.startBikeEngine());
    }

    @Test
    public void testThatBikeEngineIsOffWhenAccelerating() {
        assertThrows(IllegalStateException.class, () -> bike.accelerate());
    }

    @Test
    public void testThatGearSpeedIsUpdatedEveryTimeBikeAccelerates() {
        bike.startBikeEngine();
        int gearSpeedBeforeBikeAcc = bike.gearSpeed;
        bike.accelerate();
        int gearSpeedAfterBikeAcc = bike.gearSpeed;
        assertEquals(gearSpeedAfterBikeAcc, gearSpeedBeforeBikeAcc + bike.gearLevel);
    }

    @Test
    public void testThatGearLevelIsUpdatedWhenSpeedExceedsLimit() {
        int gearLevelBeforeBikeUpdateGearLevel = bike.gearLevel;
        bike.updateGearLevel();
        int gearLevelAfterBikeUpdateGearLevel = bike.gearLevel;
        assertNotEquals(gearLevelAfterBikeUpdateGearLevel,  gearLevelBeforeBikeUpdateGearLevel);
    }

    @Test
    public void testThatGearLevelUpdatedToTwoWhenGearSpeedExceedsTwenty() {
        bike.updateGearLevel();
        int gearLevelAfterBikeUpdateGearLevel = bike.gearLevel;
        assertEquals(2, gearLevelAfterBikeUpdateGearLevel);
    }

    @Test
    public void testThatGearLevelUpdatedToThreeWhenGearSpeedExceedsThirty() {
        bike.updateGearLevel();
        int gearLevelAfterBikeUpdateGearLevel = bike.gearLevel;
        assertEquals(3, gearLevelAfterBikeUpdateGearLevel);
    }

    @Test
    public void testThatGearLevelUpdatedToFourWhenGearSpeedExceedsFourty() {
        bike.updateGearLevel();
        int gearLevelAfterBikeUpdateGearLevel = bike.gearLevel;
        assertEquals(4, gearLevelAfterBikeUpdateGearLevel);
    }

    @Test
    public void testThatGearLevelIsUpdatedWhenExceedsSpeedLimit() {
        bike.startBikeEngine();
        int gearLevelBeforeBikeAcc = bike.gearLevel;
        bike.accelerate();
        int gearLevelAfterBikeAcc = bike.gearLevel;
        assertNotEquals(gearLevelAfterBikeAcc, gearLevelBeforeBikeAcc);
    }

    @Test
    public void testThatBikeCanBeDecelerated() {
        assertThrows(IllegalStateException.class, ()-> bike.decelerate());
    }

    @Test
    public void testThatBikeSpeedReduceWhenDecelerating(){
        bike.startBikeEngine();
        int bikeSpeedBeforeDecelerated = bike.gearSpeed;
        bike.decelerate();
        int bikeSpeedAfterDecelerated = bike.gearSpeed;
        assertNotEquals(bikeSpeedAfterDecelerated, bikeSpeedBeforeDecelerated);
    }

}