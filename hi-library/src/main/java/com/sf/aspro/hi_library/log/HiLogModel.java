package com.sf.aspro.hi_library.log;

import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class HiLogModel {
    private static SimpleFormatter sdf = new SimpleFormatter("yy-MM-dd HH:mm:ss", Locale.CANADA);
    public long timeMillis;
    public int level;
    public String tag;
    public String log;

    public HiLogModel(long timeMillis, int level, String tag, String log) {
        this.timeMillis = timeMillis;
        this.level = level;
        this.tag = tag;
        this.log = log;
    }

    public String flattenedLog() {
        return getFlatted() + "\n" + log;
    }

    public String getFlatted() {
        return format(timeMillis) + "|" + level + "|" + tag + "|:";
    }

    public String format(long timeMillis) {
        return sdf.format(timeMillis);
    }


}
