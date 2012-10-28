package guessNumber;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        int count_a=0;
        int count_b=0;
        for(int i=0;i<userInput.length();i++){
            if(userInput.charAt(i)==randomNumber.charAt(i)) count_a++;
            else if(randomNumber.contains(String.valueOf(userInput.charAt(i)))) count_b++;
        }
        return String.format("%da%db",count_a,count_b);
    }
}
