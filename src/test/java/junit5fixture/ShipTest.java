package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Titanic", 1909, 269);
    }

    @Test
    void testName() {
        assertEquals("Titanic", ship.getName());
        assertNotEquals("HMS Victory", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1909, ship.getYearOfConstruction());
        assertTrue(1909 == ship.getYearOfConstruction());
    }

    @Test
    void testLength() {
        assertEquals(269, ship.getLength());
    }

    @Test
    void testNull() {
        Ship shipNull = null;
        assertNull(shipNull);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship shipCopy = ship;
        assertSame(shipCopy, ship);
    }

    @Test
    void testNotSameObjects() {
        Ship shipNew = new Ship("Titanic", 1909, 269);
        assertNotSame(shipNew, ship);
    }

}