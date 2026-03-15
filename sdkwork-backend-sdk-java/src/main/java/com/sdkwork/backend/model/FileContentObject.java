package com.sdkwork.backend.model;

public class FileContentObject {
    private String schemaVersion;
    private String source;
    private String text;
    private Map<String, String> contents;
    private Map<String, Object> metadata;
    private GenerationContext generation;
    private List<ContentSegment> segments;
    private List<AssetReference> references;

    public String getSchemaVersion() {
        return this.schemaVersion;
    }
    
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public Map<String, String> getContents() {
        return this.contents;
    }
    
    public void setContents(Map<String, String> contents) {
        this.contents = contents;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public GenerationContext getGeneration() {
        return this.generation;
    }
    
    public void setGeneration(GenerationContext generation) {
        this.generation = generation;
    }

    public List<ContentSegment> getSegments() {
        return this.segments;
    }
    
    public void setSegments(List<ContentSegment> segments) {
        this.segments = segments;
    }

    public List<AssetReference> getReferences() {
        return this.references;
    }
    
    public void setReferences(List<AssetReference> references) {
        this.references = references;
    }
}
