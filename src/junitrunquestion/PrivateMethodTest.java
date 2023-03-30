package junitrunquestion;
import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.powermock.reflect.Whitebox;

@ExtendWith(MockitoExtension.class)
public class PrivateMethodTest {

	// @Mock
	// private PrivateMethodApp app;

	@InjectMocks
	private PrivateMethodApp app = new PrivateMethodApp();

	@Test
	public void testPrivateMethodUsingReflection() throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = PrivateMethodApp.class.getDeclaredMethod("pvMethod", Integer.class);
		method.setAccessible(true);
		method.invoke(app, 10);
	}

	@Test
	public void testPrivateMethodUsingPowerMock() throws Exception {
		Whitebox.invokeMethod(app, "pvMethod", 10);
	}

}