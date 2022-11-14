import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Animal[] animals = {
                new Shark("Kit", 40, "blue"),
                new Shark("Kit1", 45, "blue-white"),
                new Turtle("Turtle", 6, "bruwn"),
                new Turtle("Turtle1", 10, "bruwn-white"),
                new Eagle("Eagle", 8, "bruwn"),
                new Eagle("Eagle1", 3, "bruwn-white"),

        };
        for (Animal animal : animals) {
            System.out.println(animal);
            if (animal.getClass().equals(Shark.class)) animal.attack();
            {
                System.out.println(Arrays.toString(new Class[]{Turtle.class}));
            }
            if (animal.getClass().equals(Turtle.class)) animal.swim();
            {
                System.out.println(Arrays.toString(new Class[]{Eagle.class}));
            }
            if (animal.getClass().equals(Eagle.class)) animal.fly();

        }
    }

    public static void separateAnimals(Animal[] animals) {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                counter1++;
            } else if (animal instanceof Turtle) {
                counter2++;
            } else if (animal instanceof Eagle) {
                counter3++;
            }
        }
        Animal[] Sharks = new Animal[counter1];
        Animal[] Turtles = new Animal[counter2];
        Animal[] Eagles = new Animal[counter3];
        for (int i = 0; i < animals.length; i++) {
            for (int s = 0; s < Sharks.length; s++) {
                if (animals[i] instanceof Shark) Sharks[s] = animals[i];

                for (int t = 0; t < Turtles.length; t++) {
                    if (animals[i] instanceof Turtle) Turtles[t] = animals[i];

                    for (int e = 0; e < Eagles.length; e++) {
                        if (animals[i] instanceof Eagle) Eagles[e] = animals[i];
                    }
                }


            }
        }
        System.out.println("sharkes"+Arrays.toString(Sharks));
        System.out.println("turtles"+Arrays.toString(Turtles));
        System.out.println("eagles"+Arrays.toString(Eagles));
    }
}


