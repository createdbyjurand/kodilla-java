package com.kodilla.testing.collection;

import static com.createdbyjurand.shared.display.Display.display;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("[CollectionTestSuite]: BeforeClass");
    }

    @Before
    public void before() {
        System.out.println("[CollectionTestSuite]: Before");
    }

    @After
    public void after() {
        System.out.println("[CollectionTestSuite]: After");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("[CollectionTestSuite]: AfterClass");
    }

    @Test
    @DisplayName("[CollectionTestSuite]: DisplayName")
    @Tag("[CollectionTestSuite]: Tag")
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        display("testOddNumbersExterminatorEmptyList");
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyArrayList);
        //Then
        Assert.assertEquals(emptyArrayList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        display("testOddNumbersExterminatorNormalList");
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(
            new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
        );
        //Then
        Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(0, 2, 4, 6, 8)), result);
    }
}
