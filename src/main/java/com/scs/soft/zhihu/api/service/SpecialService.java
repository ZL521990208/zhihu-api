package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author zhengliang
 * @Date 2020/1/15
 **/
public interface SpecialService {
    /**
     * 查询所有专题
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     *
     * @return List<Special>
     */
    List<Special> selectRecent();
}
