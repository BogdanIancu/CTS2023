package ro.ase.cts.main;

import ro.ase.cts.memento.VideoEditor;
import ro.ase.cts.observer.YoutubeChannel;
import ro.ase.cts.observer.YoutubeSubscriber;
import ro.ase.cts.state.VendingMachine;
import ro.ase.cts.state.VendingMachineState;
import ro.ase.cts.template.PartMover;
import ro.ase.cts.template.RoboticArm;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.inputMoney(15);
        vendingMachine.selectProduct(10);

        YoutubeChannel youtubeChannel = new YoutubeChannel("TestACS");
        YoutubeSubscriber youtubeSubscriber1 = new YoutubeSubscriber();
        YoutubeSubscriber youtubeSubscriber2 = new YoutubeSubscriber();
        youtubeChannel.subscribe(youtubeSubscriber1);
        youtubeChannel.subscribe(youtubeSubscriber2);
        youtubeChannel.publishVideo();
        youtubeChannel.unsubscribe(youtubeSubscriber1);
        youtubeChannel.publishVideo();

        VideoEditor videoEditor = new VideoEditor();
        videoEditor.edit(5);
        videoEditor.ctrlS();
        videoEditor.edit(7);
        videoEditor.ctrlS();
        videoEditor.edit(2);
        System.out.println(videoEditor);
        videoEditor.ctrlZ();
        System.out.println(videoEditor);

        PartMover partMover = new RoboticArm();
        partMover.movePart();
    }
}