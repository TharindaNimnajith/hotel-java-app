package controllers;

import java.util.Scanner;

import util.Constants;

public class MainController extends BaseController {
	private static RoomController roomController = null;
	private static FileController utilController = null;

	public MainController() {
		super();
		roomController = new RoomController();
		utilController = new FileController();
	}

	public void execute() {
		createRoomRefs();
		initialise();
		while (isMenu())
			displayMenu();
	}

	private static void createRoomRefs() {
		setRooms(new String[Constants.getRoomCount()]);
		for (int i = 0; i < Constants.getRoomCount(); i++)
			getRooms()[i] = new String();
	}

	private static void initialise() {
		for (int i = 0; i < Constants.getRoomCount(); i++)
			getRooms()[i] = Constants.getEmptyString();
	}

	@SuppressWarnings("resource")
	private static void displayMenu() {
		System.out.println("Select an option.");
		System.out.println("A: Add a customer to a room.");
		System.out.println("E: Display empty rooms.");
		System.out.println("V: View all rooms.");
		System.out.println("D: Delete customer from room.");
		System.out.println("F: Find room by customer name.");
		System.out.println("S: Store program data into file.");
		System.out.println("L: Load program data from file.");
		System.out.println("O: View rooms sorted by customer name.");
		System.out.println("Q: Exit.");
		Scanner input = new Scanner(System.in);
		switch (input.next().toUpperCase()) {
		case "A":
			roomController.addCustomerToRoom();
			break;
		case "E":
			roomController.viewEmptyRooms();
			break;
		case "V":
			roomController.viewAllRooms();
			break;
		case "D":
			roomController.deleteCustomerFromRoom();
			break;
		case "F":
			roomController.findRoomByCustomerName();
			break;
		case "S":
			utilController.storeProgramDataIntoFile();
			break;
		case "L":
			utilController.loadProgramDataFromFile();
			break;
		case "O":
			roomController.viewRoomsSortedByCustomerName();
			break;
		case "Q":
			System.exit(0);
		default:
			System.out.println(Constants.getInvalidInputMessage());
		}
		System.out.println("Press 1 to display menu. Press any other key to exit.");
		if (!input.next().equals("1"))
			setMenu(false);
	}

	@Override
	public String toString() {
		return "MainController [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
