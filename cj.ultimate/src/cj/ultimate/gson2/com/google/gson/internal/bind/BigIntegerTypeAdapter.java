/*
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cj.ultimate.gson2.com.google.gson.internal.bind;

import java.io.IOException;
import java.math.BigInteger;

import cj.ultimate.gson2.com.google.gson.JsonSyntaxException;
import cj.ultimate.gson2.com.google.gson.stream.JsonReader;
import cj.ultimate.gson2.com.google.gson.stream.JsonToken;
import cj.ultimate.gson2.com.google.gson.stream.JsonWriter;

/**
 * Adapts a BigInteger type to and from its JSON representation.
 *
 * @author Joel Leitch
 */
public final class BigIntegerTypeAdapter extends TypeAdapter<BigInteger> {

  @Override
  public BigInteger read(JsonReader reader) throws IOException {
    if (reader.peek() == JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    try {
      return new BigInteger(reader.nextString());
    } catch (NumberFormatException e) {
      throw new JsonSyntaxException(e);
    }
  }

  @Override
  public void write(JsonWriter writer, BigInteger value) throws IOException {
    writer.value(value);
  }
}
