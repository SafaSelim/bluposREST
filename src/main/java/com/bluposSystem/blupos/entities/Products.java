package com.bluposSystem.blupos.entities;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PROD_ID")
    private int prodId;

    @Column(name="PROD_CODE")
    private String prodCode;

    @Column(name="PROD_NAME")
    private String prodName;

    @Column(name="PROD_CAT_ID")
    private int prodCatId;

    @Column(name="UOM")
    private int uom;

    @Column(name="PRICE")
    private float price;

    @Column(name="UNIT_IN_STOCK")
    private int unitInStock;

    @Column(name="IMG_PATH")
    private String imgPath;

    public Products(Products prod) {
        this.prodId = prod.prodId;
        this.prodCode = prod.prodCode;
        this.prodName = prod.prodName;
        this.prodCatId = prod.prodCatId;
        this.uom = prod.uom;
        this.price = prod.price;
        this.unitInStock = prod.unitInStock;
        this.imgPath = prod.imgPath;
    }

    public Products() {

    }

    public int getProductId() {
        return prodId;
    }

    public void setProductId(int prodId) {
        this.prodId = prodId;
    }

    public String getProductCode() {
        return prodCode;
    }

    public void setProductCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProductName() {
        return prodName;
    }

    public void setProductName(String prodName) {
        this.prodName = prodName;
    }

    public int getProductCatId() {
        return prodCatId;
    }

    public void setProductCatId(int prodCatId) {
        this.prodCatId = prodCatId;
    }

    public int getUom() {
        return uom;
    }

    public void setUom(int uom) {
        this.uom = uom;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return unitInStock;
    }

    public void setStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getImg_path() {
        return imgPath;
    }

    public void setImg_path(String imgPath) {
        this.imgPath = imgPath;
    }
}
