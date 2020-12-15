import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJenkinsWithGit2 {
    private static final String START_STRING = "Start";
    private static final String STOP_STRING = "Stop";

    private Car car;

    @Before
    public void setUp(){
        car = new Car("Mocked brand");
    }

    @Test
    public void testStartAndStopCar(){
        String start = car.start();
        assertEquals(START_STRING,start);

        String stop = car.stop();
        assertEquals(STOP_STRING,stop);
    }

}
