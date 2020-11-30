package com.sf.aspro.hi_library.log;

import androidx.annotation.NonNull;

public interface HiLogPrinter {
    void print(@NonNull HiConfig config,int level,String tag,@NonNull String printString);
}
