public class Animal {
    String food;
    String location;
    String vidAnimal;
public Animal( String food, String location){
    this.food=food;
    this.location=location;
    vidAnimal="Животное";
}
    String makeNoise() {
        if (isSleep) {
            return vidAnimal+" спит";
        } else {
            return vidAnimal+" шумит";
        }
    }

    String eat() {
        if (isSleep) {
            return vidAnimal+" спит";
        } else {
            return vidAnimal+" ест";
        }
    }

    String sleep() {
        isSleep = true;
        return vidAnimal+" спит";
    }

    String notSleep() {
        isSleep = false;
        return vidAnimal+" не спит";
    }

    boolean isSleep = false;

}
