package tp31;

public class Vehicule {
    private int number;
    private String marque;
    private String modele;
    private int annee;
    private double prix;
    private static int count;

    public Vehicule(String marque, String modele, int annee, double prix) {
        count++;
        number = count;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
    }

    public void decrisVéhicule() {
        System.out.println("marque: " + marque + " modele: " + modele + " annee création: " + annee + " prix: " + prix);
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public static int getCount() {
        return count;
    }

    public int getAnnee() {
        return annee;
    }
}
