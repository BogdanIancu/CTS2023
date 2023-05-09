package ro.ase.acs.command;

public class DrawCardCommand implements Command{
    private OnlinePlayer player;

    public DrawCardCommand(OnlinePlayer player) {
        this.player = player;
    }

    @Override
    public void doAction() {
        player.drawCard();
    }
}
