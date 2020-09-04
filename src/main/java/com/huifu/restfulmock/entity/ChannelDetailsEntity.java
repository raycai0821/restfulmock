package com.huifu.restfulmock.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author leifeng.cai
 **/
@Data
@Entity
@Table(name = "fx_channel_conversion")
public class ChannelDetailsEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private Integer fx_batch_id;
    private String channel_code;
    private String quote_id;
    private String reference_rate;
    private String client_rate;
    private String currency_pair;
    private String hx_order_no;
    private String hx_create_time;
    private String conversion_date;
    private String conversion_id;
    private String created_at;
    private String last_updated_at;
    private String short_reference_id;
    private String settlement_cutoff_time;
    private String reason;
    private String source_cur;
    private String target_cur;
    private String source_amt;
    private String target_amt;
    private String dealt_currency;
    private String hx_rate_margin_true;
    private String status;
    private String error_message;
    private String create_time;
    private String creator;
    private String update_time;
    private String updater;


}
