package lab2;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {

        System.out.print("A human was born...\n\tName: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String gender;
        while (true) {
            System.out.print("\tG(f/m): ");
            gender = scanner.nextLine();
            if (gender.equals("f") || gender.equals("m"))
                break;
            System.out.println("Input one of the settings.");
        }
        System.out.print("\tAge: ");
        String age = scanner.nextLine();
        System.out.print("\tSkin color: ");
        String skinColor = scanner.nextLine();
        System.out.print("\tHair color: ");
        String hairColor = scanner.nextLine();
        String answer;
        while (true) {
            System.out.print("\tRight-handed?(yes/no): ");
            answer = scanner.nextLine();
            if (answer.equals("yes") || answer.equals("no"))
                break;
            System.out.println("Input 1 of the suggested options.");
        }
        boolean rightHanded = answer.equals("yes");
        System.out.println();


        Human humanMain = new Human(name, gender, skinColor, age, hairColor, rightHanded);
        humanMain.talk("Oh god, I missed my stop... Me, the one who is always late. My name is " + humanMain.getHumanName());
        humanMain.talk("Not again, how could I. How old even am I?! Already " + humanMain.getHumanAge() + " years old");
        humanMain.talk("I need to hop off the train... By the way, I look good today my skin color is " + humanMain.getSkinColor());
        humanMain.walk();
        System.out.println(humanMain.getHumanName() + " saw a coffee machine right in front");
        humanMain.take();
        humanMain.eat();
        humanMain.talk();
        Human humanAnother = new Human();
        humanAnother.talk("Hey, do we know each other? Oh, my name is " + humanAnother.getHumanName());
    }
}