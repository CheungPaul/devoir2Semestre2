package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    private int idCaptage;
    private String nomCaptage;
    protected int hauteur;
    protected int debitMaximum;

    public Captage(int idCaptage, String nomCaptage, int hauteur, int debitMaximum) {
        this.idCaptage = idCaptage;
        this.nomCaptage = nomCaptage;
        this.hauteur = hauteur;
        this.debitMaximum = debitMaximum;
    }



    public int getIdCaptage() {
        return idCaptage;
    }

    public String GetDescription(){
        return (nomCaptage + "-" + hauteur + "mètres" + "-" + debitMaximum + "litres");
    }

    @Override
    public int compareTo(Captage o) {
        return Double.compare(o.debitMaximum, this.debitMaximum);
    }
}
