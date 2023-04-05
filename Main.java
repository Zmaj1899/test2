public class Main {
    public static void main(String[] args) {
    Banka banka = new Banka("Moja banka", "Naslov 123", "Slovenija");
    Stranka stranka1 = new Stranka("Janez Novak", "Naslov 1", "Slovenija", 30);
    Stranka stranka2 = new Stranka("Mojca Novak", "Naslov 2", "Slovenija", 25);
    Stranka stranka3 = new Stranka("Peter Kovač", "Naslov 3", "Slovenija", 40);

    Racun racun1a = new Racun(1000);
    Racun racun1b = new Racun();
    Racun racun2a = new Racun(500);
    Racun racun2b = new Racun();
    Racun racun3a = new Racun(2000);
    Racun racun3b = new Racun();

    stranka1.dodajRacun(racun1a);
    stranka1.dodajRacun(racun1b);
    stranka2.dodajRacun(racun2a);
    stranka2.dodajRacun(racun2b);
    stranka3.dodajRacun(racun3a);
    stranka3.dodajRacun(racun3b);

    banka.dodajStranko(stranka1);
    banka.dodajStranko(stranka2);
    banka.dodajStranko(stranka3);
    
    banka.izpisiStranke();
    
    racun1a.odvzemi(500);
    racun2a.dodaj(200);
    racun3a.odvzemi(1000);
    racun1b.dodaj(300);
    
 racun3b.setBlokiran(true);

 banka.izpisiStranke();
}
}