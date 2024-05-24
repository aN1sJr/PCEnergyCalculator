public abstract class PERIPHERIQUES extends PC{
    String id;
    String model;

    PERIPHERIQUES(String id, String model){
        this.id = id;
        this.model = model;
    }

    public abstract double calculerPuissance();
}
