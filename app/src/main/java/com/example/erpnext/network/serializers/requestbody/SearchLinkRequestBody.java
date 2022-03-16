package com.example.erpnext.network.serializers.requestbody;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchLinkRequestBody {

    @SerializedName("txt")
    @Expose
    private String txt;
    @SerializedName("doctype")
    @Expose
    private String doctype;
    @SerializedName("ignore_user_permissions")
    @Expose
    private String ignore_user_permissions;
    @SerializedName("reference_doctype")
    @Expose
    private String reference_doctype;


    public SearchLinkRequestBody(String txt, String doctype, String ignore_user_permissions, String reference_doctype) {
        this.txt = txt;
        this.doctype = doctype;
        this.ignore_user_permissions = ignore_user_permissions;
        this.reference_doctype = reference_doctype;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public String getIgnore_user_permissions() {
        return ignore_user_permissions;
    }

    public void setIgnore_user_permissions(String ignore_user_permissions) {
        this.ignore_user_permissions = ignore_user_permissions;
    }

    public String getReference_doctype() {
        return reference_doctype;
    }

    public void setReference_doctype(String reference_doctype) {
        this.reference_doctype = reference_doctype;
    }
}
