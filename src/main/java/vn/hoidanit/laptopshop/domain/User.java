package vn.hoidanit.laptopshop.domain;

public class User {
    private long id;
    private String email;
    private String password;
    private String fullName;
    private String address;
    private String phone;

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // public User(long id, String email, String password, String fullName, String
    // address, String phone) {
    // this.id = id;
    // this.email = email;
    // this.password = password;
    // this.fullName = fullName;
    // this.address = address;
    // this.phone = phone;
    // }

    // public User() {
    // }

    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", password=" + password + ", fullName=" + fullName
                + ", address=" + address + ", phone=" + phone + "]";
    }
}
