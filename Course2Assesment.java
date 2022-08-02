package MyPackage;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Course2Assesment {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int Menu, option, suboption = 0, suboption1;
		String filename, filename1, filename2;
		createFileOutputStream();
		System.out.println("Appliation Name:- LockedMe.com" + "\nDeveloper Name:- Lockers.Pvt.Ltd"
				+ "\nWelcome to Menu Related Application");
		String a = "\n\tSelect the MENU you want" + "\n1) Current Files" + "\n2) User Interface"
				+ "\n3) Close Application";
		   System.out.println(a);
		do {
			option = sc.nextInt();
			switch (option) {

			case 1:
				File fileDirectory = new File("/Users/basantchoudhary/Documents/Test Folder");
				if (fileDirectory.isDirectory()) {
					List<String> ListFile = Arrays.asList(fileDirectory.list());
					Collections.sort(ListFile);
					System.out.println("Sorting File Name in Ascending Order");
					for (String s : ListFile) {
						System.out.println(s);
					}
				} else {
					System.out.println(fileDirectory.getAbsolutePath() + " is not in Directory");
				}

				break;
			case 2:
				System.out.println("\tChoose the option in MENU" + "\n11) Add File" + "\n12) Delete File"
						+ "\n13) Search File" + "\n14) Return to Menu");

				suboption = sc.nextInt();
				switch (suboption) {
				case 11:
					System.out.println("You have selected option to Add File");
					System.out.println("Enter file name");
					filename1 = sc.next();
					System.out.println("Enter data to Add");
					filename = sc.next();
					String data = filename;
					FileOutputStream out = new FileOutputStream(
							"/Users/basantchoudhary/Documents/Test Folder/" + filename1);
					out.write(data.getBytes());
					out.close();
					System.out.println("File has been added");

					break;
				case 12:
					System.out.println("You have selected option to Delete file");

					System.out.println("File Name");
					filename2 = sc.next();
					File file = new File("/Users/basantchoudhary/Documents/Test Folder/" + filename2);
					if (file.delete()) {
						System.out.println(file + " is gotted and deleted");
					} else {
						System.out.println(file + " FNF(File Not Found)");
					}
					break;
				case 13:
					String filename3;
					System.out.println("Enter File name to search" + ".txt");
					filename3 = sc.next();

					File Folder = new File("/Users/basantchoudhary/Documents/Test Folder");
					File[] listOfFiles = Folder.listFiles();
					LinkedList<String> filenames = new LinkedList<String>();
					for (var I : listOfFiles) {
						filenames.add(I.getName());
					}
					if (filenames.contains(filename3)) {
						System.out.println("Operation is Succesful");
						System.out.println("File path:-" + Folder.getAbsolutePath());
					} else {
						System.out.println("Operation is UnSuccesful");
					}
					break;
				case 14:
					System.out.println("You have selected option to Return the Menu");
					System.out.println(a);
					
					break;

				default:
					System.out.println("Invalid Option");
					break;
				}
			case 3:
				if(option==3) {
					System.out.println("The program has been closed");
				}
				break;

			default:
				System.out.println("Invalid Option");
				break;

			}

		} while (true);
	}

	private static void createFileOutputStream() {
		// TODO Auto-generated method stub

	}

}



