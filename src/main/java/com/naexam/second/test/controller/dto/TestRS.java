package com.naexam.second.test.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestRS {
    private String email;
    private String username;
}
