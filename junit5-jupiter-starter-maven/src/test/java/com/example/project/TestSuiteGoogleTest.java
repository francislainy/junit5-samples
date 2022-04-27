package com.example.project;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/**
 * mvn -Dtest=com.example.project.TestSuiteGoogle test
 */

//@SelectClasses(GoogleIntegrationTest.class)
//@SelectClasses(GoogleIT.class)
//@SelectClasses(GoogleTest.class)
@SelectPackages("com.example.project")
@IncludeTags("google")
@Suite
class TestSuiteGoogleTest {
}
