public class employeedetal {
    String name,address;
    int age,ss;
    public static void main(String[] args) {
        salary emp= new salary("Arun Karthick",21,123456789,"Madurai",30000);
        emp.display();
    }
}
class employee extends employeedetal{
    employee(String name, int age, int ss, String address){
        this.name=name;
        this.age=age;
        this.ss=ss;
        this.address=address;
    }
}
class salary extends employee{
    int salary;
    salary(String name, int age, int ss, String address, int salary){
        super(name, age, ss,address);
        this.salary=salary;
    }
    void display()
    {
        System.out.println(name+" age "+age+" address "+address+" social scecurity number "+ss+" salary "+salary);
    }
}