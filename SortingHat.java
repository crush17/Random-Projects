//Caleb Rush


import java.util.Scanner;

public class SortingHat {

    private static boolean checkAnswer(String input) {
        //sets up answer validation
        if(input.compareToIgnoreCase("yes") == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[]args) {

        //taking user inputs
        Scanner sc = new Scanner(System.in);  

        String newLine = System.getProperty("line.separator"); //line break
        System.out.println("Please answer using"
            + " \"yes\"" +  " or " + "\"no\"" +  newLine + ""); //specifies how to answer

        // user answers questions
        System.out.println("Do you consider yourself brave?");
        String brave = sc.nextLine();
        boolean isBrave = checkAnswer(brave);

        System.out.println("Are you the class clown?");
        String Funny = sc.nextLine();
        boolean isFunny = checkAnswer(Funny);

        System.out.println("Would you put friends and family before yourself?");
        String close = sc.nextLine();
        boolean areCloseAbove = checkAnswer(close);

        System.out.println("Do you have a competitive spirit?");
        String competitive = sc.nextLine();
        boolean isCompetitive = checkAnswer(competitive);

        System.out.println("Are you a good learner?");
        String goodLearnerInput = sc.nextLine();
        boolean isGoodLearner = checkAnswer(goodLearnerInput);

        System.out.println("Are you a leader?");
        String leaderInput = sc.nextLine();
        boolean isLeader = checkAnswer(leaderInput);

        System.out.println("Are you a loser?");
        String loser = sc.nextLine();
        boolean isLoser = checkAnswer(loser);

        // Allocating house to user
        System.out.print("Congratulations you are a ");
        if((isBrave && areCloseAbove) || isLeader) {
            System.out.print("Gryffindor");
        } else if(!isFunny && isCompetitive) {
            System.out.print("Slytherin");
        } else if(isGoodLearner || isCompetitive && isBrave && !isGoodLearner) {
            System.out.print("Ravenclaw");
        } else if(isFunny && !isBrave && !isLeader) {
            System.out.print("Hufflepuff");
        } else if(isLoser) {
            System.out.print("Muggle");
        } 

        System.out.println("!");
    }
}
