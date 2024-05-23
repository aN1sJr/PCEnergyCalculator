public class MONITEUR extends PERIPHERIQUES{
    int classe;
    int dimension;
    int resolutionMax;

    MONITEUR(String id, String model, int classe, int dimension, int resolutionMax){
        super(id, model);
        this.classe = classe;
        this.dimension = dimension;
        this.resolutionMax = resolutionMax;
    }

    public double calculerPuissance(){
        return classe * dimension * resolutionMax * 0.015;
    }


}
