package com.sf.aspro.hi_library.log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HiConfig {
    static int MAX_LEN = 512;
//    static


    public JsonParser injectJsonParser() {
        return null;
    }

    public String getGlobalTag() {
        return "HiLog";
    }

    public boolean enable() {
        return true;
    }

    public boolean includeThread() {
        return false;
    }

    public int stackTraceDepth() {
        return 5;
    }

    public HiLogPrinter[] printers() {
        return null;
    }

    public interface JsonParser {
        String toJson(Object src);
    }


}
