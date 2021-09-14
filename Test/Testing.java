import Map.Practice8;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Assert;
import org.junit.Test;

public class Testing {

    @Test
    public void MaxDigit(){
        Practice8 practice8= new Practice8();
        int m= practice8.highestDigit(702);
        Assert.assertTrue(m==7);
    }

    @Test
    public void failTest(){
        Practice8 practice8= new Practice8();
        int x= practice8.highestDigit(301);
        Assert.assertTrue(x==1);
    }


}
