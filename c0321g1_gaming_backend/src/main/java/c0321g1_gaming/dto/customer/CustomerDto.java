package c0321g1_gaming.dto.customer;

import c0321g1_gaming.model.entity.address.Address;
import c0321g1_gaming.model.entity.customer.CustomerStatus;
import c0321g1_gaming.model.entity.order.Order;
import c0321g1_gaming.model.entity.security.Account;
import java.util.List;


public class CustomerDto {
    private Long customerId;
    private String email;
    private String dateOfBirth;
    private String fullName;
    private int flag;
    private String phone;
    private List<Address> addressList;
    private CustomerStatus customerStatus;
    private List<Order> orderList;
    private Account account;
    private String code;

    public CustomerDto() {
    }

    public CustomerDto(Long customerId, String email, String dateOfBirth, String fullName, int flag, String phone, List<Address> addressList, CustomerStatus customerStatus, List<Order> orderList, Account account, String code) {
        this.customerId = customerId;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.fullName = fullName;
        this.flag = flag;
        this.phone = phone;
        this.addressList = addressList;
        this.customerStatus = customerStatus;
        this.orderList = orderList;
        this.account = account;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
