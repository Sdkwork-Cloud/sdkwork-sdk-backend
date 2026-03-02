using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusFavoriteForm
    {
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? FolderName { get; set; }
        public string? Remark { get; set; }
        public int? SortWeight { get; set; }
        public string? Title { get; set; }
        public ImageMediaResource? Image { get; set; }
        public bool? IsPrivate { get; set; }
        public string? Status { get; set; }
    }
}
