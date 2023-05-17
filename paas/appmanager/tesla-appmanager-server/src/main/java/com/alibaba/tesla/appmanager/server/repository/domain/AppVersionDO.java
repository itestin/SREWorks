package com.alibaba.tesla.appmanager.server.repository.domain;

import lombok.*;

import java.util.Date;

/**
 * 应用版本表
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppVersionDO {
    /**
     * ID
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    private Date gmtModified;

    /**
     * 应用 ID (为空则全局)
     */
    private String appId;

    /**
     * 版本号
     */
    private String version;

    /**
     * 版本标签
     */
    private String versionLabel;

    /**
     * 版本属性
     */
    private String versionProperties;

    /**
     * 是否是全局版本
     */
    private Boolean isGlobal = false;
}