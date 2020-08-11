package com.bluposSystem.blupos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int prodId;

    private String prodCode;
    private String prodName;
    private int prodCatId;
    private int uom;
    private float price;
    private int unitInStock;
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
