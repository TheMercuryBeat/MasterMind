package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.views.MessageView;

class ResultView {

    private final Result result;

    ResultView(Result result) {
        this.result = result;
    }

    void writeln() {
        MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
    }

}
