/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author EF
 */
public class AtRestTest {
    
    public AtRestTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of pressRightPedal method, of class AtRest.
     */
    @Test
    public void testPressRightPedal() {
        System.out.println("pressRightPedal");
        int numOfTimesPressed = 0;
        AtRest instance = new AtRest();
        Boolean expResult = null;
        Boolean result = instance.pressRightPedal(numOfTimesPressed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of pressLeftPedalForTime method, of class AtRest.
     */
    @Test
    public void testPressLeftPedalForTime() {
        System.out.println("pressLeftPedalForTime");
        int numOfSecondsPressed = 0;
        AtRest instance = new AtRest();
        Boolean expResult = null;
        Boolean result = instance.pressLeftPedalForTime(numOfSecondsPressed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
