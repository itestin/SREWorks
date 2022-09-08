package com.alibaba.tesla.appmanager.plugin.service;

import com.alibaba.tesla.appmanager.domain.schema.PluginDefinitionSchema;

import java.nio.file.Path;

/**
 * Plugin 前端配置相关服务
 *
 * @author yaoxing.gyx@alibaba-inc.com
 */
public interface PluginFrontendService {

    /**
     * 根据 Plugin Definition 更新所有 Frontend 记录
     *
     * @param definitionSchema Plugin Definition Schema
     * @param pluginDir        插件目录
     */
    void updateByPluginDefinition(PluginDefinitionSchema definitionSchema, Path pluginDir);

    /**
     * 删除指定 PluginName + PluginVersion 下的全部 Frontend 资源
     *
     * @param pluginName    插件名称
     * @param pluginVersion 插件版本
     */
    void deleteByPlugin(String pluginName, String pluginVersion);
}
