package com.quest.defautThreadLocalValue;

import java.util.Date;

/**
 * @author Quest
 * 初始化ThreadLocal的返回值
 *
 */
public class ThreadLocalExt extends ThreadLocal {

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
	
}
