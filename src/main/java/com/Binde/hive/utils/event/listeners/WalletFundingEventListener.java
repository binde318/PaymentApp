package com.Binde.hive.utils.event.listeners;

import com.Binde.hive.exceptions.CustomException;
import com.Binde.hive.service.implementation.NotificationServiceImpl;
import com.Binde.hive.utils.event.WalletFundingEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationListener;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Log4j2
public class WalletFundingEventListener implements ApplicationListener<WalletFundingEvent> {

    private final NotificationServiceImpl notificationService;

    @Override
    public void onApplicationEvent(WalletFundingEvent event ) {
        var user = event.getUser();
        BigDecimal amount = event.getAmount();

        try {
            notificationService.walletFundingNotification(user, amount);
        } catch (CustomException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
