import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Hammurabi;

public class TestGameCalc {

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
        //When
        //Then
    }

    @Test
    public void testGetLandValue() {
        //Given
        //When
        //Then
    }

    @Test
    public void testGetBushels() {
        //Given
        //When
        //Then
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
