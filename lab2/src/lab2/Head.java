package lab2;

public class Head {
    private String hairColor;
    private boolean mouthIsOpen = false;

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public boolean isMouthIsOpen() {
        return mouthIsOpen;
    }

    public void openMouth() {
        if (!mouthIsOpen) {
            mouthIsOpen = true;
            System.out.println("\tHuman opened the mouth");
        }
        else
            System.out.println("\tMouth is already open");
    }
    public void closeMouth() {
        if (mouthIsOpen) {
            mouthIsOpen = false;
            System.out.println("\tHuman closed the mouth");
        }
        else
            System.out.println("\tMouth is already closed");
    }
    public void drink() {
        System.out.println("\tHuman drank the coffee");
    }
}