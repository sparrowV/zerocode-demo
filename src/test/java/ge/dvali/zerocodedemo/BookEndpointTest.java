package ge.dvali.zerocodedemo;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ZeroCodeUnitRunner.class)
@TargetEnv("api.properties")
public class BookEndpointTest {

    @Test
    @Scenario("book_endpoint_test.json")
    public void test_book_endpoint(){}
}
