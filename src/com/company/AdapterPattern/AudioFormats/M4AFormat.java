package com.company.AdapterPattern.AudioFormats;

public class M4AFormat implements IFormat{
    private String formatName = "M4A";
    private String formatCode;

    public M4AFormat(WAVFormat wavFormat) {
        formatCode = wavFormat.getFormatCode();
        encode();
    }

    @Override
    public String encode() {
        formatCode += "-TTD8-4H85-8LCJ-4VCF";
        return formatCode;
    }

    @Override
    public String getFormatInfo() {
        return formatName;
    }
}
