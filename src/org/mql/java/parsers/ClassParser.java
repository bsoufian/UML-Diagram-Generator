package org.mql.java.parsers;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Vector;

public class ClassParser {
	
	private Class<?> targetClass;

	public ClassParser(String className) {
		try {
			this.targetClass = Class.forName(className);
		} catch (ClassNotFoundException e) {}
	}
	
	public ClassParser(Class<?> targetClass) {
		this.targetClass = targetClass;
		
	}

	public Class<?> getSuperClass(){
		return targetClass.getSuperclass();
	}
	
	public Constructor<?>[] getConstructors(){
		return targetClass.getDeclaredConstructors();
	}
	
	public Field[] getFields() {
		return targetClass.getDeclaredFields();
	}
	
	public Class<?>[] getIntefaces() {
		return targetClass.getInterfaces();
	}
	
	public Method[] getMethods() {
		return targetClass.getMethods();
	}
	
	public Class<?>[] getInnerClasses(){	
		return targetClass.getDeclaredClasses();
	}
	
	public Vector<Class<?>> getHeritageChaine(){
		Class<?> classTmp = targetClass;
		Vector<Class<?>> classes = new Vector<Class<?>>();
		while (classTmp != null) {
			classes.add(classTmp);
			classTmp = classTmp.getSuperclass();
		}
		return classes;
	}

}
