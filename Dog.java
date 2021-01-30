public class Dog extends Animal {
    public static int dogCount;

    {
        count++;
        dogCount++;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public void run(int runLength) {
        if (runLength > 0 && runLength < 500) {
            System.out.println(this.name + " пробежал " + runLength + " м.");
        }
    }

    @Override
    public void swim(int swimLength) {
        if (swimLength > 0 && swimLength < 10) {
            System.out.println(this.name + " проплыл " + swimLength + " м.");
        }
    }
}
