class L7P1 {
    int id;
    String name;
    public L7P1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        L7P1 obj1 = new L7P1(1, "Sri");
        L7P1 obj2 = new L7P1(2, "Vishnu");

        System.out.println("Details of obj1:");
        obj1.display();

        System.out.println("\nDetails of obj2:");
        obj2.display();
    }
}