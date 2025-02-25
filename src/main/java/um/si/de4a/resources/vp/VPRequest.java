package um.si.de4a.resources.vp;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class VPRequest {
    @SerializedName("my_did")
    private String myDID;

    @SerializedName("request_presentation")
    private RequestPresentationObj requestPresentationObj;

    @SerializedName("their_did")
    private String theirDID;

    public VPRequest(String myDID, RequestPresentationObj requestPresentationObj, String theirDID) {
        this.myDID = myDID;
        this.requestPresentationObj = requestPresentationObj;
        this.theirDID = theirDID;
    }

    public String getMyDID() {
        return myDID;
    }

    public void setMyDID(String myDID) {
        this.myDID = myDID;
    }

    public RequestPresentationObj getRequestPresentationObj() {
        return requestPresentationObj;
    }

    public void setRequestPresentationObj(RequestPresentationObj requestPresentationObj) {
        this.requestPresentationObj = requestPresentationObj;
    }

    public String getTheirDID() {
        return theirDID;
    }

    public void setTheirDID(String theirDID) {
        this.theirDID = theirDID;
    }
}

class RequestPresentationObj {

    private ArrayList<Format> formats;
    @SerializedName("request_presentations~attach")
    private ArrayList<RequestVPAttach> requestVPAttaches;

    public RequestPresentationObj(ArrayList<Format> formats, ArrayList<RequestVPAttach> requestVPAttaches) {
        this.formats = formats;
        this.requestVPAttaches = requestVPAttaches;
    }

    public ArrayList<Format> getFormats() {
        return formats;
    }

    public void setFormats(ArrayList<Format> formats) {
        this.formats = formats;
    }

    public ArrayList<RequestVPAttach> getRequestVPAttaches() {
        return requestVPAttaches;
    }

    public void setRequestVPAttaches(ArrayList<RequestVPAttach> requestVPAttaches) {
        this.requestVPAttaches = requestVPAttaches;
    }


    /*@SerializedName("@type")
    private String type;
    private String comment;
    private ArrayList<Format> formats;
    @SerializedName("request_presentations~attach")
    private ArrayList<RequestPresentationAttachObj> requestPresentationAttachObjs;
    public RequestPresentationObj(){}

    public RequestPresentationObj(ArrayList<RequestPresentationAttachObj> requestPresentationAttachObjs) {
        this.requestPresentationAttachObjs = requestPresentationAttachObjs;
    }

    public RequestPresentationObj(String type, String comment, ArrayList<Format> formats, ArrayList<RequestPresentationAttachObj> requestPresentationAttachObjs) {
        this.type = type;
        this.comment = comment;
        this.formats = formats;
        this.requestPresentationAttachObjs = requestPresentationAttachObjs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ArrayList<Format> getFormats() {
        return formats;
    }

    public void setFormats(ArrayList<Format> formats) {
        this.formats = formats;
    }

    public ArrayList<RequestPresentationAttachObj> getRequestPresentationAttachObjs() {
        return requestPresentationAttachObjs;
    }

    public void setRequestPresentationAttachObjs(ArrayList<RequestPresentationAttachObj> requestPresentationAttachObjs) {
        this.requestPresentationAttachObjs = requestPresentationAttachObjs;
    }

     */
}

class Format {
    @SerializedName("attach_id")
    private String attachId;
    private String format;

    public Format(String attachId, String format) {
        this.attachId = attachId;
        this.format = format;
    }

    public String getAttachId() {
        return attachId;
    }

    public void setAttachId(String attachId) {
        this.attachId = attachId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
