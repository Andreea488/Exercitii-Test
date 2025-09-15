package tema1;

public class Variabila {
    // metoda primește un int și întoarce valoarea incrementată
    static int increment(int n) {
        return n + 1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Înainte: " + n);
        n = increment(n);           // reasignăm rezultatul metodei
        System.out.println("După: " + n);
    }
}

