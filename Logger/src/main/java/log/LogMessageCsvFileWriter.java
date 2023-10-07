package log;

public class LogMessageCsvFileWriter implements ILogMessageWriter{

	@Override
	public void write(String logMessage) throws LogException {
		System.out.printf("\n '%s' was Logged into csvFileLog", logMessage);
	}

}
