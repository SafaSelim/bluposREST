package com.bluposSystem.blupos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int invoiceId;
    private int customerId;
    private int regUser;
    private int paymentType;
    private float totalAmount;
    private String date;

    public Invoices(Invoices invoices) {
        this.invoiceId = invoices.invoiceId;
        this.customerId = invoices.customerId;
        this.regUser = invoices.regUser;
        this.paymentType = invoices.paymentType;
        this.totalAmount = invoices.totalAmount;
        this.date = invoices.date;
    }

    public Invoices() {

    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRegUser() {
        return regUser;
    }

    public void setRegUser(int regUser) {
        this.regUser = regUser;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
