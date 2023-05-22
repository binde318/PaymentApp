package com.Binde.hive.utils.event;

import com.Binde.hive.entity.TransactionLog;
import com.Binde.hive.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;


@Getter
@Setter
@Builder
public class SuccessfulCreditEvent extends ApplicationEvent {
    private User user;
    private TransactionLog transactionLog;


    public SuccessfulCreditEvent(User user, TransactionLog transactionLog) {
        super(user);
        this.user = user;
        this.transactionLog = transactionLog;
    }
}
