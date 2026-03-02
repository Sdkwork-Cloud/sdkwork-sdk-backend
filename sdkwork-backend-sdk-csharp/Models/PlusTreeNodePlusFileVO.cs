using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusTreeNodePlusFileVO
    {
        public PlusFileVO? Data { get; set; }
        public PlusTreeNodePlusFileVO? Parent { get; set; }
        public List<PlusTreeNodePlusFileVO>? Children { get; set; }
        public int? Index { get; set; }
        public bool? Root { get; set; }
        public bool? Leaf { get; set; }
        public int? ChildrenCount { get; set; }
        public int? Depth { get; set; }
    }
}
