package com.swagger.config;

import com.swagger.utils.ResponseBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ProjectProperties.class)
@ConfigurationProperties(
        prefix = "project"
)
@ConditionalOnClass({ResponseBean.class})
public class ProjectProperties {
    private String name;
    private String version;
    private String buildTime;

    public ProjectProperties() {
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public String getBuildTime() {
        return this.buildTime;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public void setBuildTime(final String buildTime) {
        this.buildTime = buildTime;
    }

    static {
        System.out.println("ProjectProperties init...");
    }

}
