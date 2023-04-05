import java.util.ArrayList;

        public class Banka {
         private String naziv;
        private String naslov;
         private String drzava;
         private ArrayList<Stranka> stranke;

    public Banka(String naziv, String naslov, String drzava) {
    this.naziv = naziv;
    this.naslov = naslov;
   this.drzava = drzava;
    this.stranke = new ArrayList<Stranka>();
    }

     public Banka(String naziv, String naslov, String drzava, ArrayList<Stranka> stranke) {
         this.naziv = naziv;
         this.naslov = naslov;
         this.drzava = drzava;
        this.stranke = stranke;
    }

     public void dodajStranko(Stranka stranka) {
        this.stranke.add(stranka);
    }

        public int steviloStrank() {
        return this.stranke.size();
    }
 public void izpisiStranke() {
        System.out.println("Seznam strank banke " + this.naziv + ", naslov: " + this.naslov + ", drzava: " + this.drzava + ":");
        for (Stranka stranka : this.stranke) {
            System.out.println(stranka.getImePriimek());
            ArrayList<Racun> racuni = stranka.getRacuni();
            for (Racun racun : racuni) {
             System.out.println("Racun " + racun.getId() + ", stanje: " + racun.getStanje());
            }
        }
    }
}
