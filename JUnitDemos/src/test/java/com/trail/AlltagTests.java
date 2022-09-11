package com.trail;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
// use tags
@SelectPackages({"com.testcases"})
@IncludeTags({"creation","all-products","check"})
public class AlltagTests {

}
