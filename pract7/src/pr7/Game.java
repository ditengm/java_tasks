package pr7;
import java.util.*;
import java.util.stream.Collectors;
public class Game {
    private Queue<Integer> first = new LinkedList<Integer>();
    private Queue<Integer> second = new LinkedList<Integer>();
    private Queue<Integer> firstTerm = new LinkedList<Integer>();
    private Queue<Integer> secondTerm = new LinkedList<Integer>();
    private int stepsDone = 0;
    private void fillOnStart() {
        System.out.print("What should initial set of cards be\n1)automatic or 2)by hand?: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1) {
            for (int i = 0; i < 10; i++) {
                if (this.first.size() == 5)
                    this.second.add(i);
                else if (this.second.size() == 5)
                    this.first.add(i);
                else
                    (Math.random() < 0.5 ? this.first : this.second).add(i);
            }
        } else {
            for (int i = 0; i < 5; i++){
                System.out.println("Input the value of card for first player: ");
                int numb = scanner.nextInt();
                this.first.add(numb);
            }
            for (int i = 0; i < 5; i++){
                System.out.println("Input the value of card for second player: ");
                int numb = scanner.nextInt();
                this.second.add(numb);
            }
        }
    }

    private void playStep() {
        ++this.stepsDone;

        int fromFirst = this.first.remove();
        int fromSecond = this.second.remove();

        if (fromFirst > fromSecond) {
            this.first.add(fromFirst);
            this.first.add(fromSecond);
        } else {
            this.second.add(fromSecond);
            this.second.add(fromFirst);
        }

        if (this.first.size() == 0)
            System.out.println("Second player won in " + this.stepsDone + " steps");
        else if (this.second.size() == 0)
            System.out.println("First player won in " + this.stepsDone + " steps");
        else if (this.stepsDone >= 106)
            System.out.println("Botva");
        else
            this.playStep();
    }

    public void display() {
        System.out.println("Here's current game position:");
        System.out.println("First player:");
        for (int i = 0; i < 5; i++){
            int firstCard = this.first.poll();
            this.firstTerm.add(firstCard);
            System.out.print(firstCard + " ");
        }
        for (int i = 0; i < 5; i++){
            int firstCard = this.firstTerm.poll();
            this.first.add(firstCard);
        }
        System.out.println("\nSecond player:");
        for (int i = 0; i < 5; i++){
            int secondCard = this.second.poll();
            this.secondTerm.add(secondCard);
            System.out.print(secondCard + " ");
        }
        for (int i = 0; i < 5; i++){
            int secondCard = this.secondTerm.poll();
            this.second.add(secondCard);
        }
        System.out.println("\n---------------------------");
    }

    Game() {
        this.fillOnStart();
        this.display();
        this.playStep();
    }
}

