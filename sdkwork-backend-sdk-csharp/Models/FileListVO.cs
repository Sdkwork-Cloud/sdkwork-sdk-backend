using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class FileListVO
    {
        public List<FileItemVO>? Data { get; set; }
        public string? Object { get; set; }
    }
}
