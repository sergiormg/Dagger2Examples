package com.sg.androiddagger2.modules;

import com.sg.androiddagger2.NetworkApi;
import org.junit.Test;
import static org.junit.Assert.*;

public class NetworkApiModuleTest {
    @Test
    public void getNetwork_notNull(){
        // Arrange
        NetworkApiModule networkApiModule = new NetworkApiModule();

        // Act
        NetworkApi networkApi = networkApiModule.getNetwork();

        // Assert
        assertNotNull(networkApi);
    }
}