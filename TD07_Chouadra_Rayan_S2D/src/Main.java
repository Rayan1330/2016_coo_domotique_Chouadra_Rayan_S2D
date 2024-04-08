import java.util.Scanner;

/**
 * Classe qui crée des lampes, des chaînes hi-fi et une télécommande associée.
 */
public class Main {

    public static void main(String args[]) {
        // Création de la télécommande vide
        Telecommande t = new Telecommande();

        // Ajout de lampes à la télécommande
        ajouter4Lampes(t);

        // Ajout de chaînes hi-fi à la télécommande
        ajouter2ChainesHifi(t);

        // Test d'activation des lampes
        t.activerLampe(1);
        t.activerLampe(3);

        // Test d'activation des chaînes hi-fi
        t.activerChaineHifi(0);

        // Affichage de l'état de la télécommande
        System.out.println(t);

        // Gestion du menu pour interagir avec la télécommande
        lancerMenu(t);
    }

    /**
     * Méthode qui lance un menu pour manipuler une télécommande.
     * 
     * @param t télécommande à manipuler
     */
    private static void lancerMenu(Telecommande t) {
        System.out.println(t);
        Scanner sc = new Scanner(System.in);

        boolean fini = false;

        // Tant qu'il y a des commandes
        while (!fini) {

            // Demande de la lampe et de la commande
            System.out.println("Entrer le numéro de la lampe ou de la chaîne hi-fi");
            int choix = sc.nextInt();
            System.out.println("Entrer la commande (+/-/exit)");
            String com = sc.nextLine();
            com = sc.nextLine();

            // Si la commande est "+", on active
            if (com.equals("+")) {
                System.out.println("== Activer " + choix + "==");
                if (choix <= t.getNombreLampes()) {
                    t.activerLampe(choix);
                } else if (choix <= t.getNombreLampes() + t.getNombreChainesHifi()) {
                    t.activerChaineHifi(choix - t.getNombreLampes() - 1);
                } else {
                    System.out.println("Numéro invalide");
                }
            }
            // Si la commande est "-", on désactive
            else if (com.equals("-")) {
                System.out.println("== Désactiver " + choix + "==");
                if (choix <= t.getNombreLampes()) {
                    t.desactiverLampe(choix);
                } else if (choix <= t.getNombreLampes() + t.getNombreChainesHifi()) {
                    t.desactiverChaineHifi(choix - t.getNombreLampes() - 1);
                } else {
                    System.out.println("Numéro invalide");
                }
            }
            // Si la commande est "exit", on arrête
            else if (com.equals("exit")) {
                System.out.println("== Fin du programme == ");
                fini = true;
            }
            // Commande non reconnue
            else {
                System.out.println("Commande inconnue");
            }

            // Affichage de l'état de la télécommande
            System.out.println(t);
        }
        sc.close();
    }

    /**
     * Méthode qui crée des lampes et les ajoute dans la télécommande.
     * 
     * @param t télécommande dans laquelle on ajoute les lampes
     */
    private static void ajouter4Lampes(Telecommande t) {
        Lampe l1 = new Lampe("Lampe1");
        t.ajouterLampe(l1);

        Lampe l2 = new Lampe("Lampe2");
        t.ajouterLampe(l2);

        Lampe l3 = new Lampe("Lampe3");
        t.ajouterLampe(l3);

        Lampe l4 = new Lampe("Lampe4");
        t.ajouterLampe(l4);
    }

    /**
     * Méthode qui crée des chaînes hi-fi et les ajoute dans la télécommande.
     * 
     * @param t télécommande dans laquelle on ajoute les chaînes hi-fi
     */
    private static void ajouter2ChainesHifi(Telecommande t) {
        Hifi h1 = new Hifi();
        t.ajouterChaineHifi(h1);

        Hifi h2 = new Hifi();
        t.ajouterChaineHifi(h2);
    }
}
