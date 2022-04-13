package com.example.project;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * https://vcservice.devel.hmheng-content-pipeline.br.internal/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/virtual-classroom-controller
 * <p>
 * mvn -Dtest=com.hmhco.vcservice.functional_tests.TestSuiteGoogle test
 */

class GoogleIT {

    @Tag("google")
    @Test
    void testing() {
        System.out.println("testing google");
    }
}
