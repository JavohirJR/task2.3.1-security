package com.javohir.task2.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult {

    private String message;
    private boolean success;
    private Object object;

    public ApiResult(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
}
