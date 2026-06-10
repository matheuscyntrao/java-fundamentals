public class Casts {

    static void main() {

        // Integer automaticaly is converted to float by Java in some operations, but when we need consider float as an integer?
        double x = 9.997;
        int nx = (int) x;
        int y = 300;

        System.out.println(nx);
        System.out.println(Math.round(x));
        System.out.println((byte) y);

    }

}
