/*
 * Copyright 2010-2012 JetBrains s.r.o.
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

package org.jetbrains.k2js.test.semantics;

import org.jetbrains.k2js.test.SingleFileTranslationTest;

public final class WebDemoExamples2Test extends SingleFileTranslationTest {

    public WebDemoExamples2Test() {
        super("webDemoExamples2/");
    }

    public void testBottles() throws Exception {
        performTestWithMain("bottles", "2", "2");
        performTestWithMain("bottles", "");
    }

    public void testLife() throws Exception {
        performTestWithMain("life", "", "2");
    }

    //TODO: fails because it need code from stdlib
    @SuppressWarnings("UnusedDeclaration")
    public void _testBuilder() throws Exception {
        performTestWithMain("builder", "");
        performTestWithMain("builder", "1", "over9000");
    }
}
