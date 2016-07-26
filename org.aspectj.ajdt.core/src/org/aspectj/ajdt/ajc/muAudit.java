package org.aspectj.ajdt.ajc;

import java.io.File;

public class muAudit implements Transformation {

    public String extension() {
	return "audit";
    }
    
    public File convert2java(File input) throws Exception {
	return input;
    }
    
}
