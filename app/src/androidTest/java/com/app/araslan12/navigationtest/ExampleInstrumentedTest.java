package com.app.araslan12.navigationtest;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import junit.extensions.ActiveTestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;
import org.junit.Rule;
import androidx.test.rule.ActivityTestRule;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActiveTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.app.araslan12.navigationtest", appContext.getPackageName());
    }

    @Test
    public void clickButtonHome() {
        onView(withId(R.id.navigation_home)).perform(click()).check(matches(isDisplayed()));
    }

    @Test
    public void clickButtonDashBoard() {
        onView(withId(R.id.navigation_dashboard)).perform(click()).check(matches(isDisplayed()));
    }

    @Test
    public void clickButtonNotification() {
        onView(withId(R.id.navigation_notifications)).perform(click()).check(matches(isDisplayed()));
    }

}
