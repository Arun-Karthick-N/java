public abstract class vehicle {
    public abstract void fuel();
    public static void main(String[] args) {
        car car=new car();
        truck truck = new truck();
        car.fuel();
        truck.fuel();
    }
}
class car extends vehicle{
    @Override public void fuel()
    {
        System.out.println("car : 50%");
    }
}

class truck extends vehicle{
    @Override public void fuel()
    {
        System.out.println("truck : 90%");
    }
}
