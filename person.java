public class person {
    String name;
    person(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        employee emp=new employee(213024,"arun");
        emp.display();
        car car=new car();
        truck truck = new truck();
        car.fuel();
        truck.fuel();
    }
}
class employee extends person{
    int employeeid;
    employee(int employeeid,String name){
        super(name);
        this.employeeid=employeeid;
    }
    void display()
    {
        System.out.println(name+" "+employeeid);
    }
}
