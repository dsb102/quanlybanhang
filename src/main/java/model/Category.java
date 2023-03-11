/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Category {
    private int categoryId;
    private int categoryName;

    public Category() {
    }

    public Category(int categoryId, int categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(int categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public int getCategoryName() {
        return categoryName;
    }
}
