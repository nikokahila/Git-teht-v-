import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Harjoittelen Gitin käyttöä");
        System.out.println("Tein lucky7 tehtävän");

        Random random = new Random();
        
        // Arvotaan kolme numeroa välillä 1-10
        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;
        int numero3 = random.nextInt(10) + 1;
        
        
        System.out.println("Arvotut numerot ovat: " + numero1 + ", " + numero2 + ", " + numero3);
        
        
        if (numero1 == 7 || numero2 == 7 || numero3 == 7) {
            System.out.println("Voitit!");
        } else {
            System.out.println("Hävisit.");
        }
    }
}


    
