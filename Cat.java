public class Cat extends Animal {
    public static int catCount;

    {
        count++;
        catCount++;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run(int runLength) {
        if (runLength > 0 && runLength < 200) {
            System.out.println(this.name + " пробежал " + runLength + " м.");
        }
    }

    @Override
    public void swim(int swimLength) {
        System.out.println(this.name + " я не умею плавать!");
    }
}
