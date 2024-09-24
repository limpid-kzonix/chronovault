package com.worxbend.dto.request;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record ServerInfo(
        String ipAddress,
        String port,
        String version,
        String operatingSystem,
        String memoryUsage,
        String uptime
) {
}
