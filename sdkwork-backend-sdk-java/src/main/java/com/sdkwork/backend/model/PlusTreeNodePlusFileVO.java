package com.sdkwork.backend.model;

public class PlusTreeNodePlusFileVO {
    private PlusFileVO data;
    private PlusTreeNodePlusFileVO parent;
    private List<PlusTreeNodePlusFileVO> children;
    private Integer index;
    private Boolean root;
    private Boolean leaf;
    private Integer childrenCount;
    private Integer depth;

    public PlusFileVO getData() {
        return this.data;
    }
    
    public void setData(PlusFileVO data) {
        this.data = data;
    }

    public PlusTreeNodePlusFileVO getParent() {
        return this.parent;
    }
    
    public void setParent(PlusTreeNodePlusFileVO parent) {
        this.parent = parent;
    }

    public List<PlusTreeNodePlusFileVO> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<PlusTreeNodePlusFileVO> children) {
        this.children = children;
    }

    public Integer getIndex() {
        return this.index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Boolean getRoot() {
        return this.root;
    }
    
    public void setRoot(Boolean root) {
        this.root = root;
    }

    public Boolean getLeaf() {
        return this.leaf;
    }
    
    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Integer getChildrenCount() {
        return this.childrenCount;
    }
    
    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }

    public Integer getDepth() {
        return this.depth;
    }
    
    public void setDepth(Integer depth) {
        this.depth = depth;
    }
}
