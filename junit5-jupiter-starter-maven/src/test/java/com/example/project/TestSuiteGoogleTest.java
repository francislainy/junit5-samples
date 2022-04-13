package com.example.project;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/**
 * https://vcservice.devel.hmheng-content-pipeline.br.internal/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/virtual-classroom-controller
 * <p>
 * mvn -Dtest=com.hmhco.vcservice.functional_tests.TestSuiteGoogle test
 */

//@SelectClasses(GoogleIntegrationTest.class)
//@SelectClasses(GoogleIT.class)
@SelectClasses(GoogleTest.class)
//@SelectPackages("com.example.project")
@IncludeTags("google")
@Suite
class TestSuiteGoogleTest {
}
