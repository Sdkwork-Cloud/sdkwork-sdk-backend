using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCollectionItemForm
    {
        public int? CollectionId { get; set; }
        public string? CollectionUuid { get; set; }
        public string? Type { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? ContentUuid { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public int? Position { get; set; }
        public bool? IsPinned { get; set; }
        public string? Tags { get; set; }
        public string? ExtraData { get; set; }
    }
}
