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
public class Recode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recodeid;

    @Enumerated(EnumType.STRING)
    private ValueType value;

    @Column(nullable = true,length=30)
    private String pharmacy;

    @Column(nullable = false,length=30)
    private String medicine;

    @CreationTimestamp
    private Timestamp createData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    private User user;

    public ValueType getValue() {
        return value;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }

    public Timestamp getCreateData() {
        return createData;
    }

    public void setCreateData(Timestamp createData) {
        this.createData = createData;
    }

    public int getRecodeid() {
        return recodeid;
    }

    public void setRecodeid(int recodeid) {
        this.recodeid = recodeid;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public User getUser() {
        return user;
    }

    public void setUserid(User user) {
        this.user = user;
    }
}
