package com.huifu.restfulmock.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fx_ex_rate_inquiry")
public class BatchDetailsEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer inquiry_id;

    private String member_code;
    private String product_code;
    private String ext_trace_no;
    private String source_cur;
    private String source_amt;
    private String target_cur;
    private String target_amt;
    private String conversion_direction;
    private String quote_channel_code;
    private Integer channel_ex_rate;
    private Integer hadsund_ex_rate;
    private Integer deal_ex_rate;
    private String confirmer;
    private String create_time;
    private String update_time;
    private String expire_time;
    private String status;
}
