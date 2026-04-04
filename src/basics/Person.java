package basics;

public class Person {

    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getOccupation() { return occupation; }

    public void introduce() {
        System.out.println("Hi, I'm " + name +
                ", I'm " + age +
                " and I work as a " + occupation);
    }

    public static void main(String[] args) {
        Person person = new Person("Chris", 28, "Java Developer");
        person.introduce();
    }
}