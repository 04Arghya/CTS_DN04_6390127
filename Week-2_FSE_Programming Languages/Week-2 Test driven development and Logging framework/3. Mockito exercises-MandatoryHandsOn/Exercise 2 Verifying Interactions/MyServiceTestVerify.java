package example;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;
public class MyServiceTestVerify {
	
	@Test
	public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);  
        MyService service = new MyService(mockApi);
        
        service.fetchData();                                    
        
        verify(mockApi).getData();                              
        System.out.println("Verified that getData() was called.");  
    }
}
