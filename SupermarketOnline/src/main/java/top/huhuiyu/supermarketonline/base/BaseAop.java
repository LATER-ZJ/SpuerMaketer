package top.huhuiyu.supermarketonline.base;

import org.aspectj.lang.annotation.Pointcut;

/**
 * aop的基础类，配置切面
 *
 * @author DarkKnight
 *
 */
public abstract class BaseAop {
  /**
   * -控制器切面
   */
  @Pointcut("execution(public * top.huhuiyu.supermarketonline.controller..*.*(..))")
  public void controllerPointcut() {
  }

}
