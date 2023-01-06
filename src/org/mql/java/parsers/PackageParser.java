package org.mql.java.parsers;

import java.io.File;
import java.util.Set;

import org.mql.java.enums.FilesType;
import org.mql.java.utils.FileUtils;

public class PackageParser {

	
		private final String targetPackage;
		private final String path;

		public PackageParser(String targetPackage, String path) {
			this.targetPackage = targetPackage;
			this.path = path;
		}

		public Set<String> getInnerPackages() {
			return FileUtils.findFiles(path, FilesType.INNER_PACKAGES, targetPackage);
		}

		public Set<String> getInnerClasses() {
			return FileUtils.findFiles(path, FilesType.INNER_CLASSES, targetPackage);
		}
	}