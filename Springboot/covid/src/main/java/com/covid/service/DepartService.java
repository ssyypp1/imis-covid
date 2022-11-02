package com.covid.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.covid.entity.Department;
import com.covid.entity.Department;

import java.util.List;

public interface DepartService extends IService<Department> {
    public List<String> getAll();
}
