
    import org.w3c.dom.ls.LSOutput;

    import javax.xml.parsers.SAXParser;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Nombres = new int[5];

        System.out.println("Entrez 5 nmbrs:");
        for (int i = 0; i < 5; i++) {
            Nombres[i] = scanner.nextInt();
        }

        System.out.println("ordre inverse :");
        for (int i = 4; i >= 0; i--) {
            System.out.println(Nombres[i]);
        }

        scanner.close();
    }

}

