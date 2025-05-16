public class clsobj {
    String name;
    int ram;
    int price;

    public static void main(String[] args) {
        clsobj ideapad =new clsobj();
        ideapad.name="Ideapad_gaming_3";
        ideapad.ram=16;
        ideapad.price=70000;
        System.out.println(ideapad.name+" "+ideapad.ram+" "+ideapad.price);
        clsobj thinkpad=new clsobj();
        thinkpad.name="Thinkpad gaming";
        thinkpad.ram=8;
        thinkpad.price=60000;
        System.out.println(thinkpad.name+" "+thinkpad.ram+" "+thinkpad.price);

    }
    
}
