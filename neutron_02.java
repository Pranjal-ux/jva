abstract class ALOM {

    abstract void display();

    void screen() {
        System.out.println("This is under abstract class");
    }
}

class Electron extends ALOM {
    void display() {
        System.out.println("Display method in Electron class");
    }
}

public class neutron_02 {
    public static void main(String[] args) {

        Electron obj = new Electron();
        obj.display();
        obj.screen();
    }
}
