import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Paths;

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

    // Đã Refactor: Tự động dùng '/' trên Linux/macOS và '\' trên Windows
    public static String getReportFilePath() {
        return Paths.get("reports", "2026", "summary.txt").toString();
    }
}