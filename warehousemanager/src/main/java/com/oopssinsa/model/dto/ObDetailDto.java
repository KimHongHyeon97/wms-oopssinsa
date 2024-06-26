package com.oopssinsa.model.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ObDetailDto {
    private LocalDate manufactureDate;
    private String obId;
    private String productId;
    private int quantity;
    private char status;
    private LocalDate obDate;
    private Integer trackingNumber;
}
