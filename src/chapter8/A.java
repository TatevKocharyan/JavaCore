package chapter8;

import java.util.Objects;




public class A {
    int i;
    int j;


    void showij() {
        System.out.println("i and j:" + i + " " + j);
    }

    void setIJ(int x, int y) {
        i = x;
        j = y;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new A();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return i == a.i && j == a.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}
