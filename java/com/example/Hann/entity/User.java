package com.example.Hann.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@DynamicInsert//insert시 null필드 제외
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int userid;

    @Column(nullable = false,length=30)
    private String username;

    @Column(nullable = false,length=50,unique = true)
    private String useremail;

    @Column(nullable = false,length=100)
    private String userpwd;

    //@ColumnDefault("'user'")
    @Enumerated(EnumType.STRING)
    private RoleType role;

    @CreationTimestamp
    private Timestamp createData;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }

    public Timestamp getCreateData() {
        return createData;
    }

    public void setCreateData(Timestamp createData) {
        this.createData = createData;
    }
}
