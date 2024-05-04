public class ConsoException extends Exception{
    double conso;
    public ConsoException(String msg,double conso) {
            super(msg);
            this.conso = conso;
    }
}
