/*
 * Copyright (c) 2014 DataTorrent, Inc. ALL Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datatorrent.lib.datamodel.operation;

import junit.framework.Assert;

import org.junit.Test;

public class CountOperationTest
{

  @Test
  public void test()
  {
    long countV = 0;
    CountOperation count = new CountOperation();
    countV = count.compute(countV, null);
    Assert.assertEquals(1, countV);
    countV = count.compute(countV, null);
    Assert.assertEquals(2, countV);
  }
}
