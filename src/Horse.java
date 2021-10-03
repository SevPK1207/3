public class Horse extends Animal {
    public Horse(String food, String location, int speed) {
        super(food, location);
        this.speed=speed;
        vidAnimal = "Лошадь";
    }
    int speed;
}
