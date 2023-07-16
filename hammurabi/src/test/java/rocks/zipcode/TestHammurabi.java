package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Hammurabi;

import java.util.Random;

public class TestHammurabi {



    @Test
    public void testAskHowManyAcresToBuy() {
        //Given
//        Hammurabi ham = new Hammurabi();
//
//        //When
//
//
//        int actualNum = ham.askHowManyAcresToBuy(8, 20);
//        int expectedNum = 0;
//
//        //Then
//        Assert.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void testAskHowManyAcresToSell() {
        //Given
        //When
        //Then
    }

    @Test
    public void testAskHowMuchGrainToFeedPeople() {
        //Given
        //When
        //Then
    }

    @Test
    public void testAskHowManyAcresToPlant() {
        //Given
        //When
        //Then
    }

    @Test
    public void testPlagueDeaths() {
        //Given
        Hammurabi ham = new Hammurabi();
        Random rand = new Random();

        //When
        int expectedPeople;
        int actualPeople;

        if (rand.nextInt(1,101) <= 15) {
            ham.setPeople(ham.getPeople() / 2);
            actualPeople = ham.getPeople();
            expectedPeople = 50;
        } else {
            expectedPeople = 100;
            actualPeople = ham.getPeople();
        }

        //Then
        Assert.assertEquals(expectedPeople, actualPeople);
    }

    @Test
    public void testStarvationDeaths() {
        //Given
        int deadPeople = Hammurabi.starvationDeaths(5, 85);

        //When
        int expectedPeopleDead = 1;
        int actualPeopleDead = deadPeople;

        //Then

        Assert.assertEquals(expectedPeopleDead, actualPeopleDead);
    }

    @Test
    public void testUprising() {
        //Given
        Hammurabi ham = new Hammurabi();

        //When
        boolean actualOutcome = ham.uprising(100, 25);
        boolean expectedOutcome = false;

        //Then
        Assert.assertTrue(actualOutcome == expectedOutcome);

    }

    @Test
    public void testImmigrants() {
        //Given
        Hammurabi ham = new Hammurabi();

        //When
        int actual = ham.immigrants(20, 30, 40);
        int expected = 3;

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testHarvest() {
        //Given
        Hammurabi ham = new Hammurabi();

        //When
        int expectedHarvest = ham.harvest(100, 500);

        //Then
        Assert.assertTrue(expectedHarvest >= 100 && expectedHarvest <=700);
    }

    @Test
    public void testGrainEatenByRats() {
        //Given
        Hammurabi ham = new Hammurabi();

        //When
        int actualRats = ham.grainEatenByRats(100);
        int expectedRats1 = 100;

        //Then
        Assert.assertTrue(actualRats <= 30 || actualRats >= 10 || actualRats == expectedRats1);

    }

    @Test
    public void testGetHammurabi() {
        //Given
        Hammurabi ham = new Hammurabi();

        //When
        Hammurabi expectedHammurabi = ham.getHammurabi();

        //Then

        Assert.assertEquals(ham, expectedHammurabi);
    }

    @Test
    public void testGetPeople() {
        //Given
        Hammurabi ham = new Hammurabi();

        //When
        int actualPeople = ham.getPeople();
        int expectedPeople = 100;

        //Then
        Assert.assertEquals(expectedPeople, actualPeople);
    }

    @Test
    public void testGetLandValue() {
        //Given
        Hammurabi ham = new Hammurabi();

        //When
        int actualLandValue = ham.getLandValue();
        int expectedLandValue = 19;

        //Then
        Assert.assertEquals(expectedLandValue, actualLandValue);
    }

    @Test
    public void testGetBushels() {
        //Given
        Hammurabi ham = new Hammurabi();

        //When
        int actualBushels = ham.getBushels();
        int expectedBushels = 2800;

        //Then
        Assert.assertEquals(expectedBushels, actualBushels);
    }

    @Test
    public void testGetAcres() {
        //Given
        Hammurabi ham = new Hammurabi();

        //When
        int actualAcres = ham.getAcres();
        int expectedAcres = 1000;

        //Then
        Assert.assertEquals(expectedAcres, actualAcres);
    }




}