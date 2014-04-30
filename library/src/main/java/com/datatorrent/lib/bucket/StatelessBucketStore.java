/*
 * Copyright (c) 2014 DataTorrent, Inc. ALL Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datatorrent.lib.bucket;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;

/**
 * {@link BucketStore} which doesn't keep any state.<br/>
 *
 * @param <T> type of bucket event
 */
public class StatelessBucketStore<T extends Bucketable & Event> implements BucketStore.ExpirableBucketStore<T>
{
  //Non check-pointed
  protected transient boolean isReady;

  public StatelessBucketStore()
  {
  }

  @SuppressWarnings("unchecked")
  @Override
  public void setNoOfBuckets(int noOfBuckets)
  {
  }

  @Override
  public void setWriteEventKeysOnly(boolean writeEventKeysOnly)
  {
  }

  @Override
  public void setup()
  {
    isReady = true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void teardown()
  {
  }

  @Override
  public boolean isReady()
  {
    return isReady;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void storeBucketData(long window, long timestamp, Map<Integer, Map<Object, T>> data) throws IOException
  {
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void deleteBucket(int bucketIdx) throws IOException
  {
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Nonnull
  public Map<Object, T> fetchBucket(int bucketIdx) throws Exception
  {
    return Maps.newHashMap();
  }

  private static transient final Logger logger = LoggerFactory.getLogger(StatelessBucketStore.class);

  @Override
  public void deleteExpiredBuckets(long time) throws IOException
  {
  }
}