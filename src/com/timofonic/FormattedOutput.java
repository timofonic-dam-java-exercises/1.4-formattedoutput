/* 1.4 - Formatted Output
* * It formats the output showed at the screen.
* @author Timofonic
*/



public class FormattedOutput {
    public static void main(String[] args) {
        System.out.printf("The number %d doesn't have decimals.\n", 21);
        System.out.printf("The number %f has decimals.\n", 21.0);
        System.out.printf("The number %.3f has exactly 3 decimals.\n", 21.0);
    }
}