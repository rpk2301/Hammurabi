package rocks.zipcode;
import java.util.Random;
import java.util.Scanner;
public class Hammurabi {

    Integer people = 100;
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
            getHammurabi().askHowManyAcresToBuy(getLandValue(),getBushels());

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


    public static int askHowManyAcresToSell(int acresOwned) {
        return 0;

    }

    public static int askHowMuchGrainToFeedPeople(int bushels) {
        return 0;

    }


    public static int askHowManyAcresToPlant(int acresOwned, int population, int bushels) {
        return 0;

    }

    public static int plagueDeaths(int population){
        return 0;

    }

    public static int starvationDeaths(int population, int bushelsFedToPeople){
        double deathToll = (double) ((population * 20) - bushelsFedToPeople) / 20;
        int deadPeople = (int) Math.ceil(deathToll);
        int result = 0;
        if (deadPeople > result) {
            result = deadPeople;
        }

        return result;
    }

    public static boolean uprising(int population, int howManyPeopleStarved){
        return false;
    }

    public static int immigrants(int population, int acresOwned, int grainInStorage){
        return 0;
    }


    public static int harvest(int acres, int bushelsUsedAsSeed){
        return 0;

    }

    public static int grainEatenByRats(int bushels){
        return 0;


    }
    public Hammurabi getHammurabi()
    {
        return this;
    }
    public Integer getPeople() {
        return people;
    }
    public void setPeople(Integer people) {this.people = people;}
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