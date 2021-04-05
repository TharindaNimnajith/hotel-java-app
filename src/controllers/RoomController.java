package controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import util.Constants;

public class RoomController extends BaseController {
	public RoomController() {
		super();
	}

	@SuppressWarnings("resource")
	public void addCustomerToRoom() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter room no: ");
		int roomNo = 0;
		try {
			roomNo = input.nextInt();
		} catch (InputMismatchException inputMismatchException) {
			System.err.println(Constants.getExceptionMessage() + inputMismatchException);
			return;
		}
		if (UtilController.isInvalid(roomNo)) {
			System.err.println(Constants.getInvalidRoomNoMessage());
			return;
		}
		System.out.print("Enter customer name for room no " + roomNo + ": ");
		getRooms()[roomNo - 1] = input.next().trim();
	}

	public void viewEmptyRooms() {
		for (int i = 0; i < Constants.getRoomCount(); i++)
			if (getRooms()[i].equals(Constants.getEmptyString()))
				System.out.println("Room No: " + (i + 1));
	}

	public void viewAllRooms() {
		for (int i = 0; i < Constants.getRoomCount(); i++)
			System.out.println("Room No: " + (i + 1) + " - " + getRooms()[i]);
	}

	@SuppressWarnings("resource")
	public void deleteCustomerFromRoom() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter room no: ");
		int roomNo = 0;
		try {
			roomNo = input.nextInt();
		} catch (InputMismatchException inputMismatchException) {
			System.err.println(Constants.getExceptionMessage() + inputMismatchException);
			return;
		}
		if (UtilController.isInvalid(roomNo)) {
			System.err.println(Constants.getInvalidRoomNoMessage());
			return;
		}
		getRooms()[roomNo - 1] = Constants.getEmptyString();
	}

	@SuppressWarnings("resource")
	public void findRoomByCustomerName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter customer name: ");
		String customerName = input.next();
		for (int i = 0; i < Constants.getRoomCount(); i++)
			if (customerName.trim().equalsIgnoreCase(getRooms()[i])) {
				System.out.println(customerName + " is in room no: " + (i + 1));
				return;
			}
		System.out.println("A customer named " + customerName + " does not occupy a room.");
	}

	public void viewRoomsSortedByCustomerName() {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < Constants.getRoomCount(); i++)
			if (!getRooms()[i].equals(Constants.getEmptyString()))
				list.add(getRooms()[i]);
		list.sort(null);
		for (String item : list)
			System.out.println(item);
	}

	@Override
	public String toString() {
		return "RoomController [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
