package com.example._LeThiThuyVy.entity;

import jakarta.persistence.*;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Entity
@Table(name = "phongban")
public class PHONGBAN {
    @Id
    @Column(name="MaPhong")
    private String Ma_Phong;

    @Column(name="TenPhong")
    private String Ten_Phong;

    @OneToMany(mappedBy = "phongban",cascade = CascadeType.ALL)
    private List<NHANVIEN> nhanviens;

}
