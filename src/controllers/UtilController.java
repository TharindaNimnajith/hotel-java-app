package controllers;

import util.Constants;

public class UtilController extends BaseController {
	public UtilController() {
		super();
	}

	public static boolean isInvalid(int roomNo) {
		return roomNo > Constants.getRoomCount() || roomNo < 1;
	}

	@Override
	public String toString() {
		return "UtilController [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
