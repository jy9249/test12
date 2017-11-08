package java09_메서드문자열;


public class java08_02문자단위표시 {
    public static void main(String[] args)
    {
        String fo3 = String.format("H_%d", 2); System.out.println(fo3);
        String fo4 = String.format("%04d", 30); System.out.println(fo4);
        String fo5 = String.format("%,d", 10000000); System.out.println(fo5);
        String fo6 = String.format("%.2f", 444442.4444); System.out.println(fo6);
        String fo7 = String.format("%,.2f", 4444444444.444444444); System.out.println(fo7);
        
    }
}
