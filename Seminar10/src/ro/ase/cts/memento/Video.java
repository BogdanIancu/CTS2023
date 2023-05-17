package ro.ase.cts.memento;

public class Video implements Cloneable {
    private String name;
    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Video copy = (Video) super.clone();
        copy.name = this.name;
        copy.length = this.length;
        return copy;

    }
}
