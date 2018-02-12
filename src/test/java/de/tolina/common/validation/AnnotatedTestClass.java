/**
 * Copyright © 2016 arxes-tolina GmbH (entwicklung@arxes-tolina.de)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tolina.common.validation;

import static de.tolina.common.validation.TestEnum.TEST;
import static de.tolina.common.validation.TestEnum.TEST2;

@TestAnnotation
@SuppressWarnings("javadoc")
class AnnotatedTestClass extends AnnotatedAbstractTestClass implements AnnotatedTestInterface {

    @TestAnnotation(testparameter = "testvalue")
    private String fieldWithAnnotations;

    String fieldWithoutAnnotations;

    @TestAnnotation(testparameter = "testvalue", anotherTestParameter = "anotherTestValue")
    @AnotherTestAnnotation(TEST2)
    public void methodWithAnnotations() {
        // noop
    }

    @AliasTestAnnotation(referencedTestEnum = TEST2)
    public void methodWithAliasAnnotations() {
        // noop
    }

    @AliasTestAnnotation(anotherValue = TEST)
    public void methodWithAnOtherAliasAnnotations() {
        // noop
    }

    public void methodWithoutAnnotations() {
        // noop
    }

    @Override
    public void annotatedInterfaceMethod() {
        // noop
    }

    @Override
    public void annotatedInterfaceMethodForAbstractClass() {
        // noop
    }

    @Override
    protected void annotatedAbstractMethod() {
        // noop
    }

    @AnotherTestAnnotation(TEST)
    public void overloadedMethod(final String foo, final String bar) {
        // noop
    }

    public void overloadedMethod(final String foo, final int bar) {
        // noop
    }
}
