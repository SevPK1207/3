public class Task3 {
    public static void main(String args[]) {
        Animal animal1 = new Animal("Мясо", "Россия");
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.eat());
        System.out.println(animal1.sleep());
        System.out.println(animal1.eat());
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.eat());
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.sleep());
        System.out.println(animal1.notSleep());
        System.out.println(animal1.makeNoise());
        Dog animal2 = new Dog("Мясо", "Россия", true);
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.eat());
        System.out.println(animal2.sleep());
        System.out.println(animal2.eat());
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.eat());
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.sleep());
        System.out.println(animal2.notSleep());
        System.out.println(animal2.makeNoise());
        Cat animal3 = new Cat("Корм", "Россия", 5);
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.eat());
        System.out.println(animal3.sleep());
        System.out.println(animal3.eat());
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.eat());
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.sleep());
        System.out.println(animal3.notSleep());
        System.out.println(animal3.makeNoise());
        Horse animal4 = new Horse("Овес", "Россия", 348);
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.eat());
        System.out.println(animal4.sleep());
        System.out.println(animal4.eat());
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.eat());
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.sleep());
        System.out.println(animal4.notSleep());
        System.out.println(animal4.makeNoise());
        Animal[] animals = {animal1, animal2, animal3, animal4};

        for(Animal a: animals){
            Veterenar.treatAnimal(a);
        }

    }
}

