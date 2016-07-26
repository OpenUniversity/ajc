package org.aspectj.ajdt.ajc;

import java.io.File;
import java.util.List;

public interface Transformation {
    String extension();
    File convert2java(File input) throws Exception;
}
