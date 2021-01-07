package com.nnynn.dubbo.provider;

import com.nnynn.dubbo.api.EchoService;
import org.apache.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EchoServiceImpl implements EchoService {
    public String echo(String name) {
        String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("[" + now + "]Hello " + name + ",request form consumer:" + RpcContext.getContext().getRemoteAddress());
        return name;
    }
}
