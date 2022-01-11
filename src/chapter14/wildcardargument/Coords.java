package chapter14.wildcardargument;

public class Coords<T extends TwoD> {
    T[] coords;

    public Coords(T[] o) {
        coords = o;
    }

    static void showXY(Coords<?> c){
        System.out.println("X,Y Coordinates");
        for (int i = 0; i <c.coords.length; i++) {
            System.out.println(c.coords[i].x+" "+c.coords[i].y);
        }
        System.out.println();
    }

static void showXYZ(Coords<? extends ThreeD> c){
    System.out.println("X,Y,Z Coordinates");
    for (int i = 0; i <c.coords.length ; i++) {
        System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z);

    }
    System.out.println();
}
    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X,Y,Z, T Coordinates");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);

        }
        System.out.println();


    }



}
