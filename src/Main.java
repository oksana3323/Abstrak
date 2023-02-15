public class Main {
    public static void main(String[] args) {
Employee employee=new Employee("Oksana","j",0);
 Employee person1   =new Employee("Aizat","j",1);
        System.out.println(employee.getName()+"\n"+employee.getGender());
        employee.work();
        System.out.println("++++++++++++++++++++++++++");
        System.out.println(person1.getName()+"\n"+person1.getGender()+"\n"+person1.toString());
   person1.work();


    }}