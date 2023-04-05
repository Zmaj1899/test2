    public class Racun {
    private static int naslednjiId = 1;
    private int id;
    private double stanje;
    private boolean blokiran;

        public Racun() {
        this.id = naslednjiId++;
        this.stanje = 0;
        this.blokiran = false;
    }

     public Racun(double zacetniZnesek) {
        this.id = naslednjiId++;
        this.stanje = zacetniZnesek;
    }

    public void dodaj(double znesek) {
        if (!this.blokiran) {
            this.stanje += znesek;
        } else {
            System.out.println("Racun " + this.id + " je blokiran.");
        }
    }
    
    public void odvzemi(double znesek) {
     if (!this.blokiran) {
          if (this.stanje >= znesek) {
                this.stanje -= znesek;
            } else {
                System.out.println("Na racunu " + this.id + " ni dovolj sredstev.");
            }
        } else {
            System.out.println("Racun " + this.id + " je blokiran.");
        }
    }
    
        public void setBlokiran(boolean blokiran) {
        this.blokiran = blokiran;
    }
    
         public boolean getBlokiran() {
        return this.blokiran;
    }
    
         public int getId() {
        return this.id;
    }
    
         public double getStanje() {
        return this.stanje;
    }
    }
