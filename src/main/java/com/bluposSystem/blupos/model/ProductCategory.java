package com.bluposSystem.blupos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int prodCatId;

    private String prodCatName;
    private String desc;

    public ProductCategory(ProductCategory prodCat) {
        this.prodCatId = prodCat.prodCatId;
        this.prodCatName = prodCat.prodCatName;
        this.desc = prodCat.desc;
    }

    public ProductCategory() {

    }

    public int getProdCatId() {
        return prodCatId;
    }

    public void setProdCatId(int prodCatId) {
        this.prodCatId = prodCatId;
    }

    public String getProdCatName() {
        return prodCatName;
    }

    public void setProdCatName(String prodCatName) {
        this.prodCatName = prodCatName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
