package za.ac.cput.za.ac.cput.adpassignmentgroup;

import org.junit.jupiter.api.*;
import org.w3c.dom.ls.LSOutput;
import static org.junit.jupiter.api.Assertions.*;

class BranchTest {
    private Branch first;
    private Branch second;
    private Branch third;

    private String number;
    private String name;


    @BeforeEach
    void setUp() {
        first = new Branch();
        second = new Branch();
        third = second;
        number = "0785413201";
        name = "Jeff";
    }

    @Test
    void testIdentity(){
        assertSame("Jeff", name);
    }

    @Test
    void testEquality(){
        assertEquals(second, third);
    }

    @Test
    void testFailure(){
        fail("This test is now going to fail deliberately.");
        assertEquals(number, "0785413201");
    }

    @Test
    @Timeout(6)
    public void timeoutTest() throws InterruptedException{
        Thread.sleep(600);
        System.out.println("Test will passed within the stipulated time");
    }


    @Test
    @Disabled
    void testGetBranchNumber(){
        String expResult = "217091229";
        first.setBranchNumber("217091229");
        String actResult = first.getBranchNumber();
        assertEquals(expResult, actResult);
        fail("Prototype");
    }


    @AfterEach
    void tearDown() {
        System.out.println("The test has been executed!");
    }

}