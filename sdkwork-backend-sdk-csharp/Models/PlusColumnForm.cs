using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusColumnForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? DataType { get; set; }
        public string? ColumnType { get; set; }
        public int? OrdinalPosition { get; set; }
        public bool? IsNullable { get; set; }
        public bool? IsPrimaryKey { get; set; }
        public bool? IsAutoIncrement { get; set; }
        public string? DefaultValue { get; set; }
        public string? Comment { get; set; }
        public string? CharacterSet { get; set; }
        public string? CollationRule { get; set; }
        public int? TableId { get; set; }
    }
}
