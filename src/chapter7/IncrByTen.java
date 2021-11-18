package chapter7;

public class IncrByTen {
int a;

IncrByTen(int i){
    a=i;

}

IncrByTen inBy10(){
    IncrByTen temp =new IncrByTen(a+10);
    return temp;
}





}
