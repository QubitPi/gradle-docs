/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress(
    "unused",
    "nothing_to_inline",
    "useless_cast",
    "unchecked_cast",
    "extension_shadowed_by_member",
    "redundant_projection",
    "RemoveRedundantBackticks",
    "ObjectPropertyName",
    "deprecation",
    "detekt:all"
)
@file:org.gradle.api.Generated

package org.gradle.kotlin.dsl


/**
 * Kotlin extension function taking [kotlin.reflect.KClass] for [org.gradle.api.file.ContentFilterable.filter].
 *
 * @see org.gradle.api.file.ContentFilterable.filter
 */
inline fun org.gradle.api.file.ContentFilterable.`filter`(`filterType`: kotlin.reflect.KClass<out java.io.FilterReader>, vararg `properties`: Pair<String, Any>): org.gradle.api.file.ContentFilterable =
    `filter`(mapOf(*`properties`), `filterType`.java)


/**
 * Kotlin extension function taking [kotlin.reflect.KClass] for [org.gradle.api.file.ContentFilterable.filter].
 *
 * @see org.gradle.api.file.ContentFilterable.filter
 */
inline fun org.gradle.api.file.ContentFilterable.`filter`(`filterType`: kotlin.reflect.KClass<out java.io.FilterReader>): org.gradle.api.file.ContentFilterable =
    `filter`(`filterType`.java)


/**
 * Kotlin extension function for [org.gradle.api.file.ContentFilterable.expand].
 *
 * @see org.gradle.api.file.ContentFilterable.expand
 */
inline fun org.gradle.api.file.ContentFilterable.`expand`(vararg `properties`: Pair<String, Any>): org.gradle.api.file.ContentFilterable =
    `expand`(mapOf(*`properties`))


/**
 * Kotlin extension function for [org.gradle.api.file.ContentFilterable.expand].
 *
 * @see org.gradle.api.file.ContentFilterable.expand
 * @since 7.2
 */
inline fun org.gradle.api.file.ContentFilterable.`expand`(vararg `properties`: Pair<String, Any>, `action`: org.gradle.api.Action<in org.gradle.api.file.ExpandDetails>): org.gradle.api.file.ContentFilterable =
    `expand`(mapOf(*`properties`), `action`)

