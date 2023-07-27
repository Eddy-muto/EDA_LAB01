package paquete;

import paquete2.persona;

public class hola {
    public static void main(String[] args) {
        System.out.println("hola mundo .java");
        persona p1= new persona("jose", 12);
        System.out.println(p1.toString());
        persona p2= new persona("maria", 12);
        System.out.println(p1.toString());
        persona p3= new persona("juan", 12);
        System.out.println(p1.toString());
    }
}
