import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJenkinsWithGit1 {
    private Car car;

    @Before
    public void setUp(){
        car = new Car("Mocked brand");
    }

    @Test
    public void testNewCarIsStop(){
        assert !car.isRunning();
    }

}
