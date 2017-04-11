package com.sg.androiddagger2;

import org.junit.Test;
import static org.junit.Assert.*;

public class NetworkApiTest {
    @Test
    public void validateUser_nullUsername_false() {
        NetworkApi networkApi = new NetworkApi();
        String username = null;

        boolean result = networkApi.validateUser(username);

        assertFalse(result);
    }

    @Test
    public void validateUser_emptyUsername_false() {
        NetworkApi networkApi = new NetworkApi();
        String username = "";

        boolean result = networkApi.validateUser(username);

        assertFalse(result);
    }

    @Test
    public void validateUser_validUsername_true() {
        NetworkApi networkApi = new NetworkApi();
        String username = "validUsername";

        boolean result = networkApi.validateUser(username);

        assertTrue(result);
    }
}
