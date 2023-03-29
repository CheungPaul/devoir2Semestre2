package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private int largeur;
    private int longueur;
    public Cuve(int idCaptage, String nomCaptage, int hauteur, int debitMaximum, int uneLargeur, int uneLongueur){
        super(idCaptage, nomCaptage, hauteur, debitMaximum);
        this.largeur = uneLargeur;
        this.longueur = uneLongueur;
    }

    public String GetDescription(){
        return (super.GetDescription() + "-" + "longueur" + longueur + "-" + "largeur" + largeur);
    }

    public double GetVolume(){
        return(longueur*largeur);
    }
}
