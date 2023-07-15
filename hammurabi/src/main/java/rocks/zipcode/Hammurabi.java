package rocks.zipcode;
import java.util.Random;
import java.util.Scanner;
public class Hammurabi {

    Integer people = 100;

    public void setBushels(Integer bushels) {
        this.bushels = bushels;
    }

    Integer bushels = 2800;
    Integer acres = 1000;
    Integer landValue = 19;
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
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

    public void play()
    {
        while(1>0)
        {
            //Prints Menu
            getHammurabi().Message();
            //Prints the question How many acres would you like to buy, takes that result, compares it to the land value and the number they entered
            //    //if that is fine then it returns that number.
            int acres = askHowManyAcresToBuy(getLandValue(),getBushels());
            int selling = 0;
            if(acres==0)
            {
              selling=askHowManyAcresToSell(getAcres());
            }
            int feeding = askHowMuchGrainToFeedPeople(getBushels());
            int planting = askHowManyAcresToPlant(getAcres(),getPeople(),getBushels());



        }
    }

//Prints the question How many acres would you like to buy, takes that result, compares it to the land value and the number they entered
    //if that is fine then it returns that number.
    public  int askHowManyAcresToBuy(int price, int bushels) {
        System.out.println("How Many Acres Would You Like To Buy?");
        int f =scan.nextInt();
        if(f*price>bushels)
        {
            System.out.println("You do not have enough funds for that!");
            askHowManyAcresToBuy(price,bushels);
        }
        return f;
    }
    //Prints the Hammurabi menu.
    public String Message()
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
            askHowManyAcresToSell(acresOwned);
        }
        return selling;
    }

    public  int askHowMuchGrainToFeedPeople(int bushels) {
        System.out.println("How much grain would you like to feed your people?");
        int feeding = scan.nextInt();
        if(feeding>bushels)
        {
            System.out.println("You only have " + bushels +  ", you cannot feed your people more than you have!");
            askHowMuchGrainToFeedPeople(bushels);
        }
        return feeding;

    }


    public  int askHowManyAcresToPlant(int acresOwned, int population, int bushels) {

        System.out.println("How many acres would you like to plant with grain?");
        int planting = scan.nextInt();
        if(acresOwned<planting)
        {
          System.out.println("O Great Hammurabi, surely you jest! We only own " + acresOwned + " acres!");
          askHowManyAcresToPlant(acresOwned, population, bushels);  //2
        }
        else if((population*10)<planting)
        {
            System.out.println("O Great Hammurabi, our Kingdom cannot handle that much planting. We have but " + population + " people");
            askHowManyAcresToPlant(acresOwned, population, bushels);
        }
        else if(bushels*2<planting) {
            System.out.println("O Great Hammurabi, our Kingdom cannot handle that much planting. We have but " + bushels + " bushels");
            askHowManyAcresToPlant(acresOwned, population, bushels);
        }
        setBushels(bushels-(2*planting));
        return planting;

    }

    public  int plagueDeaths(int population){
        int chance = rand.nextInt(100);
        if(chance<16)
        {
            return (int) (population-(population*.15));
        }
        else return 0;
    }

    public static int starvationDeaths(int population, int bushelsFedToPeople){
        return 0;

    }

    public  boolean uprising(int population, int howManyPeopleStarved){
        if(population*.45>howManyPeopleStarved)
        {
            return false;
        }
        else return true;
    }

    public  int immigrants(int population, int acresOwned, int grainInStorage){
        return ((20*getAcres() + getBushels())/(100*getPeople()) +1);
    }


    public  int harvest(int acres, int bushelsUsedAsSeed){
        int random = rand.nextInt(1,7);
        return acres * random;

    }

    public  int grainEatenByRats(int bushels)
    {
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