package com.Binde.hive.utils.event.listeners;

import com.Binde.hive.utils.event.SuccessfulCreditEvent;
import com.Binde.hive.repository.TaskRepository;
import com.Binde.hive.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class SuccessfulCreditEventListener implements ApplicationListener<SuccessfulCreditEvent> {
    private final EmailService emailService;
    private final TaskRepository taskRepository;

    @Override
    public void onApplicationEvent(SuccessfulCreditEvent event) {
       var doer = event.getUser();
       var transactionLog = event.getTransactionLog();

        try {
//            emailService.sendEmail(EmailTemplates.createSuccessfulCreditEmail(doer, taskTitle));
//            emailService.sendEmail(EmailTemplates.createSuccessfulPaymentFromTaskerEmail(transactionLog.getTaskerDepositor(),taskTitle));

        } catch (Exception e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}

