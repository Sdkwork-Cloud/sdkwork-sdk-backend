using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class TagsContent
    {
        public List<string>? Tags { get; set; }
        public List<TagsContent>? Children { get; set; }
    }
}
