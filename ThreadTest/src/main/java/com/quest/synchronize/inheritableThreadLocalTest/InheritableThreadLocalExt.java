package com.quest.synchronize.inheritableThreadLocalTest;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}

	/* (non-Javadoc)
	 * @see java.lang.InheritableThreadLocal#childValue(java.lang.Object)
	 * 值继承再修改（子线程可以再父线程的基础上修改值）
	 */
	@Override
	protected Object childValue(Object parentValue) {
		return parentValue+"子线程后加上的~";
	}
	
	
}
