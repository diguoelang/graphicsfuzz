/*
 * Copyright 2018 The GraphicsFuzz Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.graphicsfuzz.reducer;

import com.graphicsfuzz.common.ast.TranslationUnit;
import com.graphicsfuzz.common.util.UniformsInfo;
import java.io.File;
import java.io.FileNotFoundException;

public interface IReductionState {

  boolean hasFragmentShader();

  boolean hasVertexShader();

  TranslationUnit getFragmentShader();

  TranslationUnit getVertexShader();

  UniformsInfo getUniformsInfo();

}
