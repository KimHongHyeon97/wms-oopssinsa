package com.oopssinsa.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ObRequestAndStockDto {
    private String id;
    private String productId;
    private String loginId;
    private int quantity;
    private String recipientName;
    private String address;
//    private LocalDate manufactureDate;

    private char obStatus; // 출고 가능여부
    private String subLocationId;
    private int stockQuantity;
    private int expectedStockQuantity;

}
