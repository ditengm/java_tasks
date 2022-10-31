package lab2;

public class Human {
    private final String skinColor;
    private final String humanName;
    private final String gender;
    private final String age;
    private final Head head;
    private final Leg leftLeg, rightLeg;
    private final Hand leftHand, rightHand;
    private final Hand leadingHand;
    public Human(String _humanName, String _gender,
                 String _skinColor, String _age, String _hairColor, boolean rightHanded) {
        head = new Head();
        leftLeg = new Leg("left");
        rightLeg = new Leg("right");
        leftHand = new Hand("left");
        rightHand = new Hand("right");

        this.humanName = _humanName;
        this.age = _age;
        this.gender = _gender;
        this.skinColor = _skinColor;
        head.setHairColor(_hairColor);

        if (rightHanded)
            leadingHand = rightHand;
        else
            leadingHand = leftHand;
        if (gender.equals("m"))
            System.out.println("-----He has just opened his eyes after almost falling asleep while standing right in the train-----");
        else
            System.out.println("-----She has just opened her eyes after almost falling asleep while standing right in the train-----");
    }
    public Human() {
        head = new Head();
        leftLeg = new Leg("left");
        rightLeg = new Leg("right");
        leftHand = new Hand("left");
        rightHand = new Hand("right");

        this.humanName = "Rose";
        this.age = "45";
        this.gender = "Female";
        this.skinColor = "white";
        head.setHairColor("blue");
        leadingHand = rightHand;
        System.out.println("-----A strange women looking really worried approached-----");
    }

    public String getSkinColor() {
        return skinColor;
    }
    public String getHumanName() {
        return humanName;
    }
    public String getHumanAge() {
        return age;
    }

    public void walk() {
        leftLeg.raiseLeg();
        leftLeg.moveForward();
        leftLeg.lowerLeg();
        rightLeg.raiseLeg();
        rightLeg.moveForward();
        rightLeg.lowerLeg();
    }
    public void talk() {
        if (!head.isMouthIsOpen())
            head.openMouth();
        System.out.println(this.getHumanName() + " said: How could I even end up in this situation?");
        head.closeMouth();
    }
    public void talk(String phrase) {
        if (!head.isMouthIsOpen())
            head.openMouth();
        System.out.println(this.getHumanName() + " said: " + phrase);
        head.closeMouth();
    }
    public void take() {
        leadingHand.moveForward();
        leadingHand.clenchHand();
        leadingHand.moveBack();
        System.out.println(this.getHumanName() + " took a cup of coffee from the machine");
    }
    public void eat() {
        if (!rightHand.isClenched() && !leftHand.isClenched())
            System.out.println("Take something before drinking");
        else {
            leadingHand.raiseHand();
            head.openMouth();
            head.drink();
            head.closeMouth();
            leadingHand.lowerHand();
            System.out.println(this.getHumanName() + " drank that hot liquid, hoping to finally wake up");
        }
    }
}