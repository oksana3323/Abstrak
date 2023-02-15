public class Employee extends Person {
   private int id;

    public Employee(String name, String gender, int id) {
        super(name, gender);
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }

    @Override
    public void work() {
       if (id==0){
        System.out.println("Jumushy ishtebeit");}
   else {
           System.out.println("Ishteit");
    }

    }
}


