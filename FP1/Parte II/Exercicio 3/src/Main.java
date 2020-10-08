import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Point> a = new ArrayList<Point>();
        ArrayList<Object> b;
        b = a;
        b.add(new Point(10,20));
        // Erro de compilacao
        // ArrayList<Point> nao pode ser convertido para ArrayList<Object>
    }
}
