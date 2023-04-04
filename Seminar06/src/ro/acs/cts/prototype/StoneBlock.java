package ro.acs.cts.prototype;

public class StoneBlock extends BuildingBlock{
    private byte[] texture;

    public StoneBlock() {
        System.out.println("Loading Texture...");
        texture = new byte[]{30, 50, 70};
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        StoneBlock copy= (StoneBlock) super.clone();
        if(texture!=null) {
            copy.texture = texture.clone();
        }
        else{
            copy.texture=null;
        }
        return copy;
    }

    @Override
    public void render() {
        System.out.println("Rendering the StoneBlock at " +
                getX() + " " + getY() + " " + getZ());
    }
}
