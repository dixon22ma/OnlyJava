/**
 * Example to show the overwriting of the toString() and equals() method and the implementation of the getClass()
 */
package com.onlyjava.test;

/**
 * @author OnlyJava
 *
 */
public class TestObject {
	
	/**	Object 				Value 			*/
	private Object m_Val	= null;
	/** String 				ClassName 		*/
	private String className = null;
	/** String 				SupClassName 	*/
	private String supClassName	= null;
	
	
	/**
	 * Construct
	 */
	public TestObject(Object p_Obj) {
		super();
		this.className = p_Obj.getClass().getName();
		this.supClassName = p_Obj.getClass().getSuperclass().getName();
		if(p_Obj instanceof Integer) {
			m_Val = (Integer) p_Obj;
		} else if(p_Obj instanceof Byte) {
			m_Val = (Byte) p_Obj;
		} else if(p_Obj instanceof String) {
			m_Val = (String) p_Obj;
		} else if(p_Obj instanceof Float) {
			m_Val = (Float) p_Obj;
		} else if(p_Obj instanceof Double) {
			m_Val = (Double) p_Obj;
		} else if(p_Obj instanceof Boolean) {
			m_Val = (Boolean) p_Obj;
		}
	}
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		//	Instance object to compare
		TestObject m_ObjInt = new TestObject(1);
		TestObject m_ObjString = new TestObject("1");

		System.out.println(m_ObjInt.toString());
		System.out.println(m_ObjInt.equals(m_ObjInt));
		System.out.println(m_ObjString.toString());
		System.out.println(m_ObjString.equals(m_ObjString));
		System.out.println(m_ObjString.equals(m_ObjInt));
	}
	
	@Override
	public boolean equals(Object p_Obj) {
		if ((p_Obj != null) 
				&& (p_Obj instanceof TestObject)) {
			TestObject m_Obj = (TestObject) p_Obj;
			return this.m_Val == m_Obj.m_Val;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "[ClassName= " + this.className + ", " 
				+ "SuperClassName= " + this.supClassName + "]";
	}
}
