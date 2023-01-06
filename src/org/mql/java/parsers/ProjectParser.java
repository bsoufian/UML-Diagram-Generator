package org.mql.java.parsers;

import java.io.File;
import java.util.Set;

import org.mql.java.enums.FilesType;
import org.mql.java.utils.FileUtils;

public class ProjectParser {

	private final String targetProject;
	private final String path;

	public ProjectParser(String path) {
		this.targetProject = path.substring(path.lastIndexOf("\\") + 1);
		this.path = path + "\\bin\\";
	}

	public Set<String> getAllPackages() {
		return FileUtils.findFiles(path, FilesType.ALL_PACKAGES, "");
	}

	public String getTargetProject() {
		return targetProject;
	}

	public String getPath() {
		return path;
	}
}
