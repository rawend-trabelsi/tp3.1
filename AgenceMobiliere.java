package tp31;

public class AgenceMobiliere {
    private int max;
    private int nb;
    private Vehicule tab[];

    AgenceMobiliere(int max) {
        this.tab = new Vehicule[max];
        this.max = max;
        this.nb = 0;
    }

    public void ajouterVehicule(Vehicule V) {
        if (nb < max) {
            tab[nb] = V;
            nb++;
        } else {
            System.out.println("Plein, impossible d'ajouter de véhicules.");
        }
    }

    public void selection(int n) {
        if (n >= 0 && n < nb && tab[n] != null) {
            tab[n].decrisVéhicule();
        } else {
            System.out.println("Case vide ou n'existe pas.");
        }
    }

    public void selection(String mq) {
        boolean trouve = false;
        for (int i = 0; i < nb; i++) {
            if (tab[i].getMarque()==mq) {
                tab[i].decrisVéhicule();
                trouve = true;
            }
        }
        if (trouve==false) {
            System.out.println("Il n'y a pas de véhicules de la marque " + mq + " dans l'agence.");
        }
    }

    public void selection(double px) {
        boolean trouve = false;
        for (int i = 0; i < nb; i++) {
            Vehicule vehicule = tab[i];
            if (vehicule.getPrix() < px) {
                vehicule.decrisVéhicule();
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Il n'y a pas de véhicules dans cette gamme de prix.");
        }
    }
    public void afficherVoiturePlusAncienne() {
        if (nb == 0) {
            System.out.println("Aucune voiture dans le parking.");
            return;
        }

        Vehicule voiturePlusAncienne = tab[0]; // Supposons que le premier véhicule est le plus ancien.

        for (int i = 1; i < nb; i++) {
            if (tab[i].getAnnee() < voiturePlusAncienne.getAnnee()) {
                voiturePlusAncienne = tab[i];
            }
        }

        System.out.println("La voiture la plus ancienne est :");
        voiturePlusAncienne.decrisVéhicule();
    }

}
