   public static void main(String[] args) {
        Speed vanSpeed = new Speed(120.5);
        Van van = new Van("Toyota", 2022, vanSpeed);

        System.out.println("Details of the van:");
        van.display();
    }
}