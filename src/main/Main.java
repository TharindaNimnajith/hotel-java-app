package main;

import controllers.MainController;

public class Main {
	public Main() {
		super();
	}

	public static void main(String[] args) {
		MainController mainController = new MainController();
		mainController.execute();
	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
