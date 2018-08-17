package cn.libo.msproject.entity;

import java.io.Serializable;

//秒杀用户
public class Msuser implements Serializable {

    private int id;//主键
    private String username;//用户姓名
    private String useraccount;//用户账号
    private String userpassword;//用户密码
    private int usersex;//用户性别
    private int userage;//用户年龄
    private String useraddress;//用户地址
    private String useremail;//用户邮箱

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getUsersex() {
        return usersex;
    }

    public void setUsersex(int usersex) {
        this.usersex = usersex;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    @Override
    public String toString() {
        return "Msuser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", useraccount='" + useraccount + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", usersex=" + usersex +
                ", userage=" + userage +
                ", useraddress='" + useraddress + '\'' +
                ", useremail='" + useremail + '\'' +
                '}';
    }
}
