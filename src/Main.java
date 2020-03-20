public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog.Builder()
                .age(20)
                .name("Cocky")
                .sex(Sex.FEMALE)
                .speed(30)
                .weight(20)
                .build();
        System.out.println(dog.toString());
        System.out.println("PELMEWE4KI!!!");
    }
}
