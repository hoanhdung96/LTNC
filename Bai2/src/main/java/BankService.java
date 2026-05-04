

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankService {
    private static final Logger logger = LoggerFactory.getLogger(BankService.class);

    private static final double MINIMUM_BALANCE = 100.0;
    private double currentBalance;

    public BankService(double initialBalance) {
        this.currentBalance = initialBalance;
    }


    public void transfer(double amount) {

        logger.info("Bắt đầu giao dịch chuyển khoản. Số tiền: {}", amount);

        if (amount <= 0) {

            logger.warn("Giao dịch bị từ chối: Số tiền {} không hợp lệ", amount);
            return;
        }

        if (currentBalance - amount < MINIMUM_BALANCE) {

            logger.error("Giao dịch thất bại: Số dư còn lại thấp hơn mức tối thiểu {}", MINIMUM_BALANCE);
            return;
        }

        currentBalance -= amount;
        logger.info("Giao dịch thành công. Số dư hiện tại: {}", currentBalance);
    }
}