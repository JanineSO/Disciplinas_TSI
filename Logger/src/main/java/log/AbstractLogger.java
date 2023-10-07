package log;

public abstract class AbstractLogger implements ILogger
{
	private ILogMessageValidator messageValidator = null;
	
	//------------------------------------------------------------------
	
	public AbstractLogger(ILogMessageValidator msgValidator) 
	{
		this.messageValidator = msgValidator;
	}
	
	 //------------------------------------------------------------------
	
	@Override
	public final void log(String logMessage) throws LogException
	{
		messageValidator.validate(logMessage);
		write(logMessage);
	}
	
	//------------------------------------------------------------------
	protected abstract void write(String logMessage) throws LogException;
	
}
