public class CLAVIER extends PERIPHERIQUES{
    int NbTouche;
    double puissance;

    CLAVIER(String id, String model, int NbTouche, double puissance){
        super(id, model);
        this.NbTouche = NbTouche;
        this.puissance = puissance;
    }

    public double calculerPuissance(){
        return NbTouche * puissance;
    }
}
