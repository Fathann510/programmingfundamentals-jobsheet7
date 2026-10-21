import java.util.Scanner;

public class SiakadFor12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score, highest = 0, lowest = 100;

        for(int i = 1; i <= 10; i++){
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();
            if(score > highest){
                highest = score;
            }
            if(score < lowest){
                lowest = score;
            }
            if(score < 0 || score > 100){
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
                i--;
            }
            if(score >=60){
                System.out.println("Student " + i + " passed.");
            } else {
                System.out.println("Student " + i + " failed.");
            }
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        
        sc.close();
    }
}