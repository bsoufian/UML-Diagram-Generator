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
		String xml = "<class name=\"" + cls.getName() + "\" >";
		
		xml += "<attributes>";
		for (Attribute a : cls.getAttributes()) {
			xml += "<attribute name=\"" + a.getName() +"\">" ; xml += "</attribute>";	
			xml += "<attribute type=\"" + a.getType() +"\">" ; xml += "</attribute>";	
			xml += "<attribute visibility=\"" + a.getVisibility() +"\">" ; xml += "</attribute>";	

			
		}
			xml += "</attributes>";
			
			
		xml += "<operations>";

		for (Operation o : cls.getOperations()) {
			xml += "<operation name=\"" +o.getName() +"\">";xml += "</operation>";
			xml += "<operation name=\"" +o.getVisibility() +"\">";xml += "</operation>";
			xml += "<operation name=\"" +o.getReturnType() +"\">";xml += "</operation>";
			xml += "<operation name=\"" +o.getParams() +"\">";xml += "</operation>";

			
			
		}
		xml += "</operations>"; 
	
		xml += "</class>";
		return xml;
	}
	
	
}
