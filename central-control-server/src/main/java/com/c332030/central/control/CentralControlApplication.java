package com.c332030.central.control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import com.c332030.constant.PackageConstants;

/**
 * <p>
 * Description: CentralControlServerApplication
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = PackageConstants.BASE)
@ConfigurationPropertiesScan(basePackages = PackageConstants.BASE)
public class CentralControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CentralControlApplication.class, args);
    }
}
