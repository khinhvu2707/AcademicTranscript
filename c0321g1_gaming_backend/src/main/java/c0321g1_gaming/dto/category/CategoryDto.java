package c0321g1_gaming.dto.category;

import c0321g1_gaming.model.entity.security.Account;


public class CategoryDto {
    private Long categoryId;
    private String description;
    private String discount;
    private String name;
    private String startTime;
    private String endTime;
    private int fee;
    private String type;
    private Account account;

    public CategoryDto() {
    }

    public CategoryDto(Long categoryId, String description, String discount, String name, String startTime, String endTime, int fee, String type, Account account) {
        this.categoryId = categoryId;
        this.description = description;
        this.discount = discount;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.fee = fee;
        this.type = type;
        this.account = account;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
