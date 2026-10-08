public abstract class Zvire {

    private int rokNarozeni;
    private String jmeno;

    public Zvire(int rokNarozeni, String jmeno) {
        this.rokNarozeni = rokNarozeni;
        this.jmeno = jmeno;
    }

    public void vypisJmenoADatum() {
        System.out.println("Jmeno: " + jmeno + ", rok narozeni: " + rokNarozeni);
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public abstract void vydejZvuk();
}
