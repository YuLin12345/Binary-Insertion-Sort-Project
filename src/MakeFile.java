
/*	@author Yu Lin
 * 	CSCI 335
 * 	Binary Insertion Sort Project
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MakeFile {
	// Make the unsorted student file with the below students.
	public void makeFile() {
		int[] student = new int[10];

		Methods student0 = new Methods(754385, "Amenda", 24, 4.0);
		Methods student1 = new Methods(527583, "Betty", 26, 3.9);
		Methods student2 = new Methods(439485, "Chris", 23, 3.8);
		Methods student3 = new Methods(234256, "David", 24, 3.7);
		Methods student4 = new Methods(585674, "Ed", 25, 3.6);
		Methods student5 = new Methods(784358, "Fred", 26, 3.5);
		Methods student6 = new Methods(123854, "Kevin", 27, 3.4);
		Methods student7 = new Methods(569964, "Harry", 28, 3.3);
		Methods student8 = new Methods(467897, "Ivan", 29, 3.2);
		Methods student9 = new Methods(154557, "James", 20, 3.1);

		student[0] = student0.getID();
		student[1] = student1.getID();
		student[2] = student2.getID();
		student[3] = student3.getID();
		student[4] = student4.getID();
		student[5] = student5.getID();
		student[6] = student6.getID();
		student[7] = student7.getID();
		student[8] = student8.getID();
		student[9] = student9.getID();

		try {
			FileWriter fw = new FileWriter("Unsorted.txt");
			PrintWriter pw = new PrintWriter(fw);

			for (int i = 0; i < student.length; i++) {
				if (student[i] == student0.getID()) {
					pw.println(student0);
				} else if (student[i] == student1.getID()) {
					pw.println(student1);
				} else if (student[i] == student2.getID()) {
					pw.println(student2);
				} else if (student[i] == student3.getID()) {
					pw.println(student3);
				} else if (student[i] == student4.getID()) {
					pw.println(student4);
				} else if (student[i] == student5.getID()) {
					pw.println(student5);
				} else if (student[i] == student6.getID()) {
					pw.println(student6);
				} else if (student[i] == student7.getID()) {
					pw.println(student7);
				} else if (student[i] == student8.getID()) {
					pw.println(student8);
				} else if (student[i] == student9.getID()) {
					pw.println(student9);
				}
			}
			pw.close();

		} catch (IOException e) {
			System.out.println("Something went wrong.");
		}

		// Find Unsorted.txt and display the student records.
		System.out.println("Below are UNSORTED students by ID: \n");
		try {
			FileReader fr = new FileReader("Unsorted.txt");
			BufferedReader br = new BufferedReader(fr);

			String string;
			while ((string = br.readLine()) != null) {
				System.out.println(string);
			}

			System.out.print("\n \n");
			br.close();
		} catch (IOException e) {
			System.out.println("File does not exist.");
		}

		// Sort the student ID.
		Sorting sorting = new Sorting();
		sorting.binaryInsertion(student);

		// Save the sorted students into Sorted.txt
		try {
			FileWriter fw = new FileWriter("Sorted.txt");
			PrintWriter pw = new PrintWriter(fw);

			for (int i = 0; i < student.length; i++) {
				if (student[i] == student0.getID()) {
					pw.println(student0);
				} else if (student[i] == student1.getID()) {
					pw.println(student1);
				} else if (student[i] == student2.getID()) {
					pw.println(student2);
				} else if (student[i] == student3.getID()) {
					pw.println(student3);
				} else if (student[i] == student4.getID()) {
					pw.println(student4);
				} else if (student[i] == student5.getID()) {
					pw.println(student5);
				} else if (student[i] == student6.getID()) {
					pw.println(student6);
				} else if (student[i] == student7.getID()) {
					pw.println(student7);
				} else if (student[i] == student8.getID()) {
					pw.println(student8);
				} else if (student[i] == student9.getID()) {
					pw.println(student9);
				}
			}
			pw.close();

		} catch (IOException e) {
			System.out.println("Something went wrong.");
		}

		// Display Sorted.txt student records.
		System.out.println("Below are SORTED students by ID: \n");
		try {
			FileReader fr = new FileReader("Sorted.txt");
			BufferedReader br = new BufferedReader(fr);

			String string;
			while ((string = br.readLine()) != null) {
				System.out.println(string);
			}

			br.close();
		} catch (IOException e) {
			System.out.println("File does not exist.");
		}
	}
}