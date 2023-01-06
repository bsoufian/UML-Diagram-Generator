package org.mql.java.utils;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class ReflectionUtils {

	public static Class<?> loadClass(String className, String path) {
		
		try {
			File file = new File(path);
			URL[] classPath = { file.toURI().toURL() };
			try (URLClassLoader urlclass = new URLClassLoader(classPath)) {
				return urlclass.loadClass(className );
			}
		} catch (Exception e) {
			System.out.println("Class not found");
		}
		return null;
	}

}

