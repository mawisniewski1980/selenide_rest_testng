package ste.api.dto;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class StudentReq {

    @SerializedName("limit")
    private Long limit;
    @SerializedName("programme")
    private String programme;
    @SerializedName("id")
    private String id;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
