package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {

        //Food[] refrigerator = new Food[3]; //creating array that store 3 objects

        Food food1 = new Food("pizza"); //giving a name of food1
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hot-dog");

        Food[] refrigerator = {food1, food2, food3}; //declare array of food objects and assign oll of values

        //refrigerator[0] = food1; //store food item in array of food objects called refrigerator
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name); //print all elements on console window
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);


    }
}
