package com.sf.aspro.hi_library.log;

public class HiLog {
    private static final String HI_LOG_PACKGE;

    static {
        String className = HiLog.class.getName();
        HI_LOG_PACKGE = className.substring(0, className.lastIndexOf("." + 1));
    }
    public static void v(Object... contents){
        log(HiLogType.V,contents);
    }
    public  static void  log()


}
