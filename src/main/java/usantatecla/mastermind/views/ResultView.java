package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Result;

public class ResultView {

    private final Result result;

    public ResultView(Result result) {
        this.result = result;
    }

    public void writeln() {
        MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
    }

}
