package com.nnynn.dubbo.filter;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

@Activate(group = "consumer")
public class ConsumerFilter implements Filter {

    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("经过了ConsumerFilter");
        return invoker.invoke(invocation);
    }
}
