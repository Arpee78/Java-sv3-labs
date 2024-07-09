package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TankTest {


    private Tank tank = new Tank();

    @Test
    public void testTankGoodValues() {
        tank.modifyAngle(-80);
        tank.modifyAngle(160);
        tank.modifyAngle(-10);
        assertEquals(70, tank.getAngle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTank1() {
        tank.modifyAngle(-90);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testTank2() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Turret can not reach a position outside of -80° and +80°!");
        tank.modifyAngle(-90);
    }

    @Test
    public void testTank3() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(-90));
        assertEquals("Turret can not reach a position outside of -80° and +80°!", iae.getMessage());
    }

}