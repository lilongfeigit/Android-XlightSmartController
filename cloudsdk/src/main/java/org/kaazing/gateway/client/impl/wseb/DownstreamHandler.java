/**
 * Copyright (c) 2007-2014 Kaazing Corporation. All rights reserved.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.kaazing.gateway.client.impl.wseb;

import org.kaazing.gateway.client.impl.http.HttpRequestHandler;
import org.kaazing.gateway.client.util.HttpURI;

interface DownstreamHandler {
    void processConnect(DownstreamChannel downstreamChannel, HttpURI downstreamUri);
    public void processClose(DownstreamChannel channel);
    void setListener(DownstreamHandlerListener downstreamHandlerListener);
    void setNextHandler(HttpRequestHandler nextHandler);
}