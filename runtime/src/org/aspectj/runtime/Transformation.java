package org.aspectj.runtime;

import java.io.File;

public interface Transformation {
    String extension();
    File convert2java(File input) throws Exception;
}
