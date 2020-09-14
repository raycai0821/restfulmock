package com.huifu.restfulmock.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author leifeng.cai
 **/
@Data
@Entity
@Table(name = "fx_channel_conversion")
public class FxConversionEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @NotNull(message = "fx_batch_id不能为空")
    @Column(name = "fx_batch_id")
    private Integer fx_batch_id;

    @Column(name = "channel_code")
    private String channel_code;

    @Column(name = "quote_id")
    private String quote_id;

    @Column(name = "reference_rate")
    private String reference_rate;

    @Column(name = "client_rate")
    private String client_rate;

    @Column(name = "currency_pair")
    private String currency_pair;

    @Column(name = "hx_order_no")
    private String hx_order_no;

    @Column(name = "hx_create_time")
    private String hx_create_time;

    @Column(name = "conversion_date")
    private String conversion_date;

    @Column(name = "conversion_id")
    private String conversion_id;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "last_updated_at")
    private String last_updated_at;

    @Column(name = "short_reference_id")
    private String short_reference_id;

    @Column(name = "settlement_cutoff_time")
    private String settlement_cutoff_time;

    @Column(name = "reason")
    private String reason;

    @Column(name = "source_cur")
    private String source_cur;

    @Column(name = "target_cur")
    private String target_cur;

    @Column(name = "source_amt")
    private String source_amt;

    @Column(name = "target_amt")
    private String target_amt;

    @Column(name = "dealt_currency")
    private String dealt_currency;

    @Column(name = "hx_rate_margin_true")
    private String hx_rate_margin_true;

    @Column(name = "status")
    private String status;

    @Column(name = "error_message")
    private String error_message;

    @Column(name = "create_time")
    private String create_time;

    @Column(name = "creator")
    private String creator;

    @Column(name = "update_time")
    private String update_time;

    @Column(name = "updater")
    private String updater;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFx_batch_id() {
        return fx_batch_id;
    }

    public void setFx_batch_id(Integer fx_batch_id) {
        this.fx_batch_id = fx_batch_id;
    }

    public String getChannel_code() {
        return channel_code;
    }

    public void setChannel_code(String channel_code) {
        this.channel_code = channel_code;
    }

    public String getQuote_id() {
        return quote_id;
    }

    public void setQuote_id(String quote_id) {
        this.quote_id = quote_id;
    }

    public String getReference_rate() {
        return reference_rate;
    }

    public void setReference_rate(String reference_rate) {
        this.reference_rate = reference_rate;
    }

    public String getClient_rate() {
        return client_rate;
    }

    public void setClient_rate(String client_rate) {
        this.client_rate = client_rate;
    }

    public String getCurrency_pair() {
        return currency_pair;
    }

    public void setCurrency_pair(String currency_pair) {
        this.currency_pair = currency_pair;
    }

    public String getHx_order_no() {
        return hx_order_no;
    }

    public void setHx_order_no(String hx_order_no) {
        this.hx_order_no = hx_order_no;
    }

    public String getHx_create_time() {
        return hx_create_time;
    }

    public void setHx_create_time(String hx_create_time) {
        this.hx_create_time = hx_create_time;
    }

    public String getConversion_date() {
        return conversion_date;
    }

    public void setConversion_date(String conversion_date) {
        this.conversion_date = conversion_date;
    }

    public String getConversion_id() {
        return conversion_id;
    }

    public void setConversion_id(String conversion_id) {
        this.conversion_id = conversion_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getLast_updated_at() {
        return last_updated_at;
    }

    public void setLast_updated_at(String last_updated_at) {
        this.last_updated_at = last_updated_at;
    }

    public String getShort_reference_id() {
        return short_reference_id;
    }

    public void setShort_reference_id(String short_reference_id) {
        this.short_reference_id = short_reference_id;
    }

    public String getSettlement_cutoff_time() {
        return settlement_cutoff_time;
    }

    public void setSettlement_cutoff_time(String settlement_cutoff_time) {
        this.settlement_cutoff_time = settlement_cutoff_time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSource_cur() {
        return source_cur;
    }

    public void setSource_cur(String source_cur) {
        this.source_cur = source_cur;
    }

    public String getTarget_cur() {
        return target_cur;
    }

    public void setTarget_cur(String target_cur) {
        this.target_cur = target_cur;
    }

    public String getSource_amt() {
        return source_amt;
    }

    public void setSource_amt(String source_amt) {
        this.source_amt = source_amt;
    }

    public String getTarget_amt() {
        return target_amt;
    }

    public void setTarget_amt(String target_amt) {
        this.target_amt = target_amt;
    }

    public String getDealt_currency() {
        return dealt_currency;
    }

    public void setDealt_currency(String dealt_currency) {
        this.dealt_currency = dealt_currency;
    }

    public String getHx_rate_margin_true() {
        return hx_rate_margin_true;
    }

    public void setHx_rate_margin_true(String hx_rate_margin_true) {
        this.hx_rate_margin_true = hx_rate_margin_true;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }
}
