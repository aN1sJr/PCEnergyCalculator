public class PC {
    UC unite;
    PERIPHERIQUES [] p;

    PC(){
    }
    PC(UC unite, PERIPHERIQUES [] p){
        this.unite = unite;
        this.p = p;
    }
    PC(PC pc){
        this.unite = pc.unite;
        this.p = pc.p;
    }
    public double calConsoElec(int duree) throws ConsoException{
        String msg="";
        double tot = unite.puissance;
        for (PERIPHERIQUES x : p){
            tot += x.calculerPuissance();
        }
        if ((tot * duree)>1000.0){
            msg = "attention la consomation totale a été depasse 1000W elle est a : ";
            throw new ConsoException(msg,(tot * duree));
        }

        return tot * duree;
    }

}
