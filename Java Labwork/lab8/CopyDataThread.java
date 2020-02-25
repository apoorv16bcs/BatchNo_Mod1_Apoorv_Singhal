package Lab8;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {

	FileInputStream fileinput;
	FileOutputStream fileoutput;

	public CopyDataThread(FileInputStream fileinput, FileOutputStream fileoutput) {
	this.fileinput=fileinput;
	this.fileoutput=fileoutput;
	}
	
	@Override
	public void run() {
		int a=0;
		int count=1;

		while (a!=-1) {
			try {
				a = fileinput.read();
				fileoutput.write(a);
				count++;
			} catch (IOException ece) {
				ece.printStackTrace();
			}

			if (count % 10 == 0) {
				try {
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		try {
			fileinput.close();
			fileoutput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
