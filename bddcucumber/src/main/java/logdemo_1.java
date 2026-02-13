


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class logdemo_1 {
	private static Logger logger =LogManager.getLogger(logdemo_1.class);
	public static void main(String[]args) {
		System.out.println("hello world");
		logger.info("This is information message");
		logger.trace("This is debug message");
		logger.debug("debug mode");
		System.out.println("completed");
		
	}
			

}

