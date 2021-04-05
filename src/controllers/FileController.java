package controllers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import util.Constants;

public class FileController extends BaseController {
	public FileController() {
		super();
	}

	public void storeProgramDataIntoFile() {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter(Constants.getOutputFileName()))) {
			for (int i = 0; i < Constants.getRoomCount(); i++)
				printWriter.println("Room No: " + (i + 1) + " - Name: " + getRooms()[i]);
		} catch (IOException ioException) {
			System.err.println(Constants.getExceptionMessage() + ioException);
			return;
		}
	}

	public void loadProgramDataFromFile() {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(Constants.getInputFileName());
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println(Constants.getExceptionMessage() + fileNotFoundException);
			return;
		}
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		for (int i = 0; i < Constants.getRoomCount(); i++)
			try {
				getRooms()[i] = bufferedReader.readLine();
			} catch (IOException ioException) {
				System.err.println(Constants.getExceptionMessage() + ioException);
				return;
			}
	}

	@Override
	public String toString() {
		return "FileController [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
