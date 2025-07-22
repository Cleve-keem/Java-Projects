import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogisticServiceTest {
    LogisticService logisticService = new LogisticService();

    @Test
    public void testThatLogisticServiceReturnsCorrectAllowanceIfCollectionRateIsLessThanFiftyPercent(){
        assertEquals(9000, logisticService.calculateAllowance(25));
    }

    @Test
    public void testThatLogisticServiceReturnsCorrectAllowanceIfCollectionRateIsWithInFiftyToFiftyNinePercent(){
        assertEquals(16000, logisticService.calculateAllowance(55));
    }
    @Test
    public void testThatLogisticServiceReturnsCorrectAllowanceIfCollectionRateIsWithInSixtyToSixtyNinePercent(){
        assertEquals(21750, logisticService.calculateAllowance(67));
    }
    @Test
    public void testThatLogisticServiceReturnsCorrectAllowanceIfCollectionRateIsGreaterThanSeventyPercent(){
        assertEquals(51000, logisticService.calculateAllowance(92));
    }
    @Test
    public void testThatLogisticServiceThrowsIllegalArgumentExceptionIfCollectionRateIsWrong(){
        assertThrows(IllegalArgumentException.class,()->logisticService.calculateAllowance(150));
    }
}