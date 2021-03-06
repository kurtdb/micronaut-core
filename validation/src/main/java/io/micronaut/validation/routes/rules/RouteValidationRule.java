/*
 * Copyright 2017-2019 original authors
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
package io.micronaut.validation.routes.rules;

import io.micronaut.http.uri.UriMatchTemplate;
import io.micronaut.inject.ast.ParameterElement;
import io.micronaut.validation.routes.RouteValidationResult;

/**
 * Describes a rule to validate a route.
 *
 * @author James Kleeh
 * @since 1.0
 */
public interface RouteValidationRule {

    /**
     * Validate the given uri template and route arguments.
     *
     * @param template The URI match template
     * @param parameters The route parameters
     * @return A {@link RouteValidationResult}
     */
    RouteValidationResult validate(UriMatchTemplate template, ParameterElement[] parameters);

}
