public class Zookeeper  {
    //property
    private String name;

    //constructor
    public Zookeeper(String name){
        this.name = name;

    }    //methods
    public void feedAnimals( Animal[] animals, String food)  {
        for(int i=0;i<animals.length;i++) {
            animals[i].eat(food);


        }
        System.out.print(name + " is feeding " + food + " to " + animals.length + " animals in a population of " + Animal.population);

        //loop through animals array and call animals[i].eat(food);

    }


}
