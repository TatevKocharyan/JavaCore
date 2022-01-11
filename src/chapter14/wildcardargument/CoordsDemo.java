package chapter14.wildcardargument;

public class CoordsDemo {
    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)


        };

        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("Contents of tdlocs");
        Coords.showXY(tdlocs);

        FourD fd[] = {
                new FourD(4, 5, 6, 7),
                new FourD(5, 6, 845, 6),
                new FourD(45, 25, 66, 87),
                new FourD(654, 878, 65, 56)


        };


       Coords<FourD> fdlocs=new Coords<>(fd);
        System.out.println("Contents of fdlocs");
       Coords.showXY(fdlocs);
       Coords.showXYZ(fdlocs);
       Coords.showAll(fdlocs);





    }
}
