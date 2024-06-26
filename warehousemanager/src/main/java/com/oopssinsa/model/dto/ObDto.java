package com.oopssinsa.model.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ObDto {
    private LocalDate manufactureDate;
    private String obId;
    private String productId;
    private String loginId;
    private String recipientName;
    private String address;
    private int quantity;
    private char status;
    private LocalDate obDate;
    private int trackingNumber;
}
