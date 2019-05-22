package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class Constants {
    public static final String SUCCESS = "0000";

    public static final String LOAN_EXCHANGE = "payday_loan.loan";
    public static final String REPAYMENT_EXCHANGE = "payday_loan.repayment";


    public static final String X_DEAD_LETTER_EXCHANGE = "x-dead-letter-exchange";
    public static final String X_DEAD_LETTER_ROUTING_KEY = "x-dead-letter-routing-key";

    public static final String JZ_LOAN_PUSH_QUEUE = "jz.loan.push";
    public static final String JZ_LOAN_PUSH_EXCHANGE_DXL = "jz.loan.push.dxl";
    public static final String JZ_LOAN_PUSH_ROUTING_KEY_DXL = "jz.loan.push.dxl";
    public static final String JZ_LOAN_PUSH_QUEUE_DXL = "jz.loan.push.dxl";

    public static final String JZ_REPAYMENT_PUSH_QUEUE = "jz.repayment.push";
    public static final String JZ_REPAYMENT_PUSH_EXCHANGE_DXL = "jz.repayment.push.dxl";
    public static final String JZ_REPAYMENT_PUSH_ROUTING_KEY_DXL = "jz.repayment.push.dxl";
    public static final String JZ_REPAYMENT_PUSH_QUEUE_DXL = "jz.repayment.push.dxl";

    public static final String HT_REPAYMENT_PUSH_QUEUE = "ht.repayment.push";
    public static final String HT_REPAYMENT_PUSH_EXCHANGE_DXL = "ht.repayment.push.dxl";
    public static final String HT_REPAYMENT_PUSH_ROUTING_KEY_DXL = "ht.repayment.push.dxl";
    public static final String HT_REPAYMENT_PUSH_QUEUE_DXL = "ht.repayment.push.dxl";

}
