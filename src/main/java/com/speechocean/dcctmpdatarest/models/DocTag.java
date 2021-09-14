package com.speechocean.dcctmpdatarest.models;

import java.io.Serializable;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "文本Tag")
public class DocTag implements Serializable
{
    @ApiModelProperty("primary key")
    private String _id;

    @ApiModelProperty("Tag name")
    private String name;

    @ApiModelProperty("Tag description")
    private String description;
    
    @ApiModelProperty("Tag type")
    private String type;
    
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "DbTags [_id=" + _id + ", name=" + name + ", description=" + description + ", type=" + type + "]";
    }
}
