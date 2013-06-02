package atm;

import java.util.logging.Level;
import java.util.logging.Logger;

public class loggingexamples {

		private static final String	Nasabah = loggingexamples.class.getCanonicalName();
		private static final String atm = loggingexamples.class.getPackage().getName();
		private static Logger logger = Logger.getLogger(atm);
		
		public void justOneMethod(String aParam)
		{
			final String Nasabah = "justOneMethod";
			logger.entering(Nasabah, Nasabah, aParam);
			
			String someResult = "Random Result";
			
			if (logger.isLoggable(Level.INFO))
			{
				logger.log(Level.INFO, "Some informational logging.");
			}
			
			if (logger.isLoggable(Level.FINEST))  {  // <3>
	            logger.log(Level.FINEST, 
	                String.format("Here's a lot of detail: %s %d %c", "detail1", 25, 'x'));
	        }


	        logger.exiting(Nasabah, Nasabah, someResult); // <2>
			
			//logger.entering(getClass().getName(),"Nasabah");
			//try{
				
			//}
			//catch(Exception )
			//{
				
				
			//}
			//logger.exiting(getClass().getName(),"Nasabah");
		}
}

