
public class Program {

    public static void main(String[] args) {
        // This is an empty main method where you can experiment
        // with your Fitbyte class

        Fitbyte fitbyte = new Fitbyte(30, 60);

        double percentage = 0.5;
        
        System.out.println(fitbyte.maxHr(30));

       while (percentage < 1.0) {
           double target = fitbyte.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            System.out.println("t");
            percentage += 0.1;
        }

    }
}
