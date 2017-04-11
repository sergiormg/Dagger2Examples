import com.sg.dagger2.BackendService;
import com.sg.dagger2.User;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BackendServiceTest {

    @Test
    public void callServer_nullUser_false() {
        BackendService backendService = new BackendService("", null);

        boolean result = backendService.callServer();

        assertFalse(result);
    }

    @Test
    public void callServer_serverUrlNull_false() {
        BackendService backendService = new BackendService(null, mock(User.class));

        boolean result = backendService.callServer();

        assertFalse(result);
    }


    @Test
    public void callServer_serverUrlEmpty_false() {
        BackendService backendService = new BackendService("", mock(User.class));

        boolean result = backendService.callServer();

        assertFalse(result);
    }

    @Test
    public void callServer_validScenario_true() {
        BackendService backendService = new BackendService("url", mock(User.class));

        boolean result = backendService.callServer();

        assertTrue(result);
    }
}
