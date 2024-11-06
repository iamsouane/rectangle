package rectangle;

public class SurfPer {
    private double longueur, largeur;

    public SurfPer(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public  double getLongueur() {
        return longueur;
    }
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public  double getLargeur() {
        return largeur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double surface() {
        return longueur * largeur;
    }

    public double perimetre() {
        return  2 * (longueur + largeur);
    }
}
