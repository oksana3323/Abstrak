public  abstract class Person {
    private String name;
    private String gender;

    public abstract void work();

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';

    }
}
