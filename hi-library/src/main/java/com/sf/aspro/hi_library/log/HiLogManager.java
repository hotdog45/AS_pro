package com.sf.aspro.hi_library.log;

import androidx.annotation.NonNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HiLogManager {
    private HiLogConfig config;
    private static HiLogManager instace;
    private List<HiLogPrinter> printers = new ArrayList<>();

    private HiLogManager(HiLogConfig config, HiLogPrinter[] printers) {
        this.config = config;
        this.printers.addAll(Arrays.asList(printers));
    }

    public static HiLogManager getInstace() {
        return instace;
    }

    public static void init(@NonNull HiLogConfig config, HiLogPrinter... printers) {
        instace = new HiLogManager(config, printers);
    }

    public HiLogConfig getConfig() {
        return config;
    }

    public List<HiLogPrinter> getPrinters() {
        return printers;
    }

    public void addPrinter(HiLogPrinter printer) {
        if (printer != null) {
            printers.remove(printer);
        }
    }

}
