package ReplitSamples;

public class Replit173Tester {

    public static void main(String[] args) {

        Tea[] tea= {new LemonTea("Lemon Tea"), new ChaiTea("Chai Tea")};

        for( Tea t:tea){

            t.addSuger();
        }
    }
}
