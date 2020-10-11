package es.urjc.mastermind;

public class Turn {

    private Player makerPlayer;
    private Player breakerPlayer;

    public Turn(Board board) {
        this.makerPlayer = new MakerPlayer(board);
        this.breakerPlayer = new BreakerPlayer(board);
    }

    public void play() {
        this.breakerPlayer.play();
        this.makerPlayer.play();
    }

}
