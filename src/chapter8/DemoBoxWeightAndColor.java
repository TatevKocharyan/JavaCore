package chapter8;

public class DemoBoxWeightAndColor {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 20, 3);
        BoxWeight mybox2 = new BoxWeight(10, 47, 2, 32);
        ColorBox mybox3 = new ColorBox(10, 20, 30, 4);
        BoxWeight mybox33 = new BoxWeight();
        BoxWeight mybox4 = new BoxWeight(3, 6);
        BoxWeight mybox5 = new BoxWeight(mybox4);
        Shipment shipment = new Shipment(4,5,5,4,6);

        double vol;
        vol = mybox1.volum();
        System.out.println("volume of my box1;" + vol);
        System.out.println(mybox1.weight);
        System.out.println();
        vol = mybox2.volum();
        System.out.println(vol);
        System.out.println(mybox2.weight);
        vol = mybox3.volum();
        System.out.println(vol);
        System.out.println(mybox3.color);


        vol = mybox1.volum();
        System.out.println("mybox1 vol" + vol);
        System.out.println("mybox1 weight" + mybox1.weight);

        vol = mybox2.volum();
        System.out.println("mybox2 vol" + vol);
        System.out.println("mybox2 weight" + mybox2.weight);

        vol = mybox33.volum();
        System.out.println("mybox33 vol" + vol);
        vol = mybox4.volum();
        System.out.println("mybox4vol:" + vol);
        System.out.println("mybox4 weight:" + mybox4.weight);

        vol = mybox5.volum();
        System.out.println(vol);
        System.out.println(mybox5.weight);

        vol=shipment.volum();
        System.out.println(vol);
        System.out.println(shipment.weight);
        System.out.println(shipment.cost);
    }
}
