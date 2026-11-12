import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lớp cung cấp các hàm tiện ích toán học và xử lý đường dẫn.
 */
public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    /**
     * Tìm giá trị lớn nhất giữa hai số nguyên.
     *
     * @param a số thứ nhất
     * @param b số thứ hai
     * @return giá trị lớn hơn
     */
    public static int max(int a, int b) {
        logger.info("Tìm giá trị lớn nhất giữa {} và {}", a, b);
        return (a >= b) ? a : b;
    }

    /**
     * Thực hiện phép chia hai số nguyên.
     *
     * @param a số bị chia
     * @param b số chia
     * @return kết quả phép chia
     */
    public static int divide(int a, int b) {
        logger.info("Thực hiện phép chia {} cho {}", a, b);
        if (b == 0) {
            logger.error("Lỗi: Chia cho 0");
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }

    /**
     * Lấy đường dẫn file báo cáo tương thích đa hệ điều hành.
     *
     * @return chuỗi đường dẫn chuẩn
     */
    public static String getReportFilePath() {
        return Paths.get("reports", "2026", "summary.txt").toString();
    }

    /**
     * Tính giai thừa của một số nguyên không âm.
     *
     * @param n số nguyên đầu vào
     * @return kết quả n!
     */
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

    /**
     * Kiểm tra số nguyên tố.
     *
     * @param n số cần kiểm tra
     * @return true nếu là số nguyên tố, ngược lại false
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}