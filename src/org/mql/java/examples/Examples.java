package org.mql.java.examples;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.mql.java.models.Attribute;
import org.mql.java.models.ClassModel;
import org.mql.java.models.Operation;
import org.mql.java.parsers.ClassParser;
import org.mql.java.parsers.PackageListParsers;
import org.mql.java.parsers.PackageParser;
import org.mql.java.parsers.ProjectParser;
import org.mql.java.utils.ClassModelXMLFormatter;
import org.mql.java.utils.ReflectionUtils;

public class Examples {
	private List<ClassModel> projectClasses = new Vector<>();
	
	public Examples() {
		exp01();
		printClasses();
	}

	public void exp01() {
		
		 Set<String> files=new HashSet<>();
		 PackageListParsers.listOfPackage("src/", files);
	     System.out.println("***"+files+"***" );
	     System.out.println("------------------------------------------- ");
	        
		ProjectParser projectParser = new ProjectParser("C:\\Users\\Dell\\eclipse-workspace\\UML Diagrams Generator");
		Set<String> projectPackages = projectParser.getAllPackages();
		for (String packageName : projectPackages) {
			PackageParser packageParser = new PackageParser(packageName, projectParser.getPath());
			Set<String> classes = packageParser.getInnerClasses();
			for (String className : classes) {
				ClassParser classParser = new ClassParser(className);
				
				ClassModel classModel = new ClassModel(classParser.getClassName());
				classModel.setAttributes(getAttrs(classParser));
				classModel.setOperations(getOperations(classParser));
				this.projectClasses.add(classModel);
			}
		} 
  
	}
	
	public void printClasses() {
		for (ClassModel cls : projectClasses) {
			ClassModelXMLFormatter xmlFormatter = new ClassModelXMLFormatter(cls);
			String xml = xmlFormatter.formatXML();
			System.out.println(xml);
		}
	}
	
	private List<Attribute> getAttrs(ClassParser parser) {
		List<Attribute> attrs = new Vector<>();
		Field fields[] = parser.getFields();
		for (Field field : fields) {
			String modifier = Modifier.toString(field.getModifiers());
			Attribute attr = new Attribute(toUMLVisibility(modifier), field.getType().getName(), field.getName());
			attrs.add(attr);
		}
		return attrs;
	}
	
	public String toUMLVisibility(String modifier) {
		if(modifier.contains("public")) {
			return "+";
		}
		else {
			return "-";
		}
	}
	
	private List<Operation> getOperations(ClassParser parser) {
		List<Operation> ops = new Vector<>();
		Method methods[] = parser.getMethods();
		for (Method method : methods) {
			Operation op = new Operation();
			op.setName(method.getName());
			op.setReturnType(method.getReturnType().getName());
			op.setVisibility(toUMLVisibility(Modifier.toString(method.getModifiers())));
			Parameter params[] = method.getParameters();
			List<Attribute> attrs = new Vector<>();
			for (Parameter p : params) {
				String visibility = toUMLVisibility(Modifier.toString(p.getModifiers()));
				Attribute parameter = new Attribute(visibility, p.getType().getName(), p.getName());
				attrs.add(parameter);
			}
			op.setParams(attrs);
		}
		return ops;
	}

	public static void main(String[] args) {
		new Examples();
	}
	
	

}
