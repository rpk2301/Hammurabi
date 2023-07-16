package rocks.zipcode;
import java.util.Random;
import java.util.Scanner;
public class Hammurabi {

    public void setPeople(Integer people) {
        this.people = people;
    }

    Integer people = 100;
    int year = 1;

    public void setBushels(Integer bushels) {
        this.bushels = bushels;
    }

    Integer bushels = 2800;

    public void setAcres(Integer acres) {
        this.acres = acres;
    }

    Integer acres = 1000;

    public void setLandValue(Integer landValue) {
        this.landValue = landValue;
    }

    Integer landValue = 19;
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static StringBuilder fb = new StringBuilder();
    /*
    Each person needs at least 20 bushels of grain per year to survive
Each person can farm at most 10 acres of land
It takes 2 bushels of grain to farm an acre of land
The market price for land fluctuates yearly
     */

    public static void main(String[] args) {
        Hammurabi hammurabi1 = new Hammurabi();
        hammurabi1.play();


    }
    //Forcing a commit
    public void play() {
        getHammurabi().WelcomeMessage();
        while (year < 11) {

            //Prints the question How many acres would you like to buy, takes that result, compares it to the land value and the number they entered
            //    //if that is fine then it returns that number.
            int acres = askHowManyAcresToBuy(getLandValue(), getBushels());
            gamecalcbuying(acres);
            int selling = 0;
            if (acres == 0) {
                selling = askHowManyAcresToSell(getAcres());
            }
            gameCalcSelling(selling);
            //Takes how much food Hammurabi wants to feed his people
            int feeding = askHowMuchGrainToFeedPeople(getBushels());
            gamecalcfeeding(feeding);
            //Takes how many acres we would like to plant with grain
            int planting = askHowManyAcresToPlant(getAcres(), getPeople(), getBushels());
            gamecalcPlanting(planting);
            //Takes how many people dies during the plague, if there was one
            int plaguedead = plagueDeaths(getPeople());
            gamecalcplague(plaguedead);
            //Takes how many people starved, may return 0
            int starved = starvationDeaths(getPeople(), feeding);
            gamecalcstarved(starved);
            boolean uprising = uprising(getPeople(), starved);
            gameCalcUprising(uprising);
            int immigrants = 0;
            if (starved == 0) {
                immigrants = immigrants(getPeople(), getAcres(), getBushels());
            }
            gamecalcimmigrants(immigrants, starved);
            int harvest = harvest(getAcres(), planting);
            gamecalcHarvest(harvest);
            int graineatenbyrats = grainEatenByRats(getBushels());
            calcGrainEatenRats(graineatenbyrats);

            calcnewcostofLand();

            fb.delete(0, fb.length());

            fb.append("You are in year " + (year + 1) + " of your ten year rule. \n");
            fb.append("In the previous year " + starved + " people starved to death \n");
            fb.append("In the previous year " + immigrants + " immigrants entered the kingdom \n");
            fb.append("The plague killed " + plaguedead + " this year!");
            fb.append("The population is now: " + getPeople() + " \n");
            fb.append("We harvested " + harvest + " barrels at " + getperacre(harvest,planting) + " per acre\n");
            fb.append("Rats destroyed " + graineatenbyrats + " bushels. We now have " + getBushels() + " in storage\n");
            fb.append("The city owns " + getAcres() + " acres of land \n");
            fb.append("Land is currently worth " + landValue + " bushels per acre \n");
            year++;
            System.out.println(fb.toString());

        }
        finalsummary();
    }

    public double getperacre(int harvest, int planting)
    {
        if(planting!=0 ) {
            return Math.ceil((double) harvest / planting);
        }
        else return 0.0;

    }
        public void finalsummary()
    {
        System.out.println("You made it to year " + year);
        if(acres > 500)
        {
            System.out.println("You were an A+ Ruler!");
        }
        else if(acres<250)
        {
            System.out.println("You were an okay ruler I guess.");
        }
    }



    public void gameCalcUprising(boolean uprising)
    {
        if(uprising==true)
        {
            System.out.println("THE PEOPLE HAVE RISEN AGAINST YOU");
            System.out.println("YOU HAVE BEEN OVERTHROWN");
            System.exit(0);
        }
    }
    public void gamecalcPlanting(int planting)
    {
     setBushels(bushels-(2*planting));
    }


    public void gameCalcSelling(int selling)
    {
        setBushels(bushels+(selling*landValue));
        setAcres(getAcres()-selling);
    }

public void gamecalcfeeding(int feed)
{
    setBushels(bushels-feed);
}
public void gamecalcbuying(int acres2)
{
    setAcres(acres+acres2);
    setBushels(bushels-(acres2*getLandValue()));
}



    public void gamecalcplague(int plaguedead)
    {
        if(plaguedead!=0)
        {
            setPeople(getPeople()-plaguedead);

        }
    }

    public void gamecalcstarved(int starved)
    {
        if(starved!=0)
        {
            setPeople(getPeople()-starved);

        }
    }

    public void gamecalcuprising(boolean uprising)
    {
        if(uprising==true)
        {
            System.out.println("YOU HAVE BEEN KICKED OUT VIA UPRISING HAMMURABI!");
        }
    }

    public void gamecalcimmigrants(int immigrants, int starved)
    {
        if(starved ==0)
        {
            setPeople(getPeople()+immigrants);
        }
    }

    public void  gamecalcHarvest(int harvest)
    {
        setBushels(bushels+harvest);
    }

    public void calcnewcostofLand() {
        setLandValue( rand.nextInt(17,24));
    }






    //Prints the question How many acres would you like to buy, takes that result, compares it to the land value and the number they entered
    //if that is fine then it returns that number.
    public  int askHowManyAcresToBuy(int price, int bushels) {
        System.out.println("How Many Acres Would You Like To Buy?");
        int f;
        do {
            f = scan.nextInt();
            if (f * price > bushels) {
                System.out.println("You do not have enough funds for that!");
            }
            if(f<0)
            {
                System.out.println("Please input a positive number, sire");
            }
        } while (f * price > bushels || f<0);


        return f;
    }
    //Prints the Hammurabi menu.
    public String WelcomeMessage()
    {
        sb.delete(0,sb.length());
        sb.append("O great Hammurabi! \n");
        sb.append("You are in year 1 of your ten year rule. \n");
        sb.append("In the previous year 0 people starved to death. \n");
        sb.append("In the previous year 5 people entered the kingdom. \n");
        sb.append("The population is now " + getPeople() + "\n");
        sb.append("We harvested 3000 bushels at 3 bushels per acre. \n");
        sb.append("Rats destroyed 200 bushels, leaving " + getBushels() + " bushels in storage. \n");
        sb.append("The city owns "+getAcres()+" acres of land. \n");
        sb.append("Land is currently worth " + getLandValue()+" bushels per acre. \n");
        System.out.println(sb.toString());
        return sb.toString();
    }
    public int askHowManyAcresToSell(int acresOwned) {
        System.out.println("How many acres would you like to sell?");
        int selling = scan.nextInt();
        if(selling>acresOwned)
        {
            System.out.println("You only have " + acresOwned + " acres, you cannot sell more than you have!");
           return askHowManyAcresToSell(acresOwned);
        }
        if(selling<0)
        {
            System.out.println("Please input a positive number, sire");
            return askHowManyAcresToSell(acresOwned);
        }
        return selling;
    }

    public  int askHowMuchGrainToFeedPeople(int bushels) {
        int feeding;
        System.out.println("How much grain would you like to feed your people?");
        do {

            feeding = scan.nextInt();

            if (feeding > bushels) {
                System.out.println("You only have " + bushels + ", you cannot feed your people more than you have!");
            }

            if(feeding<0)
            {
                System.out.println("Please enter a positive number, sire!");
            }
        } while (feeding > bushels || feeding<0);

        return feeding;
    }



    public  int askHowManyAcresToPlant(int acresOwned, int population, int bushels) {

        int planting;
        System.out.println("How many acres would you like to plant with grain?");
        do {

            planting = scan.nextInt();

            if (acresOwned < planting) {
                System.out.println("O Great Hammurabi, surely you jest! We only own " + acresOwned + " acres!");
            }
            else if ((population * 10) < planting) {
                System.out.println("O Great Hammurabi, our Kingdom cannot handle that much planting. We have but " + population + " people");
            }
            else if (planting*2 > bushels) {
                System.out.println("O Great Hammurabi, our Kingdom cannot handle that much planting. We have but " + bushels + " bushels");
            }
            if(planting<0)
            {
                System.out.println("Please enter a positive number, sire");
            }
        } while (acresOwned < planting || (population * 10) < planting || (bushels <2*planting || planting<0));

        return planting;
    }
    //forcing ocmmit
    public  int plagueDeaths(int population){
        int chance = rand.nextInt(100);
        if(chance<16)
        {
            return (int) (population/2);
        }
        else return 0;
    }

    public static int starvationDeaths(int population, int bushelsFedToPeople){
        double deathRate = (double) ((population * 20) - bushelsFedToPeople) / 20;
        deathRate = Math.ceil(deathRate);
        int ans = 0;
        if (deathRate > 0) {
            ans = (int) deathRate;
        }

        return ans;
    }

    public  boolean uprising(int population, int howManyPeopleStarved){
        if(population*.45 < howManyPeopleStarved)
        {
            return true;
        }
        else return false;
    }

    public  int immigrants(int population, int acresOwned, int grainInStorage){
        return ((20*getAcres() + getBushels())/(100*getPeople()) +1);
    }

    public void calcGrainEatenRats(int grainEatenByRats)
    {
        setBushels(bushels-grainEatenByRats);
    }

    public  int harvest(int acres, int bushelsUsedAsSeed){
        int random = rand.nextInt(1,7);
        if (bushelsUsedAsSeed >= acres * 2) {
            return acres * random;
        } else {
            return ((bushelsUsedAsSeed - acres * 2) / -2) * random;
        }


    }

    public int grainEatenByRats(int bushels) {

        int chance;
        int Amount;
        chance = rand.nextInt(1,101);
        if(chance <41) {
            int percentage = rand.nextInt(21) + 10; // Generate a random number between 10 and 30 (inclusive)

             Amount = (int) (bushels * (percentage / 100.0)); // Calculate the subtraction amount and cast to int
            return Amount;
        }
     return 0;
    }
    public Hammurabi getHammurabi()
    {
        return this;
    }
    public Integer getPeople() {
        return people;
    }
    public Integer getLandValue() {
        return landValue;
    }
    public Integer getBushels() {
        return bushels;
    }
    public Integer getAcres() {
        return acres;
    }





}