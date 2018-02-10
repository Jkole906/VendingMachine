package VendingMachine;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogWriter
{
	File logFile = new File("Log.txt");
	logFile.createNewFile();
	PrintWriter write = new PrintWriter(logFile);
	
	public static void newLogEntry(String entry) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.now();
		String formattedDateTime = dateTime.format(formatter);
		
		write.println(formattedDateTime + " " + entry);
		write.flush();
		}
		catch(IOException ex) {
			
		}
		
		
	}
	
	private void checkLogFile() {
		//
	}
}
