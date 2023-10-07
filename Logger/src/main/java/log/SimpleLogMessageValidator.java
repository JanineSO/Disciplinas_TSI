package log;

public class SimpleLogMessageValidator implements ILogMessageValidator{

	final String invalidMessage = "Invalid Log Message";
	
	//--------------------------------------------------------------
	
	@Override
	public void validate(String logMessage) throws LogException {
		
		if(logMessage == null)
			throw new LogException(invalidMessage + "(Null )" );
		if(logMessage.isBlank() || logMessage.isEmpty())
			throw new LogException(invalidMessage + " ( Empyt )");
		if(logMessage.toUpperCase().contains("XPTO"))
			throw new LogException(invalidMessage + "(it contains 'XPTO')");	
	}
}
