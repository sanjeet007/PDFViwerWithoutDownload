package com.example.pdfviwerwithoutdownload;

import android.net.Uri;

public class PDFModel {

    private String pdfName;
    private String pdfUrl;


    public PDFModel(String pdfName, String pdfUrl) {
        this.pdfName = pdfName;
        this.pdfUrl = pdfUrl;
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
}
