/*
 * Copyright (c) 2010-2016 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.business.identity;

import com.openpojo.business.annotation.BusinessKey;

/**
 * This interface defines the business equality contract between two POJOs.
 * Two POJOs are defined to be the same if all their {@link BusinessKey}s are equal.
 *
 * @author oshoukry
 */
public interface IdentityEvaluator {

  /**
   * This method is responsible for evaluating two objects as equal using the identity.
   *
   * @param first
   *     First object in the equality.
   * @param second
   *     Second object in the equality.
   * @return True if both objects are equal.
   */
  boolean areEqual(final Object first, final Object second);
}
