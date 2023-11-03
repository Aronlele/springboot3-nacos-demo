package tk.huclele.order.record;

import java.io.Serializable;

/**
 * demo new order record.
 *
 * @author huclele
 * @version 1.0
 * @since 2023/10/30
 */
public record NewOrderRecord(
        /*
         * 购买者姓名
         */
        String buyer,

        /*
         * 产品编号
         */
        String productId,

        /*
         * 购买产品数量
         */
        Integer quantity
) implements Serializable {
}