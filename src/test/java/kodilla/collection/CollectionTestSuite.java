package kodilla.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(2);
        listNumbers.add(8);
        listNumbers.add(7);
        listNumbers.add(5);
        listNumbers.add(4);
        listNumbers.add(1);
        System.out.println("Basic list - " + listNumbers);

        //When
        OddNumbersExterminator listEvenNumbers = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(2);
        testList.add(8);
        testList.add(4);

        //Then
        Assert.assertEquals(testList , listEvenNumbers.exterminate(listNumbers));
        System.out.println("List after extermination odd numbers - " + listEvenNumbers.exterminate(listNumbers));
        System.out.println("List numbers to compare - " + testList);

    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> listNumbers = new ArrayList<>();

        //When
        OddNumbersExterminator listEvenNumbers = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<>();

        //Then
        Assert.assertEquals(testList , listEvenNumbers.exterminate(listNumbers));
    }
}
