package cn.edu.bupt.ch8_4.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {
    //@Pointcut("execution(* cn.edu.bupt.ch8_4.controller.TestController .*(..))")
    //@Pointcut("within(cn.edu.bupt.ch8_4.controller.TestController)")
    @Pointcut("target(cn.edu.bupt.ch8_4.controller.TestController)")
    private void testPointCut(){

    }

    @Before("testPointCut()")
    public  void before(JoinPoint jp){
        System.out.println("Before：执行目标方法前");
    }

    @AfterReturning("testPointCut()")
    public  void afterReturning(JoinPoint jp){
        System.out.println("AfterReturning：执行目标方法返回后");

    }

    @Around("testPointCut()")
    public  Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("Around：执行目标方法前");
        Object obj = pjp.proceed();
        System.out.println("Around：执行目标方法后");
        return obj;
    }

    @AfterThrowing(value = "testPointCut()",throwing = "e")
    public  void except(Throwable e){
        System.out.println("异常通知：程序执行异常" + e.getMessage());

    }

    @After("testPointCut()")
    public  void after(){
        System.out.println("After:执行目标方法后");

    }
}
