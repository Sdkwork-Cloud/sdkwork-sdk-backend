using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class FunctionTool
    {
        public string? Type { get; set; }
        public Function? Function { get; set; }
    }
}
