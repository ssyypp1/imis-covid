package com.covid.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.covid.entity.EmpIden;
import com.covid.vo.LineVO;
import com.covid.vo.PieVo;
import com.covid.entity.EmpIden;
import com.covid.vo.LineVO;
import com.covid.vo.PieVo;

import java.util.List;
import java.util.Map;

public interface ChartService extends IService<EmpIden> {
    public LineVO lineVOList();
    public List<PieVo> pieVOMap();
}
