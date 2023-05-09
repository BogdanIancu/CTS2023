package ro.ase.acs.chain;

public class Player extends AbstractPlayer {
    private String cardToBePlayed;

    public String getCardToBePlayed() {
        return cardToBePlayed;
    }

    public void setCardToBePlayed(String cardToBePlayed) {
        this.cardToBePlayed = cardToBePlayed;
    }

    @Override
    public void playRound(String currentCard) {
        boolean hasSameRank = currentCard.charAt(0) == cardToBePlayed.charAt(0);
        boolean hasSameSuit = currentCard.charAt(1) == cardToBePlayed.charAt(1);
        if(hasSameRank || hasSameSuit) {
            System.out.println(cardToBePlayed + " played by player");
        } else {
            if(nextPlayer != null) {
                nextPlayer.playRound(currentCard);
            }
        }
    }
}
