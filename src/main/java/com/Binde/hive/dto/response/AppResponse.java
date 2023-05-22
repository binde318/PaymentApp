package com.Binde.hive.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.Binde.hive.constant.ResponseStatus;
import com.Binde.hive.exceptions.ErrorDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AppResponse<T> {

    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String statusCode;
    private Boolean isSuccessful;
    private final String time = LocalDateTime.now().toString() ;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T result;
    private ErrorDetails error;


    public static  <T> AppResponse<T> buildSuccessTxn(T data) {
        AppResponse<T> response = new AppResponse<>();
        response.setIsSuccessful(true);
        response.setStatusCode(ResponseStatus.SUCCESSFUL.getCode());
        response.setMessage(ResponseStatus.SUCCESSFUL.getMessage());
        response.setResult(data);
        return response;
    }

    public static  <T> AppResponse<T> buildSuccess(T data) {
        AppResponse<T> response = new AppResponse<>();
        response.setIsSuccessful(true);
        response.setMessage(ResponseStatus.SUCCESSFUL.getMessage());
        response.setResult(data);
        return response;
    }

    public static AppResponse<Void> build() {
        AppResponse<Void> response = new AppResponse<>();
        response.setIsSuccessful(true);
        response.setMessage(ResponseStatus.SUCCESSFUL.getMessage());
        return response;
    }
}
