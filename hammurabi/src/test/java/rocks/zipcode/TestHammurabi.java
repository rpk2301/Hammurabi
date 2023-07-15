package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Hammurabi;

public class TestHammurabi {
    
    

    @Test
    public void testAskHowManyAcresToBuy() {
        //Given
        //When
        //Then
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
        //When
        //Then
    }

    @Test
    public void testStarvationDeaths() {
        //Given
        //When
        //Then
    }

    @Test
    public void testUprising() {
        //Given
        //When
        //Then
    }

    @Test
    public void testImmigrants() {
        //Given
        //When
        //Then
    }

    @Test
    public void testHarvest() {
        //Given
        //When
        //Then
    }

    @Test
    public void testGrainEatenByRats() {
        //Given
        //When
        //Then
    }

    @Test
    public void testGetHammurabi() {
        //Given
        //When
        //Then
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
