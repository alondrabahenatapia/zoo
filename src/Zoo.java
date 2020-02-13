public class Zoo {

    // put what you want to show in here.
    public static void main(String[] args) {
        Bear bear = new Bear("Bear");
        bear.eat("fish");
        bear.eat("kibble");
        Tiger tiger = new Tiger("Tiger");
        tiger.eat("meat");
        tiger.eat("kibble");
        Bee bee = new Bee("Stinger");
        bee.eat("ice cream");
        bee.eat("pollen");
        Giraffe giraffe = new Giraffe("Gemma");
        giraffe.eat("meat");
        giraffe.eat("leaves");
        Unicorn unicorn = new Unicorn("Rarity");
        unicorn.eat("marshmallows");
        unicorn.eat("corn");

        Animal[] a = {bear, tiger, bee,unicorn,giraffe};
        Zookeeper zookeeper = new Zookeeper("Zoebot");
        zookeeper.feedAnimals(a,"meat");
    }

    // this is the sleep method
    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    // this is the eating method
    String favoriteFood = "bacon";
    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println( "YUM!!! " + name + " wants more " + food);

        }
        if(food != favoriteFood){
            sleep("Tigger");

        }
    }
    //

















}






















