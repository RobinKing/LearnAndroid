package com.robincn.litepaltest;

class Category {
    private int id;
    private String category;
    private int categoryCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public int getCategoryCode() {
        return categoryCode;
    }
}
