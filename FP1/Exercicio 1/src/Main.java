public class Main {

    public static void main(String[] args) {
        TwoTypePair<String,String > obj1 = new TwoTypePair("Ola", "Saudacoes");
        TwoTypePair<String,String> obj2 = new TwoTypePair("Ola", "Saudacoes");
        System.out.println(obj1.equals(obj2));
    }
}
