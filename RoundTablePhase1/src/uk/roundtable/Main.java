package uk.roundtable;

public class Main {

    public static String[] chevaliers = new String[] {"Erec"};

    public static void main(String[] args) {
        System.out.println("Bonjour à tous.");
        System.out.println("Je suis Merlin et en l'absence d'Arthur, j'ai pour mission d'animer cette Table Ronde.");

        if (chevaliers.length > 0) {
            System.out.println("Sont présents aujourd'hui :");
            for (String chevalier : chevaliers) {
                System.out.println("- " + chevalier);
            }
            System.out.println("Merci de vous être déplacés.");
        } else {
            System.out.println("Bon par contre comme personne n'est encore arrivé, je parle dans le vide là...");
        }
    }
}
