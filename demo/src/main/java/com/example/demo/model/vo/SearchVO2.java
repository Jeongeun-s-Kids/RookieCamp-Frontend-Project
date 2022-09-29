package com.example.demo.model.vo;

import lombok.Data;

@Data
public class SearchVO2 {
    //다중선택 개수
    private int cnt;
    //업종명
    private String category;
    //상품명 - 다중선택에 따라서 프로덕트에 들어갈 것들이 달라짐
    private String product1;
    private String product2;
}
