package javatest1;

class Vehicle1 {
    public static void kmToMiles(int km) {
         System.out.println("Intérieur de la classe parent/méthode static");
    }
}

class Car1 extends Vehicle1 {
    public static void kmToMiles(int km) {
         System.out.println("Intérieur de la classe enfant/méthode static");
    }
}

