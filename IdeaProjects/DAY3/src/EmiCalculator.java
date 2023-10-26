public class EmiCalculator {
    public int calculateEmi(int principle, int roi, int tenture) {

        int calculatedEmi = principle * roi / tenture * 12;
        return calculatedEmi;
    }
}