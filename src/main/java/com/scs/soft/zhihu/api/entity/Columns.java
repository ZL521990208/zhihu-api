package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Author zhengliang
 * @Date 2020/1/19
 * @Version 1.0
 **/
@Data
@Builder
public class Columns {
    private Integer id;
    private String  title;
    private String  description;
    private String  url;
    private String  imageUrl;
    private Integer followers;
    private Integer articlesCount;
}
