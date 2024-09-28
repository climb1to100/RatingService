package com.lcwd.rating.service.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    private String message;
    private HttpStatus httpStatus;
    private boolean success;
}
