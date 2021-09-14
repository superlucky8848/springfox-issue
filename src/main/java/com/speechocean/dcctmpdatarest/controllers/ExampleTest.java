package com.speechocean.dcctmpdatarest.controllers;

import java.util.ArrayList;
import java.util.List;

import com.speechocean.dcctmpdatarest.models.DocTag;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;

@RestController
@Api(tags="ExampleTest")
@RequestMapping("example_test")
public class ExampleTest 
{
    private static final String EXAMPLE_ADD_TAGS = "[\n"
        + "\t{\n\t\t\"name\": \"tag1\",\n\t\t\"type\": \"test\",\n\t\t\"description\": \"Some description\"\n\t},\n"
        + "\t{\n\t\t\"name\": \"tag2\",\n\t\t\"type\": \"test\"\n\t},\n"
        + "\t{\n\t\t\"name\": \"tag3\"\n\t}\n]";
    private static final String EXAMPLE_UPDATE_TAGS = "{\n"
        + "\t\"_id\": \"6108d4bbb5ae3180b0c640c1\",\n" 
        + "\t\"name\": \"conversation\",\n" 
        + "\t\"type\": \"general\",\n"
        + "\t\"description\": \"Some description\"\n}";

    
    @ApiOperation(value = "Add Tags(example)", notes = "Add tags in body, with no _id.")
    @PostMapping(value = "/addTags1")
    public List<DocTag> addTags1(
        @ApiParam(value = "tags array", required = true, example = EXAMPLE_ADD_TAGS) 
        @RequestBody(required = true) final List<DocTag> tags)
    {
        List<DocTag> result = new ArrayList<DocTag>();
        return result;
    }

    @ApiOperation(value = "Update Tag(example)", notes = "Update tag in body, must have _id")
    @PostMapping(value = "/updateTag1")
    public DocTag updateTag1(
        @ApiParam(value = "tag to update，must have _id", required = true, example = EXAMPLE_ADD_TAGS)
        @RequestBody(required = true) final DocTag tag)
    {
        DocTag result = new DocTag();
        return result;
    }

    @ApiOperation(value = "Add Tags(examples)", notes = "Add tags in body, with no _id.")
    @PostMapping(value = "/addTags2")
    public List<DocTag> addTags2(
        @ApiParam(value = "tags array", required = true, 
        examples = @Example({@ExampleProperty(mediaType = "application/json", value = EXAMPLE_ADD_TAGS)}))
        @RequestBody(required = true) final List<DocTag> tags)
    {
        List<DocTag> result = new ArrayList<DocTag>();
        return result;
    }

    @ApiOperation(value = "Update Tag(examples)", notes = "Update tag in body, must have _id")
    @PostMapping(value = "/updateTag2")
    public DocTag updateTag2(
        @ApiParam(value = "tag to update，must have _id", required = true,
        examples = @Example({@ExampleProperty(mediaType = "application/json", value = EXAMPLE_UPDATE_TAGS)}))
        @RequestBody(required = true) final DocTag tag)
    {
        DocTag result = new DocTag();
        return result;
    }

    @ApiOperation(value = "Add Tags(examples implicit)", notes = "Add tags in body, with no _id.")
    @ApiImplicitParams({@ApiImplicitParam(
        name = "tags",
        type = "List<DocTag>",
        examples = @Example({@ExampleProperty(mediaType = "application/json", value = EXAMPLE_ADD_TAGS)})
    )})

    @PostMapping(value = "/addTags3")
    public List<DocTag> addTags3(
        @ApiParam(value = "tags array", required = true) 
        @RequestBody(required = true) final List<DocTag> tags)
    {
        List<DocTag> result = new ArrayList<DocTag>();
        return result;
    }

    @ApiOperation(value = "Update Tag(examples implicit)", notes = "Update tag in body, must have _id")
    @ApiImplicitParams({@ApiImplicitParam(
        name = "tag",
        type = "DocTag",
        examples = @Example({@ExampleProperty(mediaType = "application/json", value = EXAMPLE_ADD_TAGS)})
    )})
    @PostMapping(value = "/updateTag3")
    public DocTag updateTag3(
        @ApiParam(value = "tag to update，must have _id", required = true)
        @RequestBody(required = true) final DocTag tag)
    {
        DocTag result = new DocTag();
        return result;
    }
}
