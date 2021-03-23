// Web exercises 1
// Write a program RollDie.java that generates the result
// of rolling a fair six-sided die (an integer between 1 and 6)

public class RollDie {
    public static void main(String[] args) {
        int DieSides = 6;

        int randomSide = (int) (Math.random() * DieSides) + 1;
        System.out.println(randomSide);
    }
}
