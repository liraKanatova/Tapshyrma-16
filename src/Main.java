import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Animal [] animals={
                new Shark(),
                new Turtle(),
                new Eagle(),
        };
        System.out.println(Arrays.toString(new Class[]{Shark.class}));
        for (Animal animal:animals){
            animal.animalClass();
              if(animal.getClass().equals(Shark.class)){
                  ((Shark) animal).getAttack();
                  System.out.println(Arrays.toString(new Class[]{Turtle.class}));
              } else if (animal.getClass().equals(Turtle.class)) {
                  ((Turtle) animal).getSwim();
                  System.out.println(Arrays.toString(new Class[]{Eagle.class}));
              }else if(animal.getClass().equals(Eagle.class)){
                  ((Eagle) animal).getFly();


              }

            }
        }
    }
