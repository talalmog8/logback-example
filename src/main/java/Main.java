import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public  static  void main(String[] args){

        logger.info("The message is: {}", "msg");
        logger.debug("Debugging...");

        int a = 0;
        try {
            int c = 3 / a;
        }
        catch (Exception ex){
            logger.error("overflow on main", ex);
        }
    }
}
