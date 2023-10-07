package log;

public interface ILogMessageWriter {
	
	void write(String logMessage) throws LogException;
}
