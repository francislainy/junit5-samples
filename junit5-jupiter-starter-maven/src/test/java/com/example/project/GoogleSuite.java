package com.example.project;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/**
 * mvn test -Dcom.example.project.GoogleSuite
 */

// Note: IT is normally only invoked by Failsafe not surefire. Check your class names.
@SelectPackages("com.example.project.tests") // Avoid Recursion where a suite selects itself
@Suite
class GoogleSuite { // Don't use special Test/Tests in the suite name
}
