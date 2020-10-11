package es.urjc.mastermind;

import es.urjc.utils.Console;

enum Error {

	WRONG_LENGTH("Combination length wrong"),
	WRONG_COLORS("Colors are wrong"),
	DUPLICATE_COLORS("Colors are duplicated"),
	NULL_ERROR;

	private String message;

	Error() {
	}

	Error(String message) {
		this.message = message;
	}

	void writeln() {
		if (this != Error.NULL_ERROR) {
			Console.instance().writeln(this.message);
		}
	}

	public boolean isNull() {
		return this == Error.NULL_ERROR;
	}


}
