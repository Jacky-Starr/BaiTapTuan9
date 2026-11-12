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

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}