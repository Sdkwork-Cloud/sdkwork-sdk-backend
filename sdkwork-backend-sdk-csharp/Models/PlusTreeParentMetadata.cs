using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusTreeParentMetadata
    {
        public List<int>? ParentIds { get; set; }
    }
}
