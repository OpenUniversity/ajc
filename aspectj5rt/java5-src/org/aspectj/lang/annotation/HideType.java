package org.aspectj.lang.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE)
public @interface HideType {
	InitializationJoinpointType[] joinpoints() default { InitializationJoinpointType.PRE_INSTANCE, InitializationJoinpointType.INSTANCE, InitializationJoinpointType.CLASS, InitializationJoinpointType.ALL_WITHIN_INSTANCE, InitializationJoinpointType.ALL_WITHIN_CLASS };
}
