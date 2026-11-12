import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static int max(int a, int b) {
        logger.info("Tìm giá trị lớn nhất giữa {} và {}", a, b);
        return (a >= b) ? a : b;
    }

    public static int divide(int a, int b) {
        logger.info("Thực hiện phép chia {} cho {}", a, b);
        if (b == 0) {
            logger.error("Lỗi: Chia cho 0");
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }
}