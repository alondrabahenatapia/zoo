public class Giraffe extends Animal {

    public Giraffe(String name) {
        super(name,"leaves");
    }
    //Methods
    public void eat(String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println( "YUM!!! " + name + " wants more " + food);
            sleep(name);

        }
        if(food != favoriteFood){
            System.out.println("Yuck!!! " + name + " will not eat " + food);

        }

    }


}


