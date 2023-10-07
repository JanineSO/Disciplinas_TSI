package log;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileLoggerTest
{
	@Test
	void ShouldNotThrow()
	{		
		ILogMessageValidator validator = new SimpleLogMessageValidator();
		ILogMessageWriter writer = new LogMessageTextFileWriter();
   	   	
   	final String logMessage = "Login a first message";
   	
	}
}
