package org.mql.java.examples;

import java.util.HashSet;
import java.util.Set;

import org.mql.java.parsers.ClassParser;
import org.mql.java.parsers.PackageListParsers;
import org.mql.java.parsers.PackageParser;
import org.mql.java.parsers.ProjectParser;
import org.mql.java.utils.ReflectionUtils;

public class Examples {

	public Examples() {
		exp01();
	}

	public void exp01() {
		
		 Set<String> files=new HashSet<>();
		 PackageListParsers packl = new PackageListParsers();
		 PackageListParsers.listOfPackage("src/", files);
	     System.out.println(files);
	     System.out.println("------------------------------------------- ");
	        
		ProjectParser projectParser = new ProjectParser("C:\\Users\\Dell\\eclipse-workspace\\UML Diagrams Generator");
		Set<String> projectPackages = projectParser.getAllPackages();
		for (String packageName : projectPackages) {
			PackageParser packageParser = new PackageParser(packageName, projectParser.getPath());
			Set<String> classes = packageParser.getInnerClasses();
			for (String className : classes) {
				Class<?> cls = ReflectionUtils.loadClass(className, projectParser.getPath());
				System.out.println(cls 
						);
			}
		}
	}

	public static void main(String[] args) {
		new Examples();
	}
	
	

}
