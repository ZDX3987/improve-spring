package cn.zhangdx.common.manualproxy;

import cn.zhangdx.service.DataImportService;
import cn.zhangdx.service.impl.UserDataImportServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class DataImportJdkProxy {

    public static void main(String[] args) {
        UserDataImportServiceImpl source = new UserDataImportServiceImpl();
        DataImportService userDataImportService = (DataImportService)Proxy.newProxyInstance(UserDataImportServiceImpl.class.getClassLoader(), UserDataImportServiceImpl.class.getInterfaces(), (proxy, method, args1) -> {
            System.out.println("这是一个用户数据导入的代理前置通知" + method.getName());
            Object result = method.invoke(source, args1);
            System.out.println("这是一个用户数据导入的代理后面的通知");
            return result;
        });
        userDataImportService.doImport(Arrays.asList("JDK动态代理", "CGLIB动态代理"));
    }
}
