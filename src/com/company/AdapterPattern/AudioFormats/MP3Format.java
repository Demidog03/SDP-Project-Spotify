package com.company.AdapterPattern.AudioFormats;

public class MP3Format implements IFormat {
    private String formatName = "MP3";
    private String formatCode;
//    private WAVFormat wavFormat;

    public MP3Format(WAVFormat wavFormat) {
        formatCode = wavFormat.getFormatCode();
        encode();
    }

    @Override
    public String encode() {
        formatCode += "-6ETI-UIL2-9WAX-XHYO";
        return formatCode;
    }

    @Override
    public String getFormatInfo() {
        return formatName;
    }

    public String getFormatName() {
        return formatName;
    }
   
}
