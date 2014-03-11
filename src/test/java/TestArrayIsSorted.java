/**
 * Created by Sergii on 3/11/14.
 * [home task]
 Тестирование сортировки массива по возрастанию. Предавать массив для тестирования через data provider, или parameters.
 */
        import org.testng.Assert;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Parameters;
        import org.testng.annotations.Test;

public class TestArrayIsSorted {
    @DataProvider(name = "test1")
    public Object[][] provideData(){
        return new Object[][]{
                {10, 10},
                {100,100},
                {200,210}
        };
    }
    @Test(dataProvider = "test1")
    public void testingTest2(int value1, int value2){
//System.out.println("New TEST!!!! "+ param1 +param2);
        Assert.assertEquals(value1, value2);
    }
}
