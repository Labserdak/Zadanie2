public class Main {
    public static void main(String[] ard) {
        Vetekenar vetekenar = new Vetekenar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Котопёс,", "Мясо,", "Под дверью");
        animals[1] = new Cat("Пёсокот,", "Рыба,", "На диване");
        animals[2] = new Horse("Старуха,", "Сено,", "За домом");

        for (Animal animal : animals) {
            vetekenar.treatAnimal(animal);
        }
    }
}
