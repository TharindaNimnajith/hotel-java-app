package util;

public class Constants {
	private static final int ROOM_COUNT = 8;
	private static final String OUTPUT_FILE_NAME = "output_file.txt";
	private static final String INPUT_FILE_NAME = "input_file.txt";
	private static final String EXCEPTION_MESSAGE = "Exception: ";
	private static final String EMPTY_STRING = "Empty";
	private static final String INVALID_INPUT_MESSAGE = "Invalid input.";
	private static final String INVALID_ROOM_NO_MESSAGE = "Invalid room number.";

	public Constants() {
		super();
	}

	public static int getRoomCount() {
		return ROOM_COUNT;
	}

	public static String getOutputFileName() {
		return OUTPUT_FILE_NAME;
	}

	public static String getInputFileName() {
		return INPUT_FILE_NAME;
	}

	public static String getExceptionMessage() {
		return EXCEPTION_MESSAGE;
	}

	public static String getEmptyString() {
		return EMPTY_STRING;
	}

	public static String getInvalidInputMessage() {
		return INVALID_INPUT_MESSAGE;
	}

	public static String getInvalidRoomNoMessage() {
		return INVALID_ROOM_NO_MESSAGE;
	}

	@Override
	public String toString() {
		return "Constants [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
