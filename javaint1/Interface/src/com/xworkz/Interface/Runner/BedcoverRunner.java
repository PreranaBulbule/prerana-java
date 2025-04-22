package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Bedcover;
import com.xworkz.Interface.Internal.CottonBedcoverPackagerImpl;

public class BedcoverRunner {
    public static void main(String[] args) {
        CottonBedcoverPackagerImpl packager = new CottonBedcoverPackagerImpl();
        Bedcover bedcover = new Bedcover(packager);
        bedcover.startPackaging();
    }
}
