package varn.main;

import java.util.logging.Logger;

public class utils {
    public static void main(String[] args) {
//        常用工具类 Math 浮点数不同的平台计算结果可能不一样
//        StrictMath 保证给各个平台计算结果一致 提供的方法几乎同 Math
//        Random 伪随机数
//         SecureRandom  真随机数
        Logger logger = Logger.getGlobal();
        logger.info("sdf");
        logger.warning("警告");
        logger.fine("ignored");
        logger.severe("process will be terminated");
    }
}
