public class Main {

    public static void main(String[] args) {
        TwoTypePair<String,String > obj1 = new TwoTypePair("Ola", "Terra");
        TwoTypePair<String,String> obj2 = new TwoTypePair("Ola", "Marte");
        System.out.println(obj1.equals(obj2));
    }
}
