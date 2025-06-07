class Actor {
    int ActorAge;
    String ActorName;

    Actor(int age, String name) {
        ActorAge = age;
        ActorName = name;
    }
}

public class debug {
    public static void main(String[] args) {
        System.out.println("we create a object to call a construtor");
        Actor obj = new Actor(19, "Harsh");
        System.out.println("Actor-age " + obj.ActorAge);
        System.out.println("Actor-Name  " + obj.ActorName);
    }
}
