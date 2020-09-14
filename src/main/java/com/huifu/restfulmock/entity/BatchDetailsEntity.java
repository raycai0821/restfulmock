package com.huifu.restfulmock.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "fx_ex_rate_inquiry")
public class BatchDetailsEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer inquiry_id;

    @NotNull(message = "member_code不能为空")
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

    public Integer getInquiry_id() {
        return inquiry_id;
    }

    public void setInquiry_id(Integer inquiry_id) {
        this.inquiry_id = inquiry_id;
    }

    public String getMember_code() {
        return member_code;
    }

    public void setMember_code(String member_code) {
        this.member_code = member_code;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getExt_trace_no() {
        return ext_trace_no;
    }

    public void setExt_trace_no(String ext_trace_no) {
        this.ext_trace_no = ext_trace_no;
    }

    public String getSource_cur() {
        return source_cur;
    }

    public void setSource_cur(String source_cur) {
        this.source_cur = source_cur;
    }

    public String getSource_amt() {
        return source_amt;
    }

    public void setSource_amt(String source_amt) {
        this.source_amt = source_amt;
    }

    public String getTarget_cur() {
        return target_cur;
    }

    public void setTarget_cur(String target_cur) {
        this.target_cur = target_cur;
    }

    public String getTarget_amt() {
        return target_amt;
    }

    public void setTarget_amt(String target_amt) {
        this.target_amt = target_amt;
    }

    public String getConversion_direction() {
        return conversion_direction;
    }

    public void setConversion_direction(String conversion_direction) {
        this.conversion_direction = conversion_direction;
    }

    public String getQuote_channel_code() {
        return quote_channel_code;
    }

    public void setQuote_channel_code(String quote_channel_code) {
        this.quote_channel_code = quote_channel_code;
    }

    public Integer getChannel_ex_rate() {
        return channel_ex_rate;
    }

    public void setChannel_ex_rate(Integer channel_ex_rate) {
        this.channel_ex_rate = channel_ex_rate;
    }

    public Integer getHadsund_ex_rate() {
        return hadsund_ex_rate;
    }

    public void setHadsund_ex_rate(Integer hadsund_ex_rate) {
        this.hadsund_ex_rate = hadsund_ex_rate;
    }

    public Integer getDeal_ex_rate() {
        return deal_ex_rate;
    }

    public void setDeal_ex_rate(Integer deal_ex_rate) {
        this.deal_ex_rate = deal_ex_rate;
    }

    public String getConfirmer() {
        return confirmer;
    }

    public void setConfirmer(String confirmer) {
        this.confirmer = confirmer;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(String expire_time) {
        this.expire_time = expire_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
