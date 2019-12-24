import com.wen.WenEurekaApplication;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by PC-007 on 2019/12/23.
 */
public class Test implements ITest<WenEurekaApplication> {

    private Class aClazz;

    public void Test1(){
        Type[] types = this.getClass().getGenericInterfaces();
        types = ((ParameterizedType) types[0]).getActualTypeArguments();

        aClazz = (Class) types[0];
    }

    public void systemInPrint(){
        System.out.println(aClazz);
    }
}
