package introexceptionthrow;

public class Adult {

    private String name;
    private int age;

    public Adult(String name, int age) {
        this.name = name;
        if (age<18){
            throw new IllegalArgumentException("This age isnt accepted: "+age);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
