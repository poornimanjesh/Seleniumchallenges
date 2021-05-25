package Challangese;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day4_Filehandlingtech {

	public static void main(String[] args)  {
		filecopy_write();
	}


	public static void filecopy_write() {
		File file=new File("C:\\Drivers\\xpath.pdf");
		File opfile=new File("C:\\Drivers\\xpath_copy.pdf");
		FileInputStream  fileinputstr=null;
		FileOutputStream fileoutputstr=null;
		try {
			fileinputstr=new FileInputStream(file);
			fileoutputstr=new FileOutputStream(opfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(fileinputstr.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i=0;
		try {
			while((i=fileinputstr.read())!=-1) {
				fileoutputstr.write(i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fileinputstr!=null) {
				try {fileinputstr.close();

				} catch (IOException e) {
					e.printStackTrace();
				}if(fileoutputstr!=null) {


					try {
						fileoutputstr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}
}
