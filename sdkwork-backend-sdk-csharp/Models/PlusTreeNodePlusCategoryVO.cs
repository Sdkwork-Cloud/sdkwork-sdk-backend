using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusTreeNodePlusCategoryVO
    {
        public PlusCategoryVO? Data { get; set; }
        public PlusTreeNodePlusCategoryVO? Parent { get; set; }
        public List<PlusTreeNodePlusCategoryVO>? Children { get; set; }
        public int? Index { get; set; }
        public bool? Root { get; set; }
        public bool? Leaf { get; set; }
        public int? ChildrenCount { get; set; }
        public int? Depth { get; set; }
    }
}
