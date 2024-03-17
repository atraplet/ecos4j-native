package com.ustermetrics.ecos4j;

import org.junit.jupiter.api.Test;
import org.scijava.nativelib.NativeLoader;

import java.io.IOException;

class LoadLibraryTest {

    @Test
    void loadLibrary() throws IOException {
        NativeLoader.loadLibrary("ecos");
    }

}
