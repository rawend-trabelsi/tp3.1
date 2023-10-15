package tp31;

public class Main {

    public static void main(String[] args) {
        Vehicule v = new Vehicule("Clio", "Classique", 2000, 20000.00);
        Vehicule w = new Vehicule("Mercedes", "Fantôme", 2008, 60000.0);
        Vehicule x = new Vehicule("KIA", "Picanto", 2012, 35000.0);

        AgenceMobiliere agence = new AgenceMobiliere(3); 
        agence.ajouterVehicule(v);
        agence.ajouterVehicule(w);
        agence.ajouterVehicule(x);
        
        agence.selection("Mercedes"); 
        agence.selection(3500000000.0); 
        agence.afficherVoiturePlusAncienne();

    }
}
