package com.Binde.hive.utils.event;

import com.Binde.hive.entity.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.math.BigDecimal;

@Getter
public class WalletFundingEvent extends ApplicationEvent {

    private final BigDecimal amount;
    private final User user;

    public WalletFundingEvent(Object source, User user, BigDecimal amount) {
        super(source);
        this.user = user;
        this.amount = amount;
    }
}
