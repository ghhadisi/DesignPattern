package com.hss.pattern.struct.proxypattern.dynamic;

import com.hss.pattern.struct.proxypattern.Source;
import com.hss.pattern.struct.proxypattern.Sourceable;

import java.lang.reflect.*;

/**
 * https://www.cnblogs.com/gonjan-blog/p/6685611.html
 *
 */
public class DynamicProxyTest {


    static  class  MyInvokeHandler<T> implements InvocationHandler {
        //invocationHandler持有的被代理对象
        T target;

        public MyInvokeHandler(T target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.err.println("代理执行" +method.getName() + "方法");
            Object result = method.invoke(target,args);

            System.err.println("代理执行方法结束");
            return result;
        }
    }

    public static void main(String[] args) {
//        test1();
//        test3();
        test4();
    }


    public static void  test1(){
        Source source = new Source();
        MyInvokeHandler invokeHandler = new MyInvokeHandler<Sourceable>(source);
        Class<?> sourceProxyClass = Proxy.getProxyClass(Sourceable.class.getClassLoader(),new Class<?>[]{Sourceable.class} );

        try {
            Constructor<?> constructor = sourceProxyClass.getConstructor(InvocationHandler.class);
            Sourceable proxyInstance = (Sourceable) constructor.newInstance(invokeHandler);

            proxyInstance.method();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void test2(){
        Source source = new Source();
        MyInvokeHandler invokeHandler = new MyInvokeHandler<Sourceable>(source);
        Sourceable proxy = (Sourceable) Proxy.newProxyInstance(Sourceable.class.getClassLoader(), new Class<?>[]{Sourceable.class}, invokeHandler);
        proxy.method();
    }


    public static void test3(){

        Source source = new Source();

        Sourceable proxy = (Sourceable) Proxy.newProxyInstance(Sourceable.class.getClassLoader(), new Class<?>[]{Sourceable.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


                System.err.println("代理执行" +method.getName() + "方法");
                Object result = method.invoke(source,args);

                System.err.println("代理执行方法结束");
                return result;
            }
        });
        proxy.method();

    }

    public static void test4(){
        Source source = new Source();
        Sourceable proxy = (Sourceable) Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(), source.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


                System.err.println("代理执行" +method.getName() + "方法");
                Object result = method.invoke(source,args);

                System.err.println("代理执行方法结束");
                return result;
            }
        });
        proxy.method();
    }
}
