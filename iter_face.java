interface first {
    abstract void display();

    String name = "Harry";
}

class semi implements first {
    @Override

    public void display() {
        System.out.println("This is the display");
    }
}

class inter_face {
    public static void main(String[] args) {
        semi obj = new semi();
        obj.display();
    }
}
