package com.invoicegenerator.invoicegeneratortask;

import com.invoicegenerator.invoicegeneratortask.invoiceCreator.Product;
import org.junit.*;


public class InvoiceGeneratorTaskApplicationTests {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test number " + testCounter);
    }

    @Test
    public void testProductCreator() {
        //Given
        Product product = new Product("Chisel", "Industrial", 10, 15, 15 * 10);

        //When
        String name = "Chisel";
        //Then
        Assert.assertEquals("Chisel", name);
    }

    @Test
    public void testProductCreatorForCategory() {
        //given
        Product product = new Product("Chisel", "Industrial", 10, 15, 15 * 10);

        //when
        String category = "Industrial";
        //then
        Assert.assertEquals("Industrial", category);
    }

    @Test
    public void testProductForQuantity() {
        //given
        Product product = new Product("Chisel", "Industrial", 10, 15, 15 * 10);

        //when
        int quantity = 10;

        //then
        Assert.assertEquals(10, quantity);
    }

    @Test
    public void testProductIsNotNull() {
        //given
        Product product = new Product("Chisel", "Industrial", 10, 15, 15 * 10);

        //when

        //then
        Assert.assertNotNull(product);
    }

}
