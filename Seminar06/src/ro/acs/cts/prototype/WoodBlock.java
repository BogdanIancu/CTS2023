package ro.acs.cts.prototype;

public class WoodBlock extends BuildingBlock {
    private byte[] texture;

    public WoodBlock() {
        System.out.println("Loading Texture...");
        texture = new byte[]{10, 20, 30};
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       WoodBlock copy= (WoodBlock) super.clone();
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
        System.out.println("Rendering the WoodBlock at " +
                getX() + " " + getY() + " " + getZ());
    }

}
