package com.example.demo;

import java.sql.Date;
import lombok.Data;

@Data
public class SatisfactionVO {
    private int seq;
    private int rating;
    private String dissatisfaction_content;
    private Date write_date;
}
