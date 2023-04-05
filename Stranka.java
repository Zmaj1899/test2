import java.util.ArrayList;

public class Stranka {
    private String imePriimek;
    private String naslov;
    private String drzava;
    private int starost;
    private ArrayList<Racun> racuni;

    public Stranka(String imePriimek, String naslov, String drzava, int starost) {
        this.imePriimek = imePriimek;
        this.naslov = naslov;
        this.drzava = drzava;
        this.starost = starost;
        this.racuni = new ArrayList<Racun>();
    }

    public Stranka(String imePriimek, String naslov, String drzava, int starost, ArrayList<Racun> racuni) {
        this.imePriimek = imePriimek;
        this.naslov = naslov;
        this.drzava = drzava;
        this.starost = starost;
        this.racuni = racuni;
    }

    public void dodajRacun(Racun racun) {
        this.racuni.add(racun);
    }

    public String getImePriimek() {
        return this.imePriimek;
    }

    public String getNaslov() {
        return this.naslov;
    }

    public String getDrzava() {
        return this.drzava;
    }

    public int getStarost() {
        return this.starost;
    }

    public int steviloRacunov() {
        return this.racuni.size();
    }

    public ArrayList<Racun> getRacuni() {
        return this.racuni;
    }
}
