package test;

import ae.java.awt.Desktop;
import java.io.File;

public class OpenPDF {

	public static void main(String[] args) {

		try {

			File pdfFile = new File("hoa don/HD0021.pdf");
			if (pdfFile.exists()) {

				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfFile);
				} else {
					System.out.println("Awt Desktop is not supported!");
				}

			} else {
				System.out.println("File is not exists!");
			}

			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
