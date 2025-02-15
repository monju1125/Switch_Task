
public class Assignment3_Part2 {
    public static void main(String[] args) {
        studentResults();
    }
    public static void studentResults() {
        char letter_grade ='D';
        switch (letter_grade) {
            case 'A':
                System.out.println("Excellent !");
                break;
            case 'B':
                System.out.println("You got an Asian F!");
                break;
            case 'C':
                System.out.println("You passed Barely");
                break;
            case 'D':
                System.out.println("You should work harder");
                break;
            case 'F':
                System.out.println("You didn't pass this time. Work Hard and stay consistent");
                break;
            default:
                System.out.println("Invalid Grade Entered!");
        }
    }

}
