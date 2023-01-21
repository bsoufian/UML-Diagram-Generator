package org.mql.java.utils;

import org.mql.java.models.Attribute;
import org.mql.java.models.ClassModel;
import org.mql.java.models.Operation;

public class ClassModelXMLFormatter {
	private ClassModel cls;
	
	public ClassModelXMLFormatter(ClassModel cls) {
		this.cls = cls;
	}
	
	public String formatXML() {
		String xml = "<class name=\"" + cls.getName() + "\">";
		
		
		xml += "<attributes>";
		for (Attribute a : cls.getAttributes()) {
			xml += "<attribute name=>";
				
			xml += "</attribute>";	
		}
			xml += "</attributes>";
			
			
		xml += "<operations>";

		for (Operation o : cls.getOperations()) {
			xml += "<operation name= >";
			
			xml += "</operation>";
		}
		xml += "</operations>"; 
	
		xml += "</class>";
		return xml;
	}

}
