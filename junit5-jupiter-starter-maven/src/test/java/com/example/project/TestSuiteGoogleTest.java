package com.example.project;

import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.Suite;

/**
 * mvn -Dtest=com.example.project.TestSuiteGoogle test
 */

@IncludePackages("com.example.project")
@Suite
class TestSuiteGoogleTest {
}
