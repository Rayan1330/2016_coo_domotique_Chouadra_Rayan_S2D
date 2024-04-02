import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TelecommandeTest {

    private Telecommande telecommande;
    private Lampe lampe1;
    private Lampe lampe2;
    private Hifi hifi1;

    @Before
    public void setUp() {
        telecommande = new Telecommande();
        lampe1 = new Lampe("Lampe 1");
        lampe2 = new Lampe("Lampe 2");
        hifi1 = new Hifi();
    }

    @Test
    public void testAjouterLampe() {
        telecommande.ajouterLampe(lampe1);
        List<Lampe> lampes = telecommande.getLampes();
        assertEquals(1, lampes.size());
        assertEquals(lampe1, lampes.get(0));
    }

    @Test
    public void testAjouterChaineHifi() {
        telecommande.ajouterChaineHifi(hifi1);
        List<Hifi> chainesHifi = telecommande.getChainesHifi();
        assertEquals(1, chainesHifi.size());
        assertEquals(hifi1, chainesHifi.get(0));
    }

    @Test
    public void testActiverLampeExistante() {
        telecommande.ajouterLampe(lampe1);
        telecommande.activerLampe(0);
        assertTrue(lampe1.estAllumee());
    }

    @Test
    public void testActiverLampeInexistante() {
        telecommande.activerLampe(0);
        // La lampe n'a pas été ajoutée, donc aucune action ne doit être effectuée
        assertFalse(lampe1.estAllumee());
    }

    @Test
    public void testActiverChaineHifiExistante() {
        telecommande.ajouterChaineHifi(hifi1);
        telecommande.activerChaineHifi(0);
        assertTrue(hifi1.estAllumee());
    }

    @Test
    public void testActiverChaineHifiInexistante() {
        telecommande.activerChaineHifi(0);
        // La chaine Hi-fi n'a pas été ajoutée, donc aucune action ne doit être effectuée
        assertFalse(hifi1.estAllumee());
    }
}