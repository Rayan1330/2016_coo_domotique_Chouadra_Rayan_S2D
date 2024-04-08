import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;
    private List<Hifi> chainesHifi;

    public Telecommande() {
        this.lampes = new ArrayList<>();
        this.chainesHifi = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    public void ajouterChaineHifi(Hifi chaineHifi) {
        this.chainesHifi.add(chaineHifi);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).allumer();
        } else {
            System.out.println("Lampe inexistante");
        }
    }

    public void activerChaineHifi(int indiceChaineHifi) {
        if (indiceChaineHifi >= 0 && indiceChaineHifi < chainesHifi.size()) {
            chainesHifi.get(indiceChaineHifi).allumer();
        } else {
            System.out.println("Chaine Hi-fi inexistante");
        }
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).eteindre();
        } else {
            System.out.println("Lampe inexistante");
        }
    }

    public void desactiverChaineHifi(int indiceChaineHifi) {
        if (indiceChaineHifi >= 0 && indiceChaineHifi < chainesHifi.size()) {
            chainesHifi.get(indiceChaineHifi).eteindre();
        } else {
            System.out.println("Chaine Hi-fi inexistante");
        }
    }

    public void activerToutesLesLampes() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
    }

    public void activerToutesLesChainesHifi() {
        for (Hifi chaineHifi : chainesHifi) {
            chaineHifi.allumer();
        }
    }

    public String toString() {
        StringBuilder description = new StringBuilder("Telecommande :\n");
        description.append("Lampes : \n");
        for (Lampe lampe : lampes) {
            description.append(lampe.toString()).append("\n");
        }
        description.append("Chaines Hi-fi : \n");
        for (Hifi chaineHifi : chainesHifi) {
            description.append(chaineHifi.toString()).append("\n");
        }
        return description.toString();
    }
}