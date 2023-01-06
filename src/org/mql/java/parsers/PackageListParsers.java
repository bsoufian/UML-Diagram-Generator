package org.mql.java.parsers;

import java.io.File;
import java.util.Set;

public class PackageListParsers {
	
		 public static void listOfPackage(String directoryName, Set<String> pack) {
		        File directory = new File(directoryName);
		        File[] fList = directory.listFiles();
		        for (File file : fList) {
		            if (file.isFile()) {
		                String path=file.getPath();
		                String packName=path.substring(path.indexOf("src")+4, path.lastIndexOf('\\'));
		                pack.add(packName.replace('\\', '.'));
		            } else if (file.isDirectory()) {

		                listOfPackage(file.getAbsolutePath(), pack);
		            }
		        }
		   }
}


