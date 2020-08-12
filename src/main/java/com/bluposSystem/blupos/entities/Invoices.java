package com.bluposSystem.blupos.entities;

import javax.persistence.*;

@Entity
@Table(name="invoices")
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INVOICE_ID")
    private int invoiceId;

    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "REG_USER")
    private int regUser;

    @Column(name = "PAYMENT_TYPE")
    private int paymentType;

    @Column(name = "TOTAL_AMOUNT")
    private float totalAmount;

    @Column(name = "DATE")
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
