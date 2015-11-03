package checked;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedExceptions
{
	public static void OpenFileChecked() throws FileNotFoundException
	{
		try
		{
			Scanner read_file = new Scanner(new FileReader("nofile.txt"));
			read_file.close();
		}
		catch (FileNotFoundException fnfe)
		{
			throw fnfe;
		}
	}
}
