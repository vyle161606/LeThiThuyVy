package com.example._LeThiThuyVy.service;


import com.example._LeThiThuyVy.entity.NHANVIEN;
import com.example._LeThiThuyVy.repository.INHANVIENRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NHANVIENService {
    @Autowired
    private INHANVIENRepository nhanvienRepository;

    public List<NHANVIEN> getAllNHANVIENs(){
        return nhanvienRepository.findAll();
    }


    public void addNHANVIEN(NHANVIEN nhanvien){nhanvienRepository.save(nhanvien);
    }

    public void updateNHANVIEN(NHANVIEN nhanvien){nhanvienRepository.save(nhanvien);
    }
    public void deleteNHANVIEN(Long Ma_NV){nhanvienRepository.deleteById(Ma_NV);
    }

}
