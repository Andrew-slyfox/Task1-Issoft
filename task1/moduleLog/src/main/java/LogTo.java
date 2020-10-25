import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTo {

    private static final Logger logger = LoggerFactory.getLogger(LogTo.class);

    public void debug(String str){
        logger.debug(str);
    }

    public void info(String str){
        logger.info(str);
    }

    public void error(String str){
        logger.error(str);
    }


}
