package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("7HeadDragon", 7, 10);
        String name = dragon.getName();
        assertEquals("7HeadDragon", name);
        assertNotEquals("3HeadDragon", name);
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("7HeadDragon", 7, 9.23);
        int heads = dragon.getNumberOfHeads();
        assertEquals(7, heads);
        assertTrue(7 == heads);
        assertFalse(7 != heads);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("7HeadDragon", 7, 9.23);
        double height = dragon.getHeight();
        assertEquals(9.2, height,0.05 );
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("7HeadDragon", 7, 9.23);
        Dragon dragonEmpty = null;
        assertNotNull(dragon);
        assertNull(dragonEmpty);

    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("7HeadDragon", 7, 9.23);
        Dragon dragonCopy = dragon;
        assertSame(dragonCopy, dragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon7Head = new Dragon("7HeadDragon", 7, 9.23);
        Dragon dragon3Head = new Dragon("3HeadDragon", 3, 3.13);
        assertNotSame(dragon7Head, dragon3Head);
    }

}