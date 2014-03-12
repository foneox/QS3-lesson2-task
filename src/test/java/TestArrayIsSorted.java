import com.sun.org.apache.regexp.internal.RETest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayIsSorted {

    @Parameters({"testArray"})
    @Test
    public class ArraySort {

        @Parameters({"testArray"})
        @Test
        public void testIfArrayIsSortedMinMax(String testArray) {

            String[] arrayInString = testArray.split(" ");
            int[] testArrayInt = new int[arrayInString.length];
            int counter = 0;

            for (String str : arrayInString)
                testArrayInt[counter++] = Integer.parseInt(str);

            boolean arrayIsSorted = true;

            for(int i = 0; i < testArrayInt.length - 1; i++) {
                if(testArrayInt[i+1] < testArrayInt[i]) {
                    arrayIsSorted = false;
                    break;
                }
            }

            Assert.assertTrue(arrayIsSorted);

    }
    }
}


