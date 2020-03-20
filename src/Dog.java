public class Dog
{
    private final String name;
    private final int weight;
    private final int age;
    private final int speed;
    private final Sex sex;

    public static class Builder
    {
        private String name;
        private int weight;
        private int age;
        private int speed;
        private Sex sex;

        public Builder() {

        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder weight(int val) {
            weight = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder speed(int val) {
            speed = val;
            return this;
        }

        public Builder sex(Sex val) {
            sex = val;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }

    private Dog(Builder builder) {
        name = builder.name;
        weight = builder.weight;
        age = builder.age;
        speed = builder.speed;
        sex = builder.sex;
    }

    public String toString() {
        String info = String.format("Name: %s\nWeight: %d kg\nAge: %d years\nSpeed: %d km/h\nSex: %s",
                name, weight, age, speed, sex);
        return info;
    }
}
