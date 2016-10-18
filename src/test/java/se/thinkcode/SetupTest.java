package se.thinkcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SetupTest {

    @Test
    public void verify_test_framework() {
        assertThat(true, is(true));
    }
}
