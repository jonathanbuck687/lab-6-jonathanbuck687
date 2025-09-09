package lab_6;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ReadFromFileUsingScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("park.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
			
		}
	}

}
