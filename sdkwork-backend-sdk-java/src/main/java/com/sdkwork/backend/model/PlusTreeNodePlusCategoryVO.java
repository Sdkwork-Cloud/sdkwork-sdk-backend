package com.sdkwork.backend.model;

public class PlusTreeNodePlusCategoryVO {
    private PlusCategoryVO data;
    private PlusTreeNodePlusCategoryVO parent;
    private List<PlusTreeNodePlusCategoryVO> children;
    private Integer index;
    private Boolean root;
    private Boolean leaf;
    private Integer depth;
    private Integer childrenCount;

    public PlusCategoryVO getData() {
        return this.data;
    }
    
    public void setData(PlusCategoryVO data) {
        this.data = data;
    }

    public PlusTreeNodePlusCategoryVO getParent() {
        return this.parent;
    }
    
    public void setParent(PlusTreeNodePlusCategoryVO parent) {
        this.parent = parent;
    }

    public List<PlusTreeNodePlusCategoryVO> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<PlusTreeNodePlusCategoryVO> children) {
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

    public Integer getDepth() {
        return this.depth;
    }
    
    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getChildrenCount() {
        return this.childrenCount;
    }
    
    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }
}
