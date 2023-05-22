package com.Binde.hive.service;



import com.Binde.hive.dto.request.EmailDto;

import java.io.IOException;

public interface EmailService {

    void sendEmail(EmailDto emailDto) throws IOException;

}