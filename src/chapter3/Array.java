package chapter3;

public class Array {
    public static void main(String[] args) {
     int [] daysofmonths; daysofmonths= new int[12];
        daysofmonths[0]=31;
        daysofmonths[1]=28;
        daysofmonths[2]=31;
        daysofmonths[3]=30;
        daysofmonths[4]=31;
        daysofmonths[5]=30;
        daysofmonths[6]=31;
        daysofmonths[7]=30;
        daysofmonths[8]=31;
        daysofmonths[9]=30;
        daysofmonths[10]=31;
        daysofmonths[11]=30;
        String a= "april";

        System.out.println(a+ " has "+daysofmonths[4]+ " days ");
        /* int month_days[]={31,28,31,30,31,30,31,30,31,30,31,30};
        System.out.println("January has "+month_days[1]+" days");*/

        for (int i = 0; i <daysofmonths.length ; i++) {
            System.out.println((daysofmonths[i]) );

            }

        }
    }

