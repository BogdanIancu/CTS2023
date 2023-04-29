package ro.ase.acs.cts.flyweight;

public class CustomTextCharacter implements TextCharacter {
    private char character;
    private byte[] image;

    public CustomTextCharacter(char character, byte[] image) {
        this.character = character;
        this.image = image;
    }

    @Override
    public void display(Position position) {
        System.out.println(character + " -> " +
                position.getLine() + ":" +
                position.getColumn());
    }
}
