package com.speechocean.dcctmpdatarest.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This is a helper class for providing an alternate class
 * for @ApiImplicitParam to provide right example code. As
 * a workaround for @ApiImplicitParam#examples not generate
 * the right code.
 */
public class ApiHelper 
{
    /**
     * Note that these classes just for generatng the example
     * code, so no description or value need to set. Just example
     * will be suffice. Also these classes will never be used in
     * code, so no getter/setter or construtor is need, you can use
     * just public fields.
     */
    // With _id for update
    @ApiModel
    public class DocTagUpdateExample
    {
        @ApiModelProperty(example = "6108d4bbb5ae3180b0c640c1")
        public String _id;

        @ApiModelProperty(example = "conversation")
        public String name;

        @ApiModelProperty(example = "Some description")
        public String description;
        
        @ApiModelProperty(example = "general")
        public String type;
    }

    // Without _id for insert
    @ApiModel
    public class DocTagInsertExample
    {
        @ApiModelProperty(example = "conversation")
        public String name;

        @ApiModelProperty(example = "Some description")
        public String description;
        
        @ApiModelProperty(example = "general")
        public String type;
    }
}
