package cuit.xsgw.entity;

public class User {
    private static final long serialVersionUID = 1L;
    //用户名
    private String id;
    //昵称
    private String name;
    //密码
    private String password;
    //手机号
    private String phone;
    //性别
    private String sex;
    //现居住地
    private String address;
    //疾病
    private String disease;
    //身份证
    private String idCard;

    /**
     * 设置：用户名
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取：用户名
     */
    public String getId() {
        return id;
    }
    /**
     * 设置：昵称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取：昵称
     */
    public String getName() {
        return name;
    }
    /**
     * 设置：密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 获取：密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置：手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * 获取：手机号
     */
    public String getPhone() {
        return phone;
    }
    /**
     * 设置：性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * 获取：性别
     */
    public String getSex() {
        return sex;
    }
    /**
     * 设置：现居住地
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * 获取：现居住地
     */
    public String getAddress() {
        return address;
    }
    /**
     * 设置：疾病
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }
    /**
     * 获取：疾病
     */
    public String getDisease() {
        return disease;
    }

    /**
     * 设置：身份证
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    /**
     * 获取：身份证
     */
    public String getIdCard() {
        return idCard;
    }
}
