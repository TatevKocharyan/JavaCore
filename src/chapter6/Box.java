package chapter6;

public class Box {

    double width;
    double height;
    double depth;


    Box(double width,double height,double depth ) {

        System.out.println("Constructing Box");
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    double volume() {
        return width * height * depth;
    }


}
