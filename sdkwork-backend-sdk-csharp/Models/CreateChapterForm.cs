using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CreateChapterForm
    {
        public int? ContentWorkId { get; set; }
        public int? ParentDirectoryId { get; set; }
        public string? FileName { get; set; }
        public bool? IsDirectory { get; set; }
        public string? Content { get; set; }
    }
}
