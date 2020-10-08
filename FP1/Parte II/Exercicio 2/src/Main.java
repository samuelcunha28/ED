import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /**
        Point[] a = new Point[10];
        Object[] b;
        b = a;
        b[0] = new Point(10,20);
        // Sem qualquer erro de compilacao
         */

        /**
         Point[] a = new Point[10];
         Object[] b;
         b = a;
         b[0] = "Magical Mystery Tour";
         // ArrayStore Exception
         // Da excecao porque nao e do tipo Point
         */

        /**
        Point[] a = new Point[10];
        Object[] b;
        b = a;
        a[0] = "Magical Mystery Tour";
        // Incompatible types
        // string cannot be converted to Point
         */
    }
}
