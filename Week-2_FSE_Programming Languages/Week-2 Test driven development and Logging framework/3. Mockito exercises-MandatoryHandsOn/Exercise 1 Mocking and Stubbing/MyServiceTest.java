package example;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest {
	@Test
    public void testExternalApi() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);                 // Step 1
        when(mockApi.getData()).thenReturn("Mock Data");                      // Step 2
        MyService service = new MyService(mockApi);                           // Step 3
        String result = service.fetchData();                                  // Use mock
        assertEquals("Mock Data", result);                                    // Assert result
    }
}
