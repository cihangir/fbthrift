/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

include "thrift/lib/thrift/schema.thrift"
include "thrift/lib/thrift/protocol.thrift"
include "thrift/lib/thrift/id.thrift"

namespace py3 apache.thrift

/**
 * Information about a thrift source file.
 */
struct SourceInfo {
  // A source file name. It can include directory components and/or be a
  // virtual file name that doesn't have a correspondent entry in the system's
  // directory structure.
  // Preserves the legacy behavior of sometimes leaking resolved relative paths.
  // The unmodified path is available inside schema.Program.
  1: string fileName;

  /**
   * Per-language include statements.
   */
  2: map<string, list<id.ValueId>> languageIncludes;

  /**
   * Per-language namespace.
   */
  3: map<string, id.ValueId> namespaces;
}

// A thrift schema that corresponds to one or more thrift files.
@cpp.UseOpEncode
struct Ast {
  /**
  * The programs included in the schema, accessible by `ProgramId`.
   * The first program in the program list must be the main file,
   * with (recursively) included programs listed after it.
  */
  1: schema.ProgramList programs;

  /** The values, accessible by `ValueId`. */
  2: list<protocol.Value> values;

  /** The definitions, accessible by `DefinitionId`. */
  4: schema.DefinitionList definitions;

  /**
   * DEPRECATED! Get the information from the Program struct.
   * Information about the files holding the thrift definitions.
   */
  5: map<id.ProgramId, SourceInfo> sources;
}
