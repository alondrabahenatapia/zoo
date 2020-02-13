class Animal {
    public String name;
    public String favoriteFood;

    public Animal(String n, String f) {
        // put your initializer content here
        this.name = n;
        this.favoriteFood = f;
        population++;
    }

    //Methods

    static int population=0;
    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    //
    public void eat( String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println( "YUM!!! " + name + " wants more " + food);

        }
        if(food != favoriteFood){
            sleep("Tigger");

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
