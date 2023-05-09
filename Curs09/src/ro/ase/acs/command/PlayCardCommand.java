package ro.ase.acs.command;

public class PlayCardCommand implements Command{
    private OnlinePlayer player;

    public PlayCardCommand(OnlinePlayer player) {
        this.player = player;
    }

    @Override
    public void doAction() {
        player.playCard();
    }
}
