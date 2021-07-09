import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Burritos {
    public static void main(String[] args){
        // EXTRA Weekly Challenge: Burritos+

        Random rand = new Random();

        int count = 0;


        ArrayList<String> rice = new ArrayList<>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");
        rice.add("all rice");

        ArrayList<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggie meat");
        meat.add("no meat");
        meat.add("all meat");

        ArrayList<String> beans = new ArrayList<>();
        beans.add("pinto");
        beans.add("no beans");
        beans.add("all beans");

        ArrayList<String> salsa = new ArrayList<>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");
        salsa.add("all salsa");

        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita veggie");
        veggies.add("no veggies");
        veggies.add("all veggies");

        ArrayList<String> cheese = new ArrayList<>();
        cheese.add("cheese");
        cheese.add("no cheese");

        ArrayList<String> guac = new ArrayList<>();
        guac.add("guac");
        guac.add("no guac");

        ArrayList<String> queso = new ArrayList<>();
        queso.add("queso");
        queso.add("no queso");

        ArrayList<String> sourCream = new ArrayList<>();
        sourCream.add("sour cream");
        sourCream.add("no sour cream");

        do {
            count++;
            double price = 3.00, priceRice, priceMeat, priceBeans, priceSalsa, priceVeggies;
            double priceCheese, priceGuac, priceQueso, priceSourCream;

            int randRiceIndex = rand.nextInt(rice.size());
            String randRice = rice.get(randRiceIndex);
            if (randRice.contains("no") == true){
                priceRice = 0;
            }else {
                priceRice = 0.50;
            }

            int randMeatIndex = rand.nextInt(meat.size());
            String randMeat = meat.get(randMeatIndex);
            if (randMeat.contains("no") == true){
                priceMeat = 0;
            }else {
                priceMeat = 0.50;
            }

            int randBeansIndex = rand.nextInt(beans.size());
            String randBeans = beans.get(randBeansIndex);
            if (randBeans.contains("no") == true){
                priceBeans = 0;
            }else {
                priceBeans = 0.50;
            }

            int randSalsaIndex = rand.nextInt(salsa.size());
            String randSalsa = salsa.get(randSalsaIndex);
            if (randSalsa.contains("no") == true){
                priceSalsa = 0;
            }else {
                priceSalsa = 0.50;
            }

            int randVeggiesIndex = rand.nextInt(veggies.size());
            String randVeggies= veggies.get(randVeggiesIndex);
            if (randVeggies.contains("no") == true){
                priceVeggies = 0;
            }else {
                priceVeggies = 0.50;
            }

            int randCheeseIndex = rand.nextInt(cheese.size());
            String randCheese= cheese.get(randCheeseIndex);
            if (randCheese.contains("no") == true){
                priceCheese = 0;
            }else {
                priceCheese = 0.50;
            }

            int randGuacIndex = rand.nextInt(guac.size());
            String randGuac= guac.get(randGuacIndex);
            if (randGuac.contains("no") == true){
                priceGuac = 0;
            }else {
                priceGuac = 0.50;
            }

            int randQuesoIndex = rand.nextInt(queso.size());
            String randQueso = queso.get(randQuesoIndex);
            if (randQueso.contains("no") == true){
                priceQueso = 0;
            }else {
                priceQueso = 0.50;
            }

            int randSourIndex = rand.nextInt(sourCream.size());
            String randSour = sourCream.get(randSourIndex);
            if (randSour.contains("no") == true){
                priceSourCream = 0;
            }else {
                priceSourCream = 0.50;
            }

            // calculating the total price
            price = price + priceRice + priceMeat + priceBeans + priceSalsa + priceVeggies +
                    + priceCheese + priceGuac + priceQueso + priceSourCream;

            System.out.println("Burrito " + count + ": " + randRice + "," + randMeat + ", " + randBeans + ", " +
                    randSalsa + ", " + randVeggies + ", " + randCheese + ", " + randGuac + ", " + randQueso + ", " +
                    randSour + "        $" + price);


        }while(count < 25);



















    }
}
