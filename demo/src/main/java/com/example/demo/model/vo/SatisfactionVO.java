package com.example.demo.model.vo;

import java.sql.Date;
import lombok.Data;

@Data
public class SatisfactionVO {
    private int seq;
    private int rating;
    private String dissatisfactionContent;
    private String writeDate;
}
