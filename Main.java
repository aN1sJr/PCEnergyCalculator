public class Main {
    public static void main(String[] args) {

            UC myuc = new UC("i7",16,500);
            CLAVIER c1 = new CLAVIER("AK", "47",102,5);
            MONITEUR m1 = new MONITEUR("BERYL","M7",2,18,1700);

            PERIPHERIQUES [] Pr ={c1,m1};
        try {
            PC pc0 = new PC(myuc,Pr);
            System.out.println("la puissance de ce est : "+ pc0.calConsoElec(5));
        }catch (ConsoException e) {
            System.out.println(e.getMessage()+"elle est a : "+e.conso);
        }

    }
}