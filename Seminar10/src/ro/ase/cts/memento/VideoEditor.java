package ro.ase.cts.memento;

public class VideoEditor {
    private HistoryManager historyManager;
    private Video video;
    public VideoEditor() {
        historyManager = new HistoryManager();
        video = new Video();
        video.setName("video 1");
    }
    public void edit(int lenght){
        video.setLength(video.getLength()+lenght);

    }
    public void ctrlS(){
        historyManager.save(video);
    }
    public void ctrlZ(){
        video = historyManager.undo();
    }

    @Override
    public String toString() {
        return "length:" + video.getLength();
    }
}
