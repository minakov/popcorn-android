package com.savefon.popcorntime.test;

import android.test.UiThreadTest;

import com.savefon.popcorntime.ui.MainActivity;

import static org.fest.assertions.api.Assertions.assertThat;

public class DashboardActivityTest extends MockActivityTest<MainActivity> {

    public DashboardActivityTest() {
        super(MainActivity.class);
    }

    @UiThreadTest
    public void testSanity() {
        assertThat(true).isTrue();
    }
}
