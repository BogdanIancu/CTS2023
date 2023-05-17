package ro.ase.cts.observer;

public class YoutubeChannel extends Observable{
    private String name;

    public YoutubeChannel(String name) {
        this.name = name;
    }

    public void publishVideo(){
        super.sendNotification("New video uploaded by " + name);
    }

}
