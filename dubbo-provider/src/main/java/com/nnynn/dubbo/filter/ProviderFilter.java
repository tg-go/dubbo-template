package com.nnynn.dubbo.filter;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

import java.util.concurrent.atomic.AtomicInteger;

@Activate(group = "provider")
public class ProviderFilter implements Filter {

    private static final AtomicInteger counter = new AtomicInteger();

    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        int count = counter.incrementAndGet();
        System.out.println("当前调用了次数为" + count);
        return invoker.invoke(invocation);
    }
}
