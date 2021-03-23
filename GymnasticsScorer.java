/* Gymnastics judging. A gymnast's score is determined by a panel of 6 judges
// who each decide a score between 0.0 and 10.0. The final score is determined
// by discarding the high and low scores, and averaging the remaining 4.
// Write a program GymnasticsScorer.java that takes 6 real command line inputs
// representing the 6 scores and prints their average,
// after throwing out the high and low scores. */

public class GymnasticsScorer {
    public static void main(String[] args) {
        double judge1 = (Math.random() * 10.0);
        double judge2 = (Math.random() * 10.0);
        double judge3 = (Math.random() * 10.0);
        double judge4 = (Math.random() * 10.0);
        double judge5 = (Math.random() * 10.0);
        double judge6 = (Math.random() * 10.0);

        double averageScore = (judge1 + judge2 + judge3 + judge4 + judge5 + judge6) / 6;
        System.out.println("Judge 1 score is: " + (float) Math.round(judge1));
        System.out.println("Judge 2 score is: " + (float) Math.round(judge2));
        System.out.println("Judge 3 score is: " + (float) Math.round(judge3));
        System.out.println("Judge 4 score is: " + (float) Math.round(judge4));
        System.out.println("Judge 5 score is: " + (float) Math.round(judge5));
        System.out.println("Judge 6 score is: " + (float) Math.round(judge6));
        System.out.println("Your average score is: " + (float) Math.round(averageScore));
    }
}
