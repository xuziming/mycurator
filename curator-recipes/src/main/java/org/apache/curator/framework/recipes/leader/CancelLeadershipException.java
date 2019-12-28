/**
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
package org.apache.curator.framework.recipes.leader;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.state.ConnectionState;

/**
 * When thrown from
 * {@link LeaderSelectorListener#stateChanged(CuratorFramework, ConnectionState)},
 * will cause {@link LeaderSelector#interruptLeadership()} to get called.
 * IMPORTANT: this is only supported when thrown from
 * {@link LeaderSelectorListener#stateChanged(CuratorFramework, ConnectionState)}.
 */
public class CancelLeadershipException extends RuntimeException {
	private static final long serialVersionUID = -944200342772644788L;

	public CancelLeadershipException() {}

	public CancelLeadershipException(String message) {
		super(message);
	}

	public CancelLeadershipException(String message, Throwable cause) {
		super(message, cause);
	}

	public CancelLeadershipException(Throwable cause) {
		super(cause);
	}
}