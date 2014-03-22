package com.savefon.popcorntime.test;

import android.app.Activity;
import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;

public class MockActivityTest<T extends Activity> extends ActivityInstrumentationTestCase2<T> {
    private final MockitoHelper mockitoHelper = new MockitoHelper();

    // This constructor was deprecated - but we want to support lower API levels.
    @SuppressWarnings("deprecation")
    public MockActivityTest(Class<T> activityClass) {
        super("com.savefon.popcorntime", activityClass);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        Context realContext = getInstrumentation().getTargetContext();
        mockitoHelper.setUp(realContext.getCacheDir().toString());
    }

    @Override
    protected void tearDown() throws Exception {
        mockitoHelper.tearDown();
        super.tearDown();
    }
}
