package log;

public class LogMessageNoSqlDatabaseWriter implements ILogMessageWriter{

	@Override
	public void write(String logMessage) throws LogException {
		System.out.printf("\n '%s' was Logged into NoSQLDatabaseLog", logMessage);
	}

}
