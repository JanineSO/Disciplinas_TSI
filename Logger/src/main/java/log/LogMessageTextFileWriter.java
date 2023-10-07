package log;

public class LogMessageTextFileWriter implements ILogMessageWriter{

	@Override
	public void write(String logMessage) throws LogException {
		System.out.printf("\n '%s' was logged into textfilelog", logMessage);
	}
}
