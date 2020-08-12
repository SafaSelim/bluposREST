package com.bluposSystem.blupos.entities;

import javax.persistence.*;

@Entity
@Table(name="sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SALES_ID")
    private int salesId;

    @Column(name="USER_ID")
    private int userId;

    @Column(name="INVOICE_ID")
    private int invoiceId;

    @Column(name="PRODUCT_ID")
    private int productId;

    @Column(name="QUANTITY")
    private int quantity;

    @Column(name="PRICE")
    private float price;

    @Column(name="SUB_TOTAL")
    private float subTotal;

    public Sales(Sales sales) {
        this.salesId = sales.salesId;
        this.userId = sales.userId;
        this.invoiceId = sales.invoiceId;
        this.productId = sales.productId;
        this.quantity = sales.quantity;
        this.price = sales.price;
        this.subTotal = sales.subTotal;
    }

    public Sales() {

    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
}
