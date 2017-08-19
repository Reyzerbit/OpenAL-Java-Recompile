package com.jaketherey.openal_java_bundle;

import java.io.BufferedOutputStream;

/**
 *
 * @author Romain PETIT <tokazio@esyo.net>
 */
public class SourceBufferedOutputStream extends BufferedOutputStream{

    /**
     * 
     */
    private final SourceOutputStream str;
    
    /**
     * 
     * @param out
     * @param size 
     */
    public SourceBufferedOutputStream(SourceOutputStream out, int size) {
	super(out, size);
	this.str = out;
    }
    
    /**
     * 
     * @return 
     */
    public long getSamplesProcessed(){
	return str.getSamplesProcessed();
    }
}
