public class Main {
    public static void main(String[] args) {

        //Skapa variablar för pris

        double bensinPris= 16.53;
        double besinforbrukning= 8;
        double kmTillVarberg= 76;
        double prisVarberg= 6990;
        double prisGoteborg= 7200;

        //Priset för tv om du åker till Valberg
        double prisVarbergMedBensin= prisVarberg+(kmTillVarberg/10 *bensinPris);

        // Skriv ut priset flr tvn i Varberg
        System.out.println("Priset för tvn i varberg är: " + prisVarbergMedBensin);

        //Skriv ut priset för tvn i GBG
        System.out.println("Priset för tvn i göteborg är: " + prisGoteborg);

        //Skriv ut skilnaden på priset
        System.out.println("Prisskillnaden blir: " + (prisGoteborg-prisVarbergMedBensin));


    }
}