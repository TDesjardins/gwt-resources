/*
 *
 * Copyright © ${year} ${name}
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
package org.gwtproject.i18n.client;

import elemental2.core.JsArray;
import jsinterop.base.Js;
import org.gwtproject.core.client.JavaScriptObject;

public class CurrencyList_ extends CurrencyList {

  @Override
  protected CurrencyData getDefaultNative() {
    String[] arr = {"USD", "US$", "2", "US$", "$"};
    JsArray<String> result = new JsArray();
    return Js.uncheckedCast(result.push("USD", "US$", "2", "US$", "$"));
  }

  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }

  private JavaScriptObject loadMyCurrencyMapOverridesNative() {
    throw new UnsupportedOperationException("loadMyCurrencyMapOverridesNative");
  }
}
