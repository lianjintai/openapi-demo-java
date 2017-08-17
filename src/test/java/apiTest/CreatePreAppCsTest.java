package apiTest;

import com.ljt.openapi.demo.demos.PreAppCsDemo;
import org.junit.Test;

public class CreatePreAppCsTest {

  @Test
  public void createCsAppTest() throws Exception {
    new PreAppCsDemo().postAppDemo();
  }



}
