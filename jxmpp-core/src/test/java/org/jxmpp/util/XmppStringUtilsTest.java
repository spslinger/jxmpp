/**
 *
 * Copyright © 2014 Florian Schmaus
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
package org.jxmpp.util;

import static org.junit.Assert.assertEquals;

import org.jxmpp.util.XmppStringUtils;
import org.junit.Test;

public class XmppStringUtilsTest {

	@Test
	public void parseLocalpart() {
		String error = "Error parsing node name";
		assertEquals(error, "", XmppStringUtils.parseLocalpart("yahoo.myjabber.net"));
		assertEquals(error, "", XmppStringUtils.parseLocalpart("yahoo.myjabber.net/registred"));
		assertEquals(error, "user", XmppStringUtils.parseLocalpart("user@yahoo.myjabber.net/registred"));
		assertEquals(error, "user", XmppStringUtils.parseLocalpart("user@yahoo.myjabber.net"));
	}

	@Test
	public void parseDomain() {
		String error = "Error parsing server name";
		String result = "yahoo.myjabber.net";
		assertEquals(error, result, XmppStringUtils.parseDomain("yahoo.myjabber.net"));
		assertEquals(error, result, XmppStringUtils.parseDomain("yahoo.myjabber.net/registred"));
		assertEquals(error, result, XmppStringUtils.parseDomain("user@yahoo.myjabber.net/registred"));
		assertEquals(error, result, XmppStringUtils.parseDomain("user@yahoo.myjabber.net"));
	}
}
