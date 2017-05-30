 
package db;
 
public class DBUtil {
    private static final String HOSTNAME = "localhost";
    private static final String PORT_NUM = "3307";// change it to your mysql port number
    public static final String DB_NAME = "laiproject";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
   			 + "?user=" + USERNAME + "&password=" + PASSWORD + "&autoreconnect=true";
    
    public enum output{
    	OK(0),
    	INVALID_ARGUMENT(1),
    	INTERNAL(2),
    	DEADLINE_EXCEEDED(3),
    	UNKNOWN(4);

        private final int value;

        output(final int Value) {
            this.value = Value;
        }

        public int getValue() { 
        	return value; 
        }
    }
}


