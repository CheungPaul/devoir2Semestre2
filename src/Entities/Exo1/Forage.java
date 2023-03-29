package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;

    public Forage(int diametre, String nomCaptage, int idCaptage, int hauteur, int debitMaximum){
        super(idCaptage, nomCaptage, hauteur, debitMaximum);
        this.diametre = diametre;
    }

    public String GetDescription(){
        return (super.GetDescription() + "-" + "diamètre" + diametre);
    }

    public double GetVolume(){
       return(Math.PI * diametre * hauteur);
    }
}
