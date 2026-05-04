import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        logger.info("Thực hiện phép cộng giữa {} và {}", a, b);
        return a + b;
    }
}