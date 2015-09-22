package challenge.factory_util;

import java.util.function.Supplier;

public abstract class LazyFactory<T> implements Supplier<T>{

    private T object;

    public T get(){
        if(object == null)
            object = supply();
        return object;
    }

    protected abstract T supply();
}
